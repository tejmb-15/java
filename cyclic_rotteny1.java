class Compute {
    
    public void rotate(int a[], int n)
    {
        int temp=a[n-1];
        
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=temp;
    }
}
