package cmc.lucky.algorithm;

/**
 * @Author:chaoqiang.zhou
 * @Description:冒泡排序算法
 * @Date:Create in 15:57 2017/9/21
 */
public class BubbleSort {


    /**
     * 基本原理：
     * 原理是临近的数字两两进行比较,按照从小到大或者从大到小的顺序进行交换,
     * <p>
     * 这样一趟过去后,最大或最小的数字被交换到了最后一位,
     * <p>
     * 然后再从头开始进行两两比较交换,直到倒数第二位时结束,其余类似看例子
     */


    public static void bubbleSort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) { //最多做n-1趟排序
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) { //对当前无序区间score[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)
                    //第一趟就把最小的元素交换到了最后面，所以里面的范围是一直在做减少的操作
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        /**
         * 给定一个数组，从数组的第二位进行比对，插入操作
         */
        int[] a = new int[]{9, 3,3,6, 6, 1, 2, 8};
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("排序之后：");
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

}


