// Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

// Example 1:

// Input:
// N = 6
// A[] = {3, 2, 1, 56, 10000, 167}
// Output:
// min = 1, max =  10000

public class min_max {
    
    static pair getMinMax(long a[], long n)  
    {

        long min= a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        long max=a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
      pair p= new pair(min,max);
      return p;
    }
}
