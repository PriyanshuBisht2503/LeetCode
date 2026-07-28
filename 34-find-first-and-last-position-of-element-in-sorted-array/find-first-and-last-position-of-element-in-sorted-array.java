class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[] { -1, -1 };;
        int s=0,e=nums.length-1;
        int[] arr=new int[2];
        while(s<e){
            int m=s+((e-s)/2);

            if(nums[m]<target) s=m+1;
            else e=m;
            
        }

        if(nums[e]==target) arr[0]=e;
        else arr[0]=-1;

        s=0;
        e=nums.length-1;
        int ans=0;

        while(s<=e){
            int m=s+((e-s)/2);

            if(nums[m]==target) {
                ans=m;
                s=m+1;
            }else if(target>nums[m]) s=m+1;
            else e=m-1;
        }

        if(nums[ans]==target) arr[1]=ans;
        else arr[1]=-1;


        return arr;
    }
}