package Arrays.pracQue;

public class ans2 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target lies in the left half
                } else {
                    left = mid + 1; // Target lies in the right half
                }
            } else { // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Target lies in the right half
                } else {
                    right = mid - 1; // Target lies in the left half
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println("Output for Example 1: " + search(nums1, target1)); // Output: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println("Output for Example 2: " + search(nums2, target2)); // Output: -1
    }
}

// DRY RUN

/*
 
- > Initialize two pointers, left and right, where left points to the start of the array and right points to the end of the array.

- > While left is less than or equal to right, do the following:
    Calculate the middle index as (left + right) / 2.

    Check if the middle element is equal to the target. If it is, return the middle index.

    If the left half of the array is sorted:
        
        Check if the target lies within the sorted left half (i.e., nums[left] <= target < nums[mid]). If it does, update right = mid - 1; otherwise, update left = mid + 1.
    
    If the right half of the array is sorted:

        Check if the target lies within the sorted right half (i.e., nums[mid] < target <= nums[right]). If it does, update left = mid + 1; otherwise, update right = mid - 1.

- > If the target is not found after the loop, return -1.

 */