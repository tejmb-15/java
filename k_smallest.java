class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        return (arr[k-1]);
        //use priority que for o(nlog(k));
        //or even partition 
        
    } 
}
