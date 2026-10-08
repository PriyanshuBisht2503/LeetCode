class Solution {
    public int longestOnes(int[] arr, int k) {
        int max=0;
        int c=0;

        int n=arr.length;

        List<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                if(list.contains(0)){
                    max=Math.max(max,list.size());
                    while(list.contains(0)&&c==k){
                        if(list.remove(0)==0)c--;
                    }
                    list.add(arr[i]);
                    c++;
                }else if(c==k){
                    max=Math.max(max,list.size());
                    list.clear();
                }else{
                    list.add(arr[i]);
                    c++;
                }
            }else{
                list.add(arr[i]);
            }
        }
        
        return Math.max(max,list.size());

    }
}