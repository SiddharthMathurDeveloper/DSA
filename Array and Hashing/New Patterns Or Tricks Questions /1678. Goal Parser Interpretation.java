

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
