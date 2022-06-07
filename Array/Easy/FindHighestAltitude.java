class FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length +1];
        int max = Integer.MIN_VALUE;
        arr[0] = 0;
        for(int i=0; i<gain.length; i++){
            arr[i+1] = arr[i] + gain[i];
        }
        for(int i=0; i<arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
}
