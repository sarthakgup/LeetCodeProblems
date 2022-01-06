// By: Sarthak Gupta
// 1/6/22

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.

class Solution {
public:
    vector<int> runningSum(vector<int>& nums)
    {
        vector<int> summer;
        int x = 0;
        
        for(int i = 0; i < nums.size(); i++)
        {
            x += nums[i];
            summer.push_back(x);
        }
        
        return summer;
    }
};
