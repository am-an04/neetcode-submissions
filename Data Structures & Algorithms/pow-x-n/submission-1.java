class Solution {
    public double myPow(double x, int n) {
        double base=x;
        long power=n;
        double ans=1;
        if(power==0) return 1;
        if(power<0){
            base=1/base;
            power=-power;
        }
        while(power>0){
            if(power%2!=0){
                ans=ans*base;
            }
            base=base*base;
            power=power/2;
        }
        return ans;
    }
}
