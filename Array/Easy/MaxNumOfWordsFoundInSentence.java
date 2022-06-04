class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        int maxCount = 0;
        for(String i : sentences){
            for(int j=0;j<i.length();j++){
                if(i.charAt(j)==' '){
                    count += 1;
                }
            }
            if(maxCount < count){
                maxCount = count;
                count = 0;
            }else{
                count = 0;
            }
        }
        return maxCount+1;
    }
}