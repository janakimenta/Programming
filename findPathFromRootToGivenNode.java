/* get the path from 1 to 7

        1
    2       3
4       5 6     7

Answer is 1-3-7

Use stack pre-Order traversal using stack
First take stack and send 1 then go left of 1 and put that value into stack [1 2] again go left of 2 and put [1 2 4] into statck
4 ha sno children so check if given value is 4.
if not pop off from stack
not at 2 both its children are visited, so pop off from stack
not put 3 into the stack and so on...
*/

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
public class SubTree{
ArrayList path;

 static class Node
  {
      int data;
      Node right;
      Node left;
     
      
      public Node(int data)
      {
          this.data = data;
          this.right = null;
          this.left = null;
      }
  }
  
  Node root;
 
  public SubTree()
  {
      root = null;
  }
 
  
  public boolean findPath(Node root, int data)
  {
     if(root == null) return false;
     if(root.data == data || findPath(root.left,data) || findPath(root.right,data))
     {
         path.add(root.data);
         return true;
     }
      return false;
  }
    public static void main(String []args){ 
    { 
        SubTree tree1 = new SubTree(); 
        tree1.root = new Node(1); 
        tree1.root.left = new Node(2); 
        tree1.root.right = new Node(3); 
        tree1.root.left.left = new Node(4); 
        tree1.root.left.right = new Node(5); 
        tree1.root.right.right = new Node(7); 
        tree1.root.right.left = new Node(6); 
        tree1.path = new ArrayList();
       tree1.findPath(tree1.root, 7);
       for(int i = tree1.path.size()-1 ; i >= 0 ; i--)
       {
           System.out.println(tree1.path.get(i));
       }
         
    } 
} }
     
     
