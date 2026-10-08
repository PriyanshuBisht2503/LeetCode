class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] l=new int[nums.length];
        int[] r=new int[nums.length];

        int t1=1;
        int t2=1;
        l[0]=1;
        r[nums.length-1]=1;

        for(int i=0;i<nums.length-1;i++){
            t1*=nums[i];
            l[i+1]=t1;

            t2*=nums[nums.length-1-i];
            r[nums.length-2-i]=t2;
        }


        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=l[i]*r[i];
        }

        return ans;
    }
}