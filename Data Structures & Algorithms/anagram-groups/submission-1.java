class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            int []freq=new int[26];
            for(int j=0;j<word.length();j++){
                   freq[word.charAt(j)-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<26;j++){
                sb.append('#').append(freq[j]);
            }
            String finalkey=sb.toString();
            if(!map.containsKey(finalkey)){
                map.put(finalkey,new ArrayList<>());
            }
            map.get(finalkey).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
