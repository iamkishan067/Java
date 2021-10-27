import java.util.*;


// Pre, In & Post traversal of binary tree
// T.C = O(3n)
// S.C = O(4n)

public class MyClass {
    public static void main(String args[]) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(4);
        root.left.left.right.right = new TreeNode(5);
        root.left.left.right.right.right = new TreeNode(6);
        root.right.left = new TreeNode(8);
    
        
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));
        
        while(!stack.empty()){
            Pair temp = stack.pop();
            
            if(temp.num == 1){
                pre.add(temp.node.val);
                temp.num++;
                stack.push(temp);
                
                if(temp.node.left != null){
                    stack.push(new Pair(temp.node.left, 1));
                }
                
            }else if(temp.num == 2){
                in.add(temp.node.val);
                temp.num++;
                stack.push(temp);
                
                if(temp.node.right != null){
                    stack.push(new Pair(temp.node.right, 1));
                }
            }else{
                post.add(temp.node.val);
            }
        }
        
        
        System.out.println("Pre " + pre);
        System.out.println("In " + in);
        System.out.println("Post " + post);
        
    }
}

// Definition for pair used in the stack
class Pair{
    TreeNode node;
    int num;
    Pair(){}
    Pair(TreeNode node, int num){
        this.node = node;
        this.num = num;
    }
}

//Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 


//Output
/*
Pre [1, 2, 3, 4, 5, 6, 7, 8]
In [3, 4, 5, 6, 2, 1, 8, 7]
Post [6, 5, 4, 3, 2, 8, 7, 1]
*/
