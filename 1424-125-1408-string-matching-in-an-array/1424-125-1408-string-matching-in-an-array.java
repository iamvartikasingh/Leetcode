class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
           
            if(words[i].contains(words[j]) && words[i]!=words[j] && !result.contains(words[j])){
            result.add(words[j]);
            }
        }}
        return result;
    }
}