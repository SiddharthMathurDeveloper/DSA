
/* 

   Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
   TAG -> [String , Jumping ]

   Trick -> Loop over the given string if  G comes increase i by 1 , if '(' and i+1') increase by i+=2 , else (al) only this option remain increase by i+=4
  
*/ 


class Solution {
    public String interpret(String command) {
        String goalParser="";

       for(int i=0;i<command.length();){
            if(command.charAt(i)=='G'){
                goalParser+='G';
                i+=1;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')' ){
                goalParser+='o';
                i+=2;
            }
            else{
                 goalParser+="al";
                 i+=4;
            }
       }

       return goalParser;

    }
}
