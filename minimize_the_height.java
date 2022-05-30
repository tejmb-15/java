class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
       Arrays.sort(arr);
       int mi=arr[0];
       int ma=arr[n-1];
       int diff=ma-mi;
       int x,y;
       for(int i=1;i<n;i++){
           x=arr[i-1];
           y=arr[i];
           if(y-k>=0){
               ma=Math.max(x+k,arr[n-1]-k);
               mi=Math.min(y-k,arr[0]+k);
               diff=Math.min(diff,ma-mi);
           }
       }
       return diff;
    }
}
