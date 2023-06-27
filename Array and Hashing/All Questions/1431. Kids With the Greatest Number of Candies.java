


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi = Integer.MIN_VALUE;
        List<Boolean> boolCandies = new ArrayList<Boolean>();

        for(int candide:candies){
            maxi = Math.max(maxi,candide);
        }

        int index=0;
        for(int candide:candies){
            if(candide+extraCandies>=maxi){
                boolCandies.add(true);
            }
            else{
                boolCandies.add(false);
            }
        }


        return boolCandies;


        

    }
}
