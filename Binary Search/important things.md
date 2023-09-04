
## Look for these words
```
-> Sorted ,
-> Searching,
-> Target value ,
-> Inserted in order ,
-> Inserted in position ,
-> A range is given
```


## Note

```
-> Elimination is the Key in most the problems

-> You have to identify which portion you are sure to eliminate so be sure if you identify
the portion to be elimanated and then you can write binary Search for anything

-> The questions which have duplicates always try to solve the problem in terms of unique (as in test cases) , then see where unique will fail , then try to fit that failed condition in that algorithm

-> In some question array may not be given but a range like [0,n] or [ 0,8]  so u have think like a array is given perform the same way.

-> If till a certain point answers are available , then we can use binary Search like [Sqrt(x)] , this is also called as Binary Search on answer

-> When a range is given and we have search apply binary search on answers concept then we have see we need min or max according we remove that half
```

## Peak
- Try to create graph then see the flow of peak and mid , things
- Mutiple peaks have mutiple trough and crest , single does not have mutiple
- Going left or right if u think logic will not impact the answer either way on both side there will exist the peak , when u in middle
- Can have duplicates values

## Binary Search on Answer
- Start value can be other 0 ,1 if u observe you can trim down the range to search [Choosing wrong may lead to wrong answers]
  
- Find the range to solve the question this is the main thing
  
- First code the linear version then tranform to the binary Search way , usually a helper function will remain just the
  how the values being passed is being change , (Linear -> Binary)
  


## Binary Search on Answer (Min or Max / Max or Min)
- This is just a more extend version of Binary Search on Answer
  
- Do min of max / max of min, something like that will be given upfront in the question
  
- Sorting can be Used
  
- First code the linear version then tranform to the binary Search way , usually a helper function will remain just the
  how the values being passed is being change , (Linear -> Binary)

- Range should be formed on linear and binary Approach


***Increaing decreasing question has some properties like left side is smaller than mid and mid is samller that than right (single peak) , 
mutiple peak we can go either left to right because if you think we are in mid that in case (creast) beause in that (torugh) can be found both sides***

