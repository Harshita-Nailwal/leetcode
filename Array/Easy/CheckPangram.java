class CheckPangram {
    public boolean checkIfPangram(String sentence) {
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        
        for (int i= 0 ; i< alphabet.length(); i++){
            if(!sentence.contains(String.valueOf(alphabet.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}