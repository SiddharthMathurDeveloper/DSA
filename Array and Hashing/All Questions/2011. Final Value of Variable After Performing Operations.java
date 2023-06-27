

class Solution {
    public int finalValueAfterOperations(String[] operations) {
    
        int sumOfAfterOperations=0;

        for(String operator:operations){
            if(operator.equals("--X") || operator.equals("X--")){
                sumOfAfterOperations--;
            }
            else{
                sumOfAfterOperations++;
            }
        }

        return sumOfAfterOperations;
        
    }
}
