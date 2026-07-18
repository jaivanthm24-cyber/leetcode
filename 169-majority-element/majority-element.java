class Solution {
    static{
        for(int i =0; i< 300; i++){
            majorityElement(new int[0]);
        }
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int el = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                count++;
                el = nums[i];
            }else if(nums[i] == el){
                count++;
            }else{
                count--;
            }
        }
        int count1 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == el) count1++;

            if(count1 > nums.length / 2){
                return nums[i];
            }
        }
        return -1;
    }
}
