public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set  = new HashSet<Integer>();
        HashSet<Integer> output = new HashSet<Integer>();
        for(int i =0;i<nums.length;i++)
          set.add(nums[i]);
          int max = 0;
        for(int i=0;i<nums.length;i++){
            //if nums[i] is the starting point of the sequence
            if(!set.contains(nums[i]-1)){
                int count =1;
                int temp = nums[i];
                while(set.contains(temp+1)){
                    count++;
                    temp++;
                }
                max = Math.max(max,count);
            }
        }  
        
        return max;
        
    }
}