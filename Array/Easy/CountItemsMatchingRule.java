class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue)     {
        int column = 0;
        int count = 0;
        if(ruleKey.equals("type"))
            column = 0;
        else if(ruleKey.equals("color"))
            column = 1;
        else
            column = 2;
        for(int row = 0; row < items.size(); row++){
            if(items.get(row).get(column).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}