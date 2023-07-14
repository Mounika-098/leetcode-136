class Solution {
    public int singleNumber(int[] nums) {
       int answer = 0;
       //Uses the bit manipulation xor
       for(int i = 0;i < nums.length;i++)
       {
           answer ^= nums[i];
       }
       return answer; 
    }
}