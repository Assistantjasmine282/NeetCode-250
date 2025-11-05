//Approach 1 — Two Pointer Method (Forward)   , Time Complexity -> O(n)  ,Space Complexity O(1)

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0; // next index for non-val elements
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j; // k = count of valid elements
    }
}

//Approach 2: Two Pointer (From Both Ends) ,Time Complexity -> O(n)  ,Space Complexity O(1)
class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1]; // replace with last element
                n--; // shrink size
            } else {
                i++;
            }
        }
        return n; // valid length
    }
}
