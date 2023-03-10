34. Find First and Last Position of Element in Sorted Array

Algorithm :
Step-1 : Creating an empty array with [-1,-1] Initially
Step-2: First find the first occurence
Step-3: Then last occurance
Step-4: By using 2 Binary search 
Step-5: And return the array
*******************************************************************************/
import java.util.*;
public class Main
{
    public static int[] find(int[] arr, int target)
    {
        int[] arr2 = {-1,-1};
        int len = arr.length;
        int left = 0;
        int right = len-1;
        while (left<=right)
        {
            int mid = (left+right) / 2;
            if (arr[mid]==target)
            {
                arr2[0] = mid;
                // continue seraching left part:
                right = mid-1;
            }
            else if(arr[mid] < target)
            {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        
        
         left = 0;
         right = len-1;
        
        while (left<=right)
        {
            int mid = (left+right) / 2;
            if (arr[mid]==target)
            {
                arr2[1] = mid;
                // continue seraching left part:
                left = mid+1;
            }
            else if(arr[mid] < target)
            {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        return  ans;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int[] arr = new int[n];
	    for (int i=0; i<n; i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    int target  =sc.nextInt();
	    int[] ans = find(arr, target);
	    System.out.println(ans[0] + " " + ans[1]);
		
	}
}
