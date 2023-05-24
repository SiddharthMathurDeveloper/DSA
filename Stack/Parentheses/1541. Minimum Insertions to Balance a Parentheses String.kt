[Apporoach (Stack Method)]
----------------------------------------------------------------- 
        
        
        
 fun minInsertions(s: String): Int {
    val stack = Stack<Char>()
    var count = 0
    var i = 0
    while (i < s.length) {
        if (s[i] == '(') {
            stack.push(s[i])
        } else {
            if (i + 1 < s.length && s[i + 1] == ')') {
                i++
            } else {
                count++
            }

            if (!stack.isEmpty()) { // done operation on '('
                stack.pop()
            } else { // ))) this case
                count++
            }
        }
        i++
    }
    count += 2 * stack.size
    return count
}
 
 //https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/solutions/3321179/java-stack-explained/


[Apporoach (Count Method)]
------------------------------------------------------------------------------------------

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
