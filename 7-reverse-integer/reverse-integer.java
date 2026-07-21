class Solution {
    public int reverse(int x) {
        long revNum=0;
        while(x!=0){
            revNum=(revNum*10)+(x%10);
            x/=10;
        }

        if(revNum<=2147483647 && revNum>=-2147483648){
            return (int)revNum;
        }
        return 0;
    }
}