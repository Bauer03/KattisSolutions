### Merge Sort
- Sorting algorithm which follows 'divide and conquer' strategy, if you remember our algorithm analysis class.
- Recursively divides the array in smaller sub-arrays (usually in half), sorting the sub-arrays, and then merges them back together to obtain your final sorted array.

### Advantages/Disadvantages
Advantages:
- Worst case O(n log n) time complexity.
- Divide and conquer algorithm is easy to think through

Disadvantages:
- Memory inefficient, stores all the merged sub-arrays during the sorting process, and it's not an 'in-place' sorting algorithm, which means it needs extra memory (for the new sorted array, at least to my understanding).
- Slower than Quicksort, fyi.

### How does it work?
1.  Divide the array recursively into two halves until it can't be divided any further.
2.  Each half is sorted.
3.  Sorted sub-arrays are merged back together.

- The pseudocode for the algorithm is quite nice, but the code is a little harder to memorize/understand.

### Example
- // Note: From my understanding, you can choose to weigh left or right more when splitting. Eg, if you have 5 elements in the list, as long as you do this consistently, you can put the 3 elements in the left half or right half. Just be consistent.
- // This example will put the odd element out in the left halves, and keep an even number in the right halves.

Let's walk through the example again, with the corrections and added detail on merging:

Initial Array: [6 5 12 10 9 1]

Step 1: Divide

Split into: [6 5 12] and [10 9 1]
Step 2: Divide (Left Subarray)

Split [6 5 12] into: [6] and [5 12]
Step 3: Divide (Left Subarray - Continued)

Split [5 12] into: [5] and [12]
Step 4: Merge (Left Subarray)

# What's happening when we say "merge"?
We have a result array (into which we merge, AKA add our 'sorted' items). 
We have the left/right arrays which we're 'merging' together. 
We compare the first elements of the left/right arrays, and add the smaller element to the result array. We then move the pointer of the array we took the element from to the next element. We repeat this process until we've added all the elements from the left/right arrays to the result array.
We start out with size 1 arrays, so this is easy - you just add the smaller item into the result array.

So, we have [6], [5], and [12]. Let's merge.
Merge [5] and [12]: Compare 5 and 12. 5 is smaller, so it goes first. Result: [5, 12]
Merge [6] and [5, 12]: Compare 6 and 5. 5 is smaller. Result: [5]. Compare 6 and 12. 6 is smaller. Result: [5, 6]. 12 is the only remaining element. Result: [5, 6, 12].

Aside: Whenever you have one element remaining, you can just add it to the result array. Why? Because it's going to be the largest element either way.

Step 5: Divide (Right Subarray)

Split [10 9 1] into: [10] and [9 1]
Step 6: Divide (Right Subarray - Continued)

Split [9 1] into: [9] and [1]
Step 7: Merge (Right Subarray)

Merge [9] and [1]: Compare 9 and 1. 1 is smaller. Result: [1, 9]
Step 8: Merge (Right Subarray - Continued)

Merge [10] and [1, 9]: Compare 10 and 1. 1 is smaller. Result: [1]. Compare 10 and 9. 9 is smaller. Result: [1, 9]. 10 is the only remaining element. Result: [1, 9, 10]
Step 9: Final Merge

Remember, we look at the first element of both the left and right arrays, and add the smaller element to the result array. We then increment the pointer of the array we took the element from to the next element. We repeat this process until we've added all the elements from the left/right arrays to the result array.

Merge [5, 6, 12] and [1, 9, 10]:
Compare 5 and 1. 1 is smaller. Result: [1], move pointer that was at 1 so that it points to the next element, aka 9.
Now, we have [5,6,12] and [9, 10]. Our result array is [1].
Our pointers are at the first element of each array, so they're pointing at 5 and 9.
Compare 5 and 9. 5 is smaller. Result: [1, 5]
Compare 6 and 9. 6 is smaller. Result: [1, 5, 6]
Compare 12 and 9. 9 is smaller. Result: [1, 5, 6, 9]
Compare 12 and 10. 10 is smaller. Result: [1, 5, 6, 9, 10]
12 is the only remaining element. Result: [1, 5, 6, 9, 10, 12]

### Code:
```java
public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 70, 50, 30, 10, 20, 40, 60 };
		int[] merged = mergeSort(arr, 0, arr.length - 1);
		for (int val : merged) {
			System.out.print(val + " ");
		}
	}

	public static int[] mergeTwoSortedArrays(int[] one, int[] two) {
		int[] sorted = new int[one.length + two.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				sorted[k] = one[i];
				k++;
				i++;
			} else {
				sorted[k] = two[j];
				k++;
				j++;
			}
		}
		if (i == one.length) {
			while (j < two.length) {
				sorted[k] = two[j];
				k++;
				j++;
			}
		}
		if (j == two.length) {
			while (i < one.length) {
				sorted[k] = one[i];
				k++;
				i++;
			}
		}
		return sorted;
	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}
		int mid = (lo + hi) / 2;
		int[] fh = mergeSort(arr, lo, mid);
		int[] sh = mergeSort(arr, mid + 1, hi);
		int[] merged = mergeTwoSortedArrays(fh, sh);
		return merged;
	}
}
```
