import java.util.Stack;
 

public class BinaryTree{
    
     Node root;
     
 
     
        void preOrderTraversal()
     {
        System.out.println("This is preorder Traversal");
         if(root == null)
          return;
          Stack<Node> stack = new Stack<Node>();
          stack.push(root);
          while(!stack.empty())
          {
              Node currentNode = stack.peek();
              System.out.println(currentNode.data);
              stack.pop();
              if(currentNode.right != null)
              stack.push(currentNode.right);
              if(currentNode.left != null)
              stack.push(currentNode.left);
          }
     }
     
         void inOrderTraversal()
     {
         System.out.println("This is inOrder Traversal");
         if(root == null)
          return;
          Stack<Node> stack = new Stack<Node>();
          stack.push(root);
         while(!stack.empty())
         {
          while(root.left != null)
          {
             
             stack.push(root.left);
             root = root.left;
          }
             root = stack.peek();
             System.out.println(root.data);
             stack.pop();
             if(root.right != null)
             {
                 stack.push(root.right);
                 root = root.right;
             }
       }   
         
     }
     
       void postOrderTraversal()
     {
        System.out.println("This is postorder Traversal");
         if(root == null)
          return;
          Stack<Node> stack = new Stack<Node>();
         stack.push(root);
          while(!stack.empty())
          {
             
               while(root.left != null)
          {
             
             stack.push(root.left);
             root = root.left;
          }
          root = stack.peek();
             System.out.println(root.data);
             stack.pop();
          }
     }

     public static void main(String []args){
        System.out.println("Tree Problem");
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
     //  tree.preOrderTraversal();
     //  tree.inOrderTraversal();
         tree.postOrderTraversal();
     }
   }
  class Node
     {
         int data;
         Node right,left;
         
         Node(int val)
         {
             this.data = val;
             right = left = null;
         }
     }
