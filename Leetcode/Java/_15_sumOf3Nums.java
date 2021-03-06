class _15_sumOf3Nums{
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int len = nums.length;
        Arrays.sort(nums);
        if( len < 3 )   return ans;
        for( int i = 0 ; i < len - 2 ; i++ )
        {
            int t1 = nums[i];
            if( t1 > 0 )    return ans;
            if( i != 0 && nums[ i - 1] == nums[i])  continue;
            for( int left = i + 1 , right = len - 1; left < right ;)
            {
                int add = nums[left] + nums[right] + t1;
                if(add > 0) right--;
                else if(add < 0)    left++;
                else
                {
                    ans.add(Arrays.asList(nums[left],nums[right],t1));	//用这种方式插入List!
                    left++;
                    right--;
                    while( left < right && nums[left] == nums[left - 1])    left++;
                    while( left < right && nums[right] == nums[right + 1] )  right--;
                }
            }
        }
        return ans;
    }
}
//此解法还不够块，请参看16题的极限剪枝
//创建临时List的方法Arrays.asList(a,b,c);
//要时刻防止数组越界
