Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.


Solution 1:两次扫描

public class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        
        int len = nums.length;
        int pre = 0;
        int end = len - 1;
        
        for(int i= 0;i<=len - 1;i++){
            if(nums[i]==0){
                swap(nums,i,pre);
                pre++;
            }
           
        }
        
        for(int i =len - 1;i>=0;i--){
            if(nums[i]==2){
                swap(nums,i,end);
                end--;
            }
            
        }
        return;
    }    
        
    public void swap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
    
}


Solution2:一次扫描
        
        public class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        
        int len = nums.length;
        int pre = 0;
        int end = len - 1;
        
        for(int i= 0;i <= end;i++){
            if(nums[i]==0){
                swap(nums,i,pre);
                pre++;
            }else if(nums[i] == 2){
                swap(nums,i,end);
                end--;
                i--;
            }
            
        }
        
        return;
    }
           
       
    public void swap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
    
}


Solution3:计数器

public class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        
    int zero = 0;
    int one = 0;
    int two = 0;
    
    for(int i = 0;i < nums.length;i++){
        if(nums[i] == 0){
            zero++;
        }else if(nums[i] == 1){
            one++;
        }else if(nums[i] == 2){
            two++;
        }
    }    
        
    for(int i =0;i < zero;i++){
        nums[i] = 0;
    }
    
    for(int i = zero;i < zero + one;i++){
        nums[i] = 1;
    }
    
    for(int i = zero + one;i < nums.length;i++){
        nums[i] = 2;
    }
    
    return;
        
    }
}
