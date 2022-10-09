/*
Given an array of strings wordsDict and two different strings that already exist in the array word1 and word2, 
return the shortest distance between these two words in the list.
*/

class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2)
    {
        int shortestDist = wordsDict.length;
        int word1Index = -1;
        int word2Index = -1;
        
        for(int i = 0; i < wordsDict.length; i++)
        {
            if(wordsDict[i].equals(word1))
            {
                word1Index = i;
                
                if(word2Index != -1 && (Math.abs(word1Index-word2Index) < shortestDist))
                {
                    shortestDist = Math.abs(word1Index-word2Index);
                }
            }
            else if(wordsDict[i].equals(word2))
            {
                word2Index = i;
                
                if(word1Index != -1 && (Math.abs(word1Index-word2Index) < shortestDist))
                {
                    shortestDist = Math.abs(word1Index-word2Index);
                }
            }
        }
        
        return shortestDist;
    }
}
