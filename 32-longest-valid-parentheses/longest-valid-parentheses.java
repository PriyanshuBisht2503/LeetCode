class Solution {
    public static int longestValidParentheses(String s) {
        if(s.length()==1) {return 0;}

        int count =0;
        int max=0;
        
        int arr[]=new int[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=1;
        }        

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' ){
                st.push(i);
            }
            else{
                if(ch==')' && st.isEmpty()){
                    arr[i]=0;
                }else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            arr[st.peek()]=0;
            st.pop();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){ 
                count=count+1;
            }else{
                max=Math.max(max,count);
                count=0;
            }
        }
        max=Math.max(max,count);
        return max;
    }
}