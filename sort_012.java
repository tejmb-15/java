class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
       int lowi=0,ti=0,highi=n-1;
       while(ti<=highi){
           if(a[ti]==0){
               int temp=a[ti];
               a[ti]=a[lowi];
               a[lowi]=temp;
               lowi++;
               ti++;
           }
           else if(a[ti]==1){
               ti++;
           }
           else{
               int temp=a[ti];
               a[ti]=a[highi];
               a[highi]=temp;
               highi--;
           }
       }
    }
}
