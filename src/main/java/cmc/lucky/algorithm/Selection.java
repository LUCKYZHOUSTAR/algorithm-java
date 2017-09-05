package cmc.lucky.algorithm;

/**
 * @Author:chaoqiang.zhou
 * @Description: 1.运行的时间和输入无关，及时是一个有序的数组，排序的时间与无序的数组一样长
 * 2.数据移动是最少的，每次交换都会改变两个数组元素的值，因此选择排序用了N次交换，交换次数和数组的大小是线性关系。
 * @Date:Create in 14:52 2017/9/5
 */
public class Selection {


    public static void main(String[] args) {
        int[] sorterArray = new int[]{9, 3, 6, 1, 2, 8};
        select(sorterArray);
        System.out.println("test");
    }

    /**
     * 选择排序
     * 1.找到数组中最小的元素的索引，与0位置交互
     * 2.接着找其余部分的索引的数字，与1位置交换
     *
     * @param a
     */
    public static void select(int[] a) {

        for (int i = 0; i < a.length; i++) {
            //内部开始寻找最小的元素的索引
            //假设起始值就是最小值
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                //从i+1开始寻找,如果比i小的话，那么min的索引就是j
                if (a[j] < a[min]) min = j;
            }
            //最后进行交换
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}
