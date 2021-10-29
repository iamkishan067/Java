// Problem :- https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1#

class Solution
{
	ArrayList <Integer> printBoundary(Node node)
	{
	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(node.data);
	    leftBoundary(node.left, list);
	    leafNode(node, list);
	    rightBoundary(node.right, list);
	    
	    return list;
	}
	
	// Left Boundary traversal
	public void leftBoundary(Node node, ArrayList<Integer> list){
	    if(node == null) return;
	    
	    if(node.left != null){
	        list.add(node.data);
	        leftBoundary(node.left, list);
	    }else if(node.right != null){
	        list.add(node.data);
	        leftBoundary(node.right, list);
	    }
	    
	}
	
	// Leaf node traversal using inorder traversal
	public void leafNode(Node node, ArrayList<Integer> list){
	    if(node == null) return;
	    
	    leafNode(node.left, list);
	    if(node.left == null && node.right == null) list.add(node.data);
	    leafNode(node.right, list);
	    
	}
	
	// Right Boundary traversal
	public void rightBoundary(Node node, ArrayList<Integer> list){
	    if(node == null) return;
	    
	    if(node.right != null){
	        rightBoundary(node.right, list);
	        list.add(node.data);
	    }else if(node.left != null){
	        rightBoundary(node.left, list);
	        list.add(node.data);
	    }
	}
	
	
}
