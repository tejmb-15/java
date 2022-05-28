class Compute 
{
    static pair getMinMax(long a[], long n)  
    {  long min=a[0];
    long max=a[0];
    for(int i=0;i<n;i++){
        if(min>a[i]){
            min=a[i];
        }
    }
     for(int i=0;i<n;i++){
        if(max<a[i]){
            max=a[i];
        }
    }
       // return(min,max);
    //     pair ans=new pair(min,max);
    //   return ans;
        return new pair(min,max);
        // only wapper classes
        
    }
}
