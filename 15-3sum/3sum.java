class Solution {
    
    public static List<List<Integer>> twoSum(int arr[],int f, int i,int j, List<List<Integer>> ans){
        // List<List<Integer>> ans=new ArrayList<>();
        while(i<j){
            if(arr[f]+arr[i]+arr[j]==0){
                // ans.add(Arrays.asList(arr[f],arr[i],arr[j]));
                List<Integer> list=new ArrayList<>();
                list.add(arr[f]);
                list.add(arr[i]);
                list.add(arr[j]);
                ans.add(list);
                // // System.out.println(list);
                // if(!ans.contains(list)) ans.add(list);

                // System.out.println(ans+" HI");
                int a=i;
                int b=j;
                while(arr[i]==arr[a]&&i<j) i++;
                while(arr[j]==arr[b]&&i<j) j--;
            }else if(arr[f]+arr[i]+arr[j]<0){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }

    
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int f=0;f<nums.length;f++){
            int i=f+1;
            ans=(twoSum(nums,f,i,nums.length-1,ans));
            while(f<nums.length-1&&nums[f]==nums[f+1]) f++;
            if(nums[f]>0) break;
        }

        return ans;
    }
}