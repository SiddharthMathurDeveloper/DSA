



class Solution {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int sumOfPairs=0;

        for (Integer number: nums) {
            hashMap.put(number, hashMap.getOrDefault(number, 0) + 1);

        }


        for (Integer key : hashMap.keySet()) {
            Integer n = hashMap.get(key);

            sumOfPairs+= (n*(n-1))/2;

        }

        return sumOfPairs;
       
        
        
    }
}
