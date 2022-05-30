       class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
       // long sum=0,maxsum=-99999;
        //this one take o(n2)
        // for(int i=0;i<n;i++){
        //     sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum>maxsum){
        //         maxsum=sum;
        //     }
        //     }
        // }
        // kadane's algo
        long crsum=0,maxsum=-99999;
        for(int i=0;i<n;i++){
            crsum+=arr[i];
            if(crsum>maxsum){
                maxsum=crsum;
            }
            if(crsum<0){
                crsum=0;
            }
        }
        return maxsum;
        
    }
    
}

