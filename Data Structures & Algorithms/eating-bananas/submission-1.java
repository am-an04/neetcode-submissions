class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed=1;
        int maxspeed=0;
        for(int i=0;i<piles.length;i++){
            maxspeed=Math.max(maxspeed,piles[i]);
        }
        while(minspeed<maxspeed){
            int mid=minspeed+(maxspeed-minspeed)/2;
            if(canEat(piles,h,mid)){
                maxspeed=mid;
            }else{
                minspeed=mid+1;
            }
        }
        return minspeed;
    }
    private boolean canEat(int []piles,int h,int speed){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=(int)Math.ceil((double)piles[i]/speed);
        }
        return hours<=h;
    }
}
