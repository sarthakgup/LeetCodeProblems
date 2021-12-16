// Done as part of Facebook (Meta) coding interview prep
// 12/16/2021

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

class Solution {
    public boolean isPalindrome(String s)
    {
        if(s == "" || s == " ")
        {
            return true;
        }
        
        //removing non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        //System.out.println(s);
        int i, j = 0;
        j = s.length()-1;
        
        for(i = 0; i < s.length()/2; i++)
        {
            if(!(s.charAt(i)==(s.charAt(j))))
            {
                return false;
            }
            
            j--;
        }
    
        return true;
    }
}
