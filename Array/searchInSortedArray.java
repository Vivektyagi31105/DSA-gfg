// Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.

// Example 1:

// Input:
// N = 5, K = 6
// arr[] = {1,2,3,4,6}
// Output: 1
// Exlpanation: Since, 6 is present in 
// the array at index 4 (0-based indexing),
// output is 1.


class Solution{
     static int searchInSorted(int arr[], int N, int K)
    {
    
        int low=0;
        int high =N-1;
        while(low<= high){
            int mid= (low+high)/2;
            if(arr[mid]==K){
                return 1;
            }
            
            if(arr[mid]>K){
                high= mid-1;
            }else{
             low= mid+1;
            }
        }
        
        return -1;
    }
}
