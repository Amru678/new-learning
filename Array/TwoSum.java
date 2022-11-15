Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        int r[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int res=nums[i]+nums[j];
                if(res==target){
                    r[0]=i;
                    r[1]=j;
                    
                }
            }
        }
        return(r);
    }
    
}