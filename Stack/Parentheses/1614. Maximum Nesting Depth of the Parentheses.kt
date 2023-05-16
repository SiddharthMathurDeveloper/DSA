
[Apporoach (Count Method)]
------------------------------------------------------------------------------------------
import kotlin.math.max
class Solution {
    fun maxDepth(s: String): Int {
        var maximumNestingDepth:Int =0;
        var countDepth:Int = 0;

        for(character in s){
                if(character=='('){
                    countDepth++;
                }

                if(character==')'){
                    countDepth--;
                }

           maximumNestingDepth = max(countDepth,maximumNestingDepth);
        }


        return  maximumNestingDepth;
    }
}



[Apporoach (Stack Method)]
-----------------------------------------------------------------

import kotlin.math.max
class Solution {
    fun maxDepth(s: String): Int {

        val mainStack:Stack<Char> = Stack<Char>();

        var maximumNestingDepth:Int =0;

        s.forEach { character->
            if(character=='('){
                mainStack.push(character);
            }

            if(character==')'){
                mainStack.pop();
            }

            maximumNestingDepth = max(maximumNestingDepth,mainStack.size)



        }

        return maximumNestingDepth;


    }
}
