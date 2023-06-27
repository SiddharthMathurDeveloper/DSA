

/* 
  Brute Force & Optimized -> Time - O(N) Space - O(N) 
  
*/ 



class Solution {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer,Integer> hashMap = new HashMap<>(); //store freq's in hashmap later will need them
        
        int sumOfPairs=0; // sum of pairs foromed

        for (Integer number: nums) { // loop and get freq of each element
            
            hashMap.put(number, hashMap.getOrDefault(number, 0) + 1);

        }


        for (Integer key : hashMap.keySet()) { // loop over the hashmap 
            
            Integer n = hashMap.get(key); //Get the freq of element 

            sumOfPairs+= (n*(n-1))/2; // use sum of n number formula((n*(n-1))/2) eg [1,1,1,1] for 1-> 4 sum is -> 6  add that where n is freq

        }

        return sumOfPairs; // return sum
       
        
        
    }
}
