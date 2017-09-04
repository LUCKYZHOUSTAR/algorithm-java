package cmc.lucky.algorithm;

/**
 * @Author:chaoqiang.zhou
 * @Description:插入排序算法
 * @Date:Create in 18:14 2017/9/4
 */
public class InsertSorter {


    public static void main(String[] args) {
        /**
         * 给定一个数组，从数组的第二位进行比对，插入操作
         */
        int[] sorterArray = new int[]{3, 5, 1, 7, 4, 6, 9};
//        InsertSort(sorterArray);
        insertSorter(sorterArray);
        System.out.println("insert sorter");
    }

    /**
     * 3
     * 3 5==>   3 1 5==>1 3 5
     * 1 3 5
     * 1 3 5 7
     * 1 3 4 5 7
     * 1 3 4 5 6 7
     * 1 3 4 5 6 7 9
     *
     * @param sorterArray
     */
    public static void InsertSort(int[] sorterArray) {
        //从数组第二位开始比较
        for (int i = 1; i < sorterArray.length; i++) {
            //埋点一
            int temp = sorterArray[i];
            //用这个数字与其余的数字进行交互比较
            for (int j = i - 1; j >= 0; j--) {
                if (temp > sorterArray[j]) {
                    //已经排好序了，无须在排序了
                    break;
                }
                //如何进行交换，内部运用交换排序
                sorterArray[j + 1] = sorterArray[j];
                sorterArray[j] = temp;
            }
        }
    }


    public static void insertSorter(int[] sorterArray) {
        for (int i = 1; i < sorterArray.length; i++) {

            if (sorterArray[i] < sorterArray[i - 1]) {
                //需要进行排序,需要找位置的数字
                int temp = sorterArray[i];
                int j = i;
                while (j > 0 && sorterArray[j - 1] > temp) {
                    sorterArray[j] = sorterArray[j - 1];
                    j--;
                }
                //交换完了
                sorterArray[j] = temp;
            }

        }
    }
}
