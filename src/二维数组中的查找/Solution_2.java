package 二维数组中的查找;
public class Solution_2 {
    public boolean Find(int target, int [][] array) {
        //排除空数组
        if(array.length==1&&array[0].length==0||array.length==0)
            return false;

        /*
        选取右上角元素与target比较，
        如果比target小则可能在左侧，选取元素列减1，j--
        如果大，可能在下侧 行减1  i--
        */
        for(int j=array[0].length-1,i=0;j>=0&&i<array.length;)
        {
            if(array[i][j]==target)
                return true;
            else if(array[i][j]>target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
}
