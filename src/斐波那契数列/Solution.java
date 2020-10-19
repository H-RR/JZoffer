package 斐波那契数列;

public class Solution {
    public int Fibonacci(int n) {
        if(n<1)
            return 0;
        if(n==1||n==2)
            return 1;
        int qq=1,q=1;
        int x=0;
        for(int i=3;i<=n;i++)
        {
            x=qq+q;
            qq=q;
            q=x;
        }
        return x;
    }
}