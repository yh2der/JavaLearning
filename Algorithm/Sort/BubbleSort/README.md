# Bubble Sort
## Steps
1. Linearly Traverse array from left
2. If the first item is greater than the 2nd item in the array, swap them.
    1. That is, arr[i] > arr[i+1], then swap 
3. Now, compare the next two elements.
4. We will repeat all the previous steps until the given array is sorted.
## Pros:
* Requires less memory then other sorting techniques.
* Easy to code.

## Cons:
* Slow like a snail, time complexity is O(n<sup>2</sup>)
* With large number it sucks even more as it becomes even more slow thanks to O(n<sup>2</sup>)
* The algorithm will be slowest when the array is sorted by in reverse
* Best Case : O(n), when its already sorted

## Time Complexity
### Bset Case
O(n)
### Average Case
O(n^2)
### Worse Case
O(n^2)
## Time Complexity
O(1)
## Sources
https://prepinsta.com/cpp-program/bubble-sort/