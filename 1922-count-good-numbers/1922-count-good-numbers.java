class Solution {
    static final long m= 1000000007;
    static long findpow(long base,long n){
        if(n==0){
            return 1;
        }
        if(n%2==1)return base*findpow((base*base)%m,(n-1)/2)%m;
        return findpow((base*base)%m,n/2)%m;

    }
    public int countGoodNumbers(long n) {
        long ans= (findpow(5,(n+1)/2)*findpow(4,n/2))%m;
        return (int)(ans%m);
    }
}