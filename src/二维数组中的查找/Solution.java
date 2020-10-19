package 二维数组中的查找;

public class Solution {
    public boolean Find(int target, int [][] array) {
        /*
        二分查找的每一行
        */
        //排除空数组
        if(array.length==1&&array[0].length==0||array.length==0)
            return false;

        for(int i=0;i<array.length;i++)
        {
            int left=0,right=array[i].length-1,center=(left+right)/2;
            while(left<=right)
            {
                if(target>array[i][center])
                    left=center+1;
                else if(target<array[i][center])
                    right=center-1;
                else {
                    return true;
                }
                center=(left+right)/2;
            }
        }
        return false;
    }
}
