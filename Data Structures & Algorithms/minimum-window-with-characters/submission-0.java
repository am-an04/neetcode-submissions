class Solution {
    public String minWindow(String s, String t) {
       int []mapT=new int[256]; 
       int []mapS=new int[256];
       int minLen=Integer.MAX_VALUE,right=0,left=0,minStart=0;
       for(char ch:t.toCharArray()){
        mapT[ch]++;
       }
       for(right=0;right<s.length();right++){
            mapS[s.charAt(right)] ++;
            while(contains(mapT,mapS)){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    minStart=left;
                }
                mapS[s.charAt(left++)]--;
            }
       }
       return minLen==Integer.MAX_VALUE ?"":s.substring(minStart,minStart+minLen);
    }
    public boolean contains(int []mapT,int []mapS){
        for(int i=0;i<256;i++){
            if(mapT[i]>mapS[i]){
                return false;
            }
            
        }
        return true;
    }
}
