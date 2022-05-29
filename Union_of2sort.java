class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> k= new HashSet<>();
        
        for(int i=0;i<n;i++){
           k.add(a[i]);
       }
       int i=0;
    
       while(m!=0){
           k.add(b[i]);
           i++;
           m--;
       }
       return k.size();
       
    }
}
