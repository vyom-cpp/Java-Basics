package Arrays.pracQue;

public class ans1 {
    
    public static boolean distinctElement(int nums[]){
        for (int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        boolean result = distinctElement(nums);
        System.out.println(result);
    }
}

// DRY RUN

/* 
 
-> In the distinctElement method:
    The outer loop iterates over each element of the array except the last one.
    
    For each element nums[i], the inner loop iterates over the subsequent elements starting from nums[i+1].
    
    In each iteration of the inner loop, it checks if nums[i] is equal to any of the subsequent elements nums[j].
    
    If a duplicate element is found, the method returns true immediately.
    
    If no duplicates are found, the method returns false after checking all elements.

*/