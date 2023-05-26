


class Solution {
  
    fun subtractProductAndSum(n: Int): Int {
       val sum  = sumOfDigits(n)
        val product = sumOfProduct(n)
        return product-sum;
    }

    private fun sumOfDigits(n: Int):Int{
        var sum:Int=0;
        var number:Int = n;

        while (number!=0){
            sum += number%10;
            number/=10;
        }
        return sum;
    }

    private fun sumOfProduct(n: Int):Int{
        var product:Int=1;
        var number:Int = n;

        while (number!=0){
            product *= number%10;
            number/=10;
        }
        return product;
    }
}

// logn - time

/*
1000 / 10 = 100
100 / 10  = 10
10 / 10   = 1
1/ 10     = 0

it takes 4 steps

10^(4-1) = 1000

10^(n-1) is equivalent to log (n-1) # base 10

and as n goes to infinity, log(n-1) ~= log n

-> O(log n) # base 10
 */
