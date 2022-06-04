class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0, currentSum = 0;
        for(int row=0; row<accounts.length; row++){
            for(int col=0; col<accounts[row].length; col++){
                currentSum += accounts[row][col];
            }
            if(maxSum < currentSum){
                maxSum = currentSum;
                currentSum = 0;
            }
            else 
                currentSum = 0;
        }
        return maxSum;
    }
}