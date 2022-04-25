// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
// Return the head of the merged linked list.

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if(list1 == 0)
        {
            return list2;
        }
        if(list2 == 0)
        {
            return list1;
        }
        
        struct ListNode* current;
        if(list1->val < list2->val)
        {
            current = list1;
            list1 = list1->next;
        }
        else
        {
            current = list2;
            list2 = list2->next;
        }
        
        current->next = mergeTwoLists(list1,list2);
        return current;    
        
    }
};
