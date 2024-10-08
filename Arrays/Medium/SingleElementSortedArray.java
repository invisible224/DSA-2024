// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
// Return the single element that appears only once.
// Your solution must run in O(log n) time and O(1) space.

// Example 1:
// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2

public class SingleElementSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Ensure mid is even
            if (mid % 2 == 1) {
                mid--;
            }
            
            // Compare mid with the next element
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2; // Unique element is on the right side
            } else {
                right = mid; // Unique element is on the left side or at mid
            }
        }

        // When left meets right, the unique element is found
        return nums[left];
    }
}
