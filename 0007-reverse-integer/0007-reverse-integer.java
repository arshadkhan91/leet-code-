class Solution {
    public int reverse(int x) {
        long reverse=0;
        while(x!=0){
            int ldigit=x%10;
            reverse=reverse*10+ldigit;
            if (reverse>Integer.MAX_VALUE|| reverse<Integer.MIN_VALUE ){
                return 0;
            }
            x=x/10;
        }
        return (int)reverse;
    }
}