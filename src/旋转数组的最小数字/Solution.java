package 旋转数组的最小数字;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0)
            return 0;
        int left=0;
        int len=array.length;
        int right=len-1;
        while(left<=right)
        {
            int center=(left+right)/2;
            if(array[(center-1+len)%len]>array[center]&&array[(center+1)%len]>=array[center])
                return array[center];
            if(array[left]>=array[right])
            {
                if(array[center]<array[left])
                {
                    right=center-1;
                }
                else
                {
                    left=center+1;
                }
            }
            else
            {
                return array[left];
            }
        }
        return array[0];
    }
}