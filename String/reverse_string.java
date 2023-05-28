// You are given a string s. You need to reverse the string.

// Example 1:

// Input:
// s = Geeks
// Output: skeeG

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String rev="";
        
        for(int i=str.length()-1; i>=0;i--){
            rev+= str.charAt(i);
        }
      return rev;
    }
}