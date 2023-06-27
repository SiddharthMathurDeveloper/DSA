

/* 

  Brute Force & Optimized -> Time - O(N) Space - O(N) 
  
*/ 

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      
        Map<Character,Integer>freq_map = new HashMap<Character,Integer>(); // Used to store frequnecy of stones

        int distinctJewels=0;
        for(char stone:stones.toCharArray()){

            freq_map.put(stone,freq_map.getOrDefault(stone,0)+1);

        }  

        for(char jewel:jewels.toCharArray()){
            if(freq_map.containsKey(jewel)){
                distinctJewels+=freq_map.get(jewel);
            }
        }


        return distinctJewels;
    }
}
