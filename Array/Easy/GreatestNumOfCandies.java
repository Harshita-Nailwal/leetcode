class GreatestNumOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<Boolean>();
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<candies.length; i++){
            if(candies[i]>max)
                max = candies[i];
        }
        
        for(int i = 0; i< candies.length; i++){
            if((candies[i] + extraCandies) >= max){
                output.add(true);
            }else{
                output.add(false);
            }
        }
        return output;
    }
}