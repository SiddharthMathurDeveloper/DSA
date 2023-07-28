

## Using For loop 1 [ https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/solutions/]

```java
public int countGoodSubstrings(String s) {
        if(s.length()<3)return 0;
        char a=s.charAt(0),b=s.charAt(1),c=s.charAt(2);
        int res=0;
        for(int i=3;i<=s.length()-1;i++)
        {
            if(a!=b && b!=c && c!=a)res++;
            a=b;
            b=c;
            c=s.charAt(i);
        }
        if(a!=b && b!=c && c!=a)res++;
        return res;
    }
};
```





## Using while loop (Maths)  [https://leetcode.com/problems/find-the-k-beauty-of-a-number/description/]

```java
 public int divisorSubstrings(int num, int k) {
        int n = num;
        long mod = (long) Math.pow(10L, k);

        int countResult=0;

        while(n>=mod/10){
           long divisor = n%mod;

            if(divisor!=0 && num%divisor==0 ){
                countResult++;
            }

            n/=10;
        }

        return countResult;
    }
```









## Using while loop (general format ) Fixed  [https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/]
``` java
public int minimumRecolors(String blocks, int k) {
        int i=0;
        int j=0;

        int mincount=Integer.MAX_VALUE;

        int totalCountOfWhite=0;

        int blocksLength = blocks.length();

        while(j<blocksLength ){
                // do calculations
            if(blocks.charAt(j)=='W'){
                totalCountOfWhite++;
            }


                // when window size is reached
            if(j-i+1==k){
                mincount = Math.min(totalCountOfWhite, mincount);

                if(blocks.charAt(i)=='W'){
                    totalCountOfWhite--;
                }

                i++;
            }

        // always move j foward
            j++;
        }


// return your ans
        return mincount;
    }
```










