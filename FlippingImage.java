class FlippingImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int row = 0; row < image.length; row++){
            for(int col = 0; col < image[row].length/2 ; col++){
                swap(image, row, col, image[row].length-1-col);
            }
        }
        for(int row = 0; row < image.length; row++){
            for(int col = 0; col < image[row].length ; col++){
                if(image[row][col] == 0)
                    image[row][col] = 1;
                else
                    image[row][col] = 0;
            }
        }
        return image;
    }
    public void swap(int[][] arr, int i, int a, int b){
        int temp = arr[i][a];
        arr[i][a] = arr[i][b];
        arr[i][b] = temp;
    }  
}