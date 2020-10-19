package 矩形覆盖;
public class Solution {
    public int RectCover(int target) {
        if(target<1)
            return 0;
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        int qq=1,q=2;
        int fn=0;
        for(int i=3;i<=target;i++)
        {
            fn=qq+q;
            qq=q;
            q=fn;
        }
        return fn;
    }
}