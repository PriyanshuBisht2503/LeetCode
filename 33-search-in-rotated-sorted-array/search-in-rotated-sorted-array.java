class Solution {
    public int search(int[] arr, int key) {
        int l=0;
        int h=arr.length-1;
        if(arr[h]==key) return h;
        if(arr[l]==key) return l;

        while(l<h){
            int m=l+(h-l)/2;

            if(arr[m]==key) return m;

            if(arr[l]<arr[m]){
                if(key>=arr[l]&&key<arr[m])h=m;
                else l=m+1;
            }else{
                if(key>=arr[m]&&key<arr[h])l=m+1;
                else h=m;
            }
        }

        return -1;
    }
}