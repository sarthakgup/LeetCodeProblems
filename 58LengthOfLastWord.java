class Solution
{
    public int lengthOfLastWord(String s)
    {
        String[] output = s.split(" ");
        
        if(output.length >= 1)
        {
            return output[output.length-1].length();
        }
        
        return 0;
    }
}
