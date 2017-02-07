public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++){
         map.put(nums[i],i);   
        }
     int[] arr = new int[findNums.length];
     int nextgreater=-1;
        for(int i=0;i<findNums.length;i++){
            nextgreater=-1;

            int index = map.get(findNums[i]);
            int cur = findNums[i];
            for(int j=index+1;j<nums.length;j++){
                if(nums[j]>cur)
                  {  nextgreater=nums[j];
                    break;
                  }
            }
            
            arr[i]=nextgreater;
            
        }
        
        return arr;
        
    /*    Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;*/
        
    }
}