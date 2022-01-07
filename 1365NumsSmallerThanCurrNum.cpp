// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
// That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

//Return the answer in an array.

class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        vector<int> smallerVals;
        
        for(int i = 0; i < nums.size(); i++)
        {
            int tempCounter = 0;
            
            for(int j = 0; j < nums.size(); j++)
            {   
                if(j != i && nums[j] < nums[i])
                {
                    tempCounter++;
                }
            }
            
            smallerVals.push_back(tempCounter);
        }
        
        return smallerVals;
    }
};
