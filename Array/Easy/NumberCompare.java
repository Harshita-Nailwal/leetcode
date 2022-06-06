class NumberCompare {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] check = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length;j++){
                if((i != j) && (nums[i] > nums[j])){
                    count+=1;
                }
            }
            check[i] = count;
            count =0;
        }
        return check;
    }
}