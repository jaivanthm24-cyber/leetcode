class Solution {
    public int findNumbers(int[] nums) {int count=0;
        for(int i=0;i<nums.length;i++){int countnum=0;
            while(nums[i]>0){
                int digits=nums[i]%10;
                nums[i]=nums[i]/10;
                countnum++;
            }
            if(countnum%2==0){
                count++;
            }
        }return count;        
    }
}