

fun minInsertions(s: String): Int {
        var parenthesesAddedAlready:Int=0;
        var rightNeedParentheses:Int=0;

        s.forEach{parentheses->
            
            if(parentheses=='('){
                if(rightNeedParentheses%2!=0){
                    rightNeedParentheses--;
                    parenthesesAddedAlready++;
                }
                rightNeedParentheses+=2;
            }
            else{
                rightNeedParentheses--;
                if(rightNeedParentheses<0){
                    rightNeedParentheses+=2;
                    parenthesesAddedAlready++;
                }
            }

        }


        return parenthesesAddedAlready+rightNeedParentheses;


        
    }


//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/solutions/780199/java-c-python-straight-forward-one-pass/
