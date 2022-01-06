class Solution
{
    public int[] getConcatenation(int[] nums)
    {
        int[] temp = new int[nums.length*2];
        
        for(int i = 0; i < nums.length; i++)
        {
            temp[i] = nums[i];
        }
        
        int x = 0;
        for(int i = nums.length; i < nums.length*2; i++)
        {
            temp[i] = nums[x];
            x++;
        }
        
        return temp;
    }
}
