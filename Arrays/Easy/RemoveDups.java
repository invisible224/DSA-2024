// class Solution {
//     public int removeDuplicates(int[] nums) {
//        int j=1;

//        for(int i=1;i<nums.length;i++){
//             if(nums[i] != nums[i-1]){
//                 nums[j]=nums[i];
//                 j++;
//             }
//        }
//         return j;
//     }
// }

// Two pointers method first item in the array always be unique so we have to move from 2nd position then we will check if nums[1] != nums[2] if yes then we will modify the nums array by putting the nums[j]=nums[i] (with that unique element)

// Another sol
// class Solution {
//     public int removeDuplicates(int[] nums) {
        
//         int k=0;
//         for(int i=0;i<nums.length;i++){
//             if(i<nums.length-1 && nums[i]==nums[i+1]){
//                 continue;
//             }
//             else{
//                 nums[k]=nums[i];
//                 k++;
//             }
//         }
//         return k;
//     }
// }