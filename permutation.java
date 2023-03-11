Solution 1:
Using List

class Solution {

    public List<List<Integer>> permute(int[] nums) {

          List<List<Integer>> ans = new ArrayList<>();

	        helper(nums,0,ans);

	        return ans;

    }

    public void helper(int[] nums, int index, List<List<Integer>> ans)

	    {

		//BASE CASE

	    	if(index==nums.length){

	    		    ArrayList<Integer> list =new ArrayList<>();

	    	        for(int i = 0 ; i<nums.length ; i++){

	    	            list.add(nums[i]);

	    	        }

	    	        ans.add(list);

	    	        return;

	    	}

	        for(int i = index; i<nums.length; i++){

	            swap(i,index,nums);

	            helper(nums, index+1, ans);

	            swap(i,index,nums);

	        }

	    }

	    public static void swap(int i , int j, int[] nums){

	    	  int t=nums[i];

	    	    nums[i]=nums[j];

	    	    nums[j]=t;

	    }

}


# Solution 2

class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums, 0);
        return result;
    }

    public void backtracking(int[] nums, int level) {
        if(level == nums.length - 1) {
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }
        for(int i = level;i < nums.length;i++) {
            swap(nums, i, level);
            backtracking(nums, level + 1);
            swap(nums, i, level);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }

}
