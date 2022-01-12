class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {    
        //getting max
        int max = candies[0];
        List<Boolean> maxBools = new ArrayList<Boolean>();
        
        for(int i = 0; i < candies.length; i++)
        {
            int temp = candies[i] + extraCandies;
            maxBools.add(true);
            
            for(int j = 0; j < candies.length; j++)
            {
                if(temp < candies[j])
                {
                    //not max so add false to maxBools
                    maxBools.remove(i);
                    maxBools.add(false);
                }
            }
            
            /*
            if(maxBools.get(i) != false)
            {
                maxBools.add(true);
            }
            */
        }
        
        //System.out.println(max);
        //maxBools.add(true);
        
        return maxBools;
    }
}
