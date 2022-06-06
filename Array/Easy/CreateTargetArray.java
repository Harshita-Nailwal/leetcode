class createTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> output = new ArrayList<Integer>();
        for(int i = 0; i<nums.length; i++){
            output.add(index[i],nums[i]);
        }
        for(int i = 0; i < nums.length;i++){
            nums[i] = output.get(i);
        }
        return nums;
    }
}