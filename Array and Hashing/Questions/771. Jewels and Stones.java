class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        
      int countedJewelsInStones=0;

      for (char jewel:jewels.toCharArray()) {
          if (hashMap.containsKey(jewel)){
                hashMap.put(jewel,hashMap.get(jewel) + 1);
          }
          else{
              hashMap.put(jewel,1);
          }
      }

      for (char stone :stones.toCharArray() ) {

          if (hashMap.containsKey(stone)){
              countedJewelsInStones+=1;
          }
      }


      return countedJewelsInStones;
        
    }
}
