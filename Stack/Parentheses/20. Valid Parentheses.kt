[Apporoach (Stack Method)]
----------------------------------------------------------------- 
 
 fun isValid(s: String): Boolean {
        val mainStack: Stack<Char> = Stack<Char>();
        
        s.forEach { character ->

            if ((character == '[' || character == '{' || character == '(')) {
                mainStack.push(character);
            } else {
                if (mainStack.empty()) {
                    return false;
                }

                val char = mainStack.peek();
                mainStack.pop();

                if ((char == '(' && character != ')') || (char == '[' && character != ']') || (char == '{' && character != '}')) {
                    return false;
                }


            }

        }
        return mainStack.empty();
    }
