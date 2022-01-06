// By: Sarthak Gupta
// 1/6/22

// Description:
// There is a programming language with only four operations and one variable X:
//    ++X and X++ increments the value of the variable X by 1.
//    --X and X-- decrements the value of the variable X by 1.
// Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

// Solution Runtime: 7ms (faster than 77%)
// Solution Memory Usage: 14.1 MB (less than 9%) -- need to improve this
class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int x = 0;
        
        for(int i = 0; i < operations.size(); i++)
        {
            if(operations[i] == "++X")
            {
                x+=1;
            }
            else if(operations[i] == "X++")
            {
                x+=1;
            }
            else if(operations[i] == "--X")
            {
                x-=1;
            }
            else if(operations[i] == "X--")
            {
                x-=1;
            }
        }
        
        return x;
    }
};
