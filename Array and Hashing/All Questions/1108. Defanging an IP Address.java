

/* 
  Brute Force & Optimized -> Time - O(N) Space - O(1) 
*/ 


class Solution {
    public String defangIPaddr(String address) {
        String defangedVersionIP = "";

        for(char addre:address.toCharArray()){
            if(addre=='.'){
                defangedVersionIP+="[.]";
            }
            else{
                defangedVersionIP+=addre;
            }
        }

        return defangedVersionIP;
    }
}
