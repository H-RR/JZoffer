package 跳台阶;
public class Solution {
    public int JumpFloor(int target) {
        if(target<1)
            return 0;
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        int qq=1;
        int q=2;
        int dq=0;
        for(int i=3;i<=target;i++)
        {
            dq=qq+q;
            qq=q;
            q=dq;
        }
        return dq;
    }
}