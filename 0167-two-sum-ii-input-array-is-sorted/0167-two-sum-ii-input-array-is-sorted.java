class Solution {
    public int[] twoSum(int[] a, int target) {
    int start=0;
    int end=a.length-1;
    int result[]=new int[2];
    while(start<end)
    {
        if(a[start]+a[end]==target)
        {
           result[0]=start+1;
           result[1]=end+1; 
           break;
        }
        else if(a[start]+a[end]>target)
        {
            end--;
        }
        else
        {
            start++;
        }
    }
    return result;
    }
}