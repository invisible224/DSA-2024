// Majority Element
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:
// Input: nums = [3,2,3]
// Output: 3

// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2


class majorityElement {
    public int majorityelement(int[] nums) {
        // Variable to keep track of the current count of the candidate
        int count = 0;
        
        // Variable to store the current candidate for the majority element
        Integer candidate = null;

        // Iterate through each element in the array
        for (int num : nums) {
            // If count is 0, select the current element as the new candidate
            if (count == 0) {
                candidate = num;
            }
            
            // Update the count: increase if the current element is the candidate, 
            // decrease if it's not
            if(num==candidate){
                count += 1;
            }
            else{
                count -= 1;
            }
        }

        // By the end of the loop, the candidate is the majority element
        return candidate;
    }
}

