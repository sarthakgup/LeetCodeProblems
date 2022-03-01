// Merge Sorted Array

// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function,
// but instead be stored inside the array nums1.
// To accommodate this, nums1 has a length of m + n, 
// where the first m elements denote the elements that should be merged, 
// and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

// Completed 3/1/22

void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n)
{
    int i = 0;  //tracks nums 1
    int j = 0;  //tracks nums 2
    int k = 0;  //tracks new Array
    
    int output[m+n];
    
    while(i<m && j<n)
    {
        if(nums1[i] < nums2[j])
        {
            output[k] = nums1[i];
            i++;
            k++;
        }
        else
        {
            output[k] = nums2[j];
            j++;
            k++;
        }
    }
    
    while(i < m)
    {
        output[k] = nums1[i];
        i++;
        k++;
    }
    
    while(j < n)
    {
        output[k] = nums2[j];
        j++;
        k++;
    }
    
    for(int x = 0; x < (m+n); x++)
    {
        nums1[x] = output[x];
    }
    
    return nums1;
}
