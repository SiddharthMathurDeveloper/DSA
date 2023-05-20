
 fun minAddToMakeValid(s: String): Int {

        var countOpen:Int = 0;
        var countClose:Int = 0;

        s.forEach{parentheses ->
            if(parentheses == '('){
                    countOpen++;
            }
           else if(countOpen>0){
                    countOpen--;
            }
                else{               // for '))))' these case not '()' case
                    countClose++;
                }
            }

            return countOpen+countClose;

    }  
