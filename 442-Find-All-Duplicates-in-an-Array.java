class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            //check if element is negative, if yes the we have found the duplicate
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                ans.add(Math.abs(nums[i]));
            } else {
                nums[Math.abs(nums[i])-1] *= -1;
            }
        }
       return ans;

    }
}