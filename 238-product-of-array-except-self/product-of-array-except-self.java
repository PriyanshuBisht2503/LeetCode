class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] l=new int[nums.length];
        int[] r=new int[nums.length];

        int t1=1;
        int t2=1;

        for(int i=0;i<nums.length;i++){
            t1*=nums[i];
            l[i]=t1;

            t2*=nums[nums.length-1-i];
            r[nums.length-1-i]=t2;
        }


        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int lp=1;
            int rp=1;

            if(i-1>=0) lp=l[i-1];

            if(i+1<nums.length) rp=r[i+1];

            ans[i]=lp*rp;
        }

        return ans;
    }
}