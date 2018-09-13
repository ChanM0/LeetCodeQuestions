class Solution {
    public int[] TwoSum(int[] nums, int target) {
       int answer[] = new int[2];
        for(int i = 0; i < nums.length-1 ; i++ ){
            for(int j = i+1; j < nums.length ; j++ ){
                if ( nums[i] + nums[j] == target ){
                    answer[0] = i;
                    answer[1] = j;
                }
            }   
        }

        String output = nums[answer[0]] + " + " + nums[answer[1]] + " = " + target;
        System.out.println(output);

        // if(nums[answer[0]]+nums[answer[1]] == target ){
        //     System.out.println("Correct");
        //     String output = nums[answer[0]] + " + " + nums[answer[1]] + " = " + target;
        //     System.out.println(output);
        // }
        // else{
        //     System.out.println("Incorrect");
        // }
        
        return answer;
    }
}

class TwoSum {
    public static void main(String[]args){
        Solution obj = new Solution();
        int nums[] = {2,7,11,15};
        int answer[] = obj.TwoSum(nums,9);
    }

}