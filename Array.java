ARRAY : 06
33. Search in Rotated Sorted Array

You must write an algorithm with O(log n) runtime complexity.


ALGORITHM :
Step-1:   Find the mid value mid = ( left + right) / 2
Step-2:   Check the mid value to the left element arr[mid] >= arr[left]     // Uniformly Increases
Step-3:   Apply binary search on half of the array
Step-4:   If (search) < arr[mid] && (search) >= arr[left]
Step-5:   Then Shift ( right = mid-1 )  Else left = mid+1;
Step-6:   Else ( If (search > arr[mid] && search <=arr[right])
Step-7:  Shift left = mid +1;
Step-8:  Else right = mid-1;
*******************************************************************************/
import java.util.*;
public class Main
{
    public static int searchEle(int[] arr, int search)
    {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int mid;
        while(left<=right)
        {
            mid = (left+right)/2;
            if (arr[mid]==search)
            {
                return mid;
            }
            else if (arr[mid]>=arr[left])
            {
                if (search<=arr[mid] && search>=arr[left])
                {
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if (search>arr[mid] && search<=arr[right])
                {
                    left = mid+1;
                }
                else{
                    right = mid+1;
                }
            }   
        }
         return -1;
    }

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the no of elements: ");
	    int n = sc.nextInt();
	    int[] arr  = new int[n];
	    for (int i=0; i<n; i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    System.out.println("Enter Element which you want to search : ");
	    int search = sc.nextInt();
	    System.out.println( searchEle(arr, search));
	    
	}
}







Find Minimum or Maximum with minimum no of comparision:

// METHOD 1 
// Algorithm:
Step1: Take arr[0] and arr[1] as a min & max;
Step2: Check for both element which one is greater or smaller by comparing
Step3: Create a loop starts with arr[2] till n
Step4: Check for arr[i] > max , update ( max)
Step5: Check for arr[i] < min, update (min)
#include <iostream>
using namespace std;
int main() {
    // Write C++ code here
    int n;
    cin>>n;
    int arr[n];
    for (int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    int min;
    int max; 
   if (n==1)
   {
       max = arr[0];
       min  = arr[0];
   }
   else{
       if (arr[0] > arr[1])
       {
           min = arr[1];
           max = arr[0];
       }
       else
       {
           max = arr[1];
           min = arr[0];
       }
   }
   for (int i=2; i<n; i++)
   {
      if (arr[i]>max)
      {
          max = arr[i];
      }
      if (arr[i]<min)
      {
          min = arr[i];
      }
    // cout<<arr[i];
   }
  cout<<"maximum is "<<max<<endl;
  cout<<"minimum is "<<min;
    return 0;
}






Reverse the Array Using Swaping:

// Iterative C++ program to reverse an array
#include <bits/stdc++.h>
using namespace std;

/* Function to reverse arr[] from start to end*/
void rvereseArray(int arr[], int start, int end)
{
	while (start < end)
	{
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
	}
}	

/* Utility function to print an array */
void printArray(int arr[], int size)
{
for (int i = 0; i < size; i++)
cout << arr[i] << " ";

cout << endl;
}

/* Driver function to test above functions */
int main()
{
// 	int arr[] = {1, 2, 3, 4, 5, 6}; 
    int n;
    cin>>n;
    int arr[n];
    for (int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
	
// 	int n = sizeof(arr) / sizeof(arr[0]);

	// To print original array
	printArray(arr, n);
	
	// Function calling
	rvereseArray(arr, 0, n-1);
	
	cout << "Reversed array is" << endl;
	
	// To print the Reversed array
	printArray(arr, n);
	
	return 0;
}




// Kadanes Algorithm:


import java.util.*;
public class kadanes {
    static void kadns(int arr[], int  n){
        int currSum = 0;
        int maxSum = arr[0];
        for (int i=0; i<n; i++)
        {
            currSum = currSum + arr[i];
            if (currSum > maxSum)
            {
                maxSum = currSum;
            }
            if (currSum<0)
            {
                currSum = 0;
            }
        }
//        System.out.println(currSum);
        System.out.println(maxSum);
    }
    static void  inputEle(int arr[], int n){
        Scanner obj = new Scanner(System.in);
        for (int i=0; i<n; i++)
        {
            arr[i] = obj.nextInt();
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        int[] arr = new int[n];
        inputEle(arr, n);
        kadns(arr,n);
    }

