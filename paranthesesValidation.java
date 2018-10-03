import java.util.LinkedList;
import java.util.Stack;
public class PranthesesValidation 
{ 
  
    
    public int validateString(String str) 
    { 
        int length = -1;
       Stack<Integer> stack = new Stack<Integer>();
       char a[] = str.toCharArray();
       stack.push(-1);
       for(int i = 0; i< a.length ; i++)
       {
       if(a[i] == '(')
       {
           stack.push(i);
       }
       if(a[i] == ')')
       {
           stack.pop();
           if(!stack.isEmpty())
           {
               int len = i - stack.peek();
               if(len > length) length = len;
           }
       }
       }
       return length;
    } 
  
    /* testing for example nodes */
    public static void main(String args[]) 
    { 
        /* creating a binary tree and entering the nodes */
        PranthesesValidation pv = new PranthesesValidation(); 
         String givenData = "(())(()";
  
       int maxLength = pv.validateString(givenData);
       System.out.println(" maxLength " + maxLength);
    } 
} 
