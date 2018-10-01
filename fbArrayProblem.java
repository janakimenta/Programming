/*Given two input arrays, return true if the words array is sorted according to the ordering array 
Input: 
words = ['cc', 'cb', 'bb', 'ac'] 
ordering = ['c', 'b', 'a'] 
Output: True 

Input: 
words = ['cc', 'cb', 'bb', 'ac'] 
ordering = ['b', 'c', 'a'] 
Output: False*/

import java.util.ArrayList;
import java.util.List;
public class ArraySorting{

     public static void main(String []args){
        ArrayList<String> inputArrayList = new ArrayList<String>();
        inputArrayList.add("cc");
        inputArrayList.add("cb");
        inputArrayList.add("bb");
        inputArrayList.add("ac");
        
        ArrayList<Character> inputOrderedArray = new ArrayList<Character>();
        inputOrderedArray.add('c');
        inputOrderedArray.add('a');
        inputOrderedArray.add('b');
        ArraySorting as = new ArraySorting();
        boolean checkIfOrderedArrayIsSorted = as.checkIfOrderedArrayIsSorted(inputArrayList,inputOrderedArray);
        System.out.println(" checkIfOrderedArrayIsSorted " + checkIfOrderedArrayIsSorted);
     }
     
     public boolean checkIfOrderedArrayIsSorted(ArrayList<String> aList,ArrayList<Character> oList)
     {
         if(aList.size() == 0 || oList.size() == 0)
         return false;
         
         int matching = oList.size();
         int j = 0;
         Character previousVisited = null;
         for(int i = 0; i < aList.size() ; i++)
         {
           
             char a[] = aList.get(i).toCharArray();
             if(a.length > 0 && a[0] == oList.get(j) && (previousVisited == null || previousVisited != oList.get(j)))
             {
                 matching--;
                 previousVisited = oList.get(j);
                 j++;
                 
             }
             if(matching == 0) return true;
             
         }
          
         return false;
     }
}
