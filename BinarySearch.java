/* In Binary Search Array should be sorted and find the mid item like n/2 and compare with mid item if serach item is greater than Mid Item then
do the search in bottom part or else upper boundry. */

public class Main {

    public static void main(String args[])
    {
        int[] arrInt = {1,4,5,8,10,15};
        int searchFor = 15;
        boolean found = binarySearch(arrInt,searchFor);
        System.out.println(" Found Number : " + found);

    }

    public static boolean binarySearch(int[] a,int x)
    {
        int left = 0;
        int right = a.length - 1;
        int mid = 0, min =0, max= 0;
        if(a.length < 1 || x > a[right] || x < a[left])
        {

            return false;
        }
        while(right >= left)
        {
            mid = (right - left)/2;

            min = left + mid; //1
            max = right - mid; //1
            if(x > a[min]) // 2 > 4 false
            {
                left = min + 1;
            }
            else if(x < a[max]) //2 < 4 true
            {
                right = max - 1;
            }
            else
            {
                return true;
            }
                   }
        return false;
    }


}
