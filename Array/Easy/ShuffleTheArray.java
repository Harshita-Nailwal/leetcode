class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n];
        int m=nums.length;
        int j=0, k=n;
        for(int i=0; i<m;i++){
            arr[j++] = nums[i++];
            arr[k++] = nums[n++];
        }
        return arr;
      
    }
}