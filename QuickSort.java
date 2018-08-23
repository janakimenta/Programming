/*Quick Sort:

Time Complexity :  O(NLOGN) AVERAGE CASE,
                   O(N SQUARE) WORST.
Space Complexity : O(N)


Steps:


Java: */

public class Sorting{

     public static void main(String []args){
        System.out.println("Hello World");
        int a[] = {2,1,5,7,8,3,4,9};
        Sorting sorting = new Sorting();
        sorting.QuickSortRecurssiveLogic(a,0,a.length-1);
        for(int i=0;i< a.length ; i++)
        {
            System.out.println(a[i]);
        }
     }
     
    
     public void QuickSortRecurssiveLogic(int a[], int start,int  end)
     {
         if(start < end)
         {
             int pIndex = partition(a, start,end);
             QuickSortRecurssiveLogic(a,start,pIndex-1);
             QuickSortRecurssiveLogic(a,pIndex+1,end);
             
         }
     }
     
     public int partition(int a[], int start, int end)
     {
         int pivot = a[end];
         System.out.println(" pivot "+ pivot);
         int pIndex = start;
         for(int i=start; i<end;i++)
         {
             if(a[i] <= pivot)
             {
              
                  int temp = 0;
                  temp = a[i];
                  a[i]= a[pIndex];
                  a[pIndex]= temp;
                pIndex = pIndex +1;
                 
             }
         }
         int temp1 = 0;
          System.out.println(" pIndex 1 "+ pIndex);
         temp1 = a[pIndex];
         a[pIndex] = a[end];
         a[end]= temp1;
          System.out.println(" pIndex "+ pIndex);
         return pIndex;
     }
     
    
}
