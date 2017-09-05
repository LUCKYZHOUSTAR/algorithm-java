package cmc.lucky.algorithm;

/**
 * @Author:chaoqiang.zhou
 *
 * 前提：数组是有序的数组
 * @Description:二分查找
 * @Date:Create in 11:17 2017/9/5
 */
public class BinarySearch {


    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(rank4(3, array));
    }

    /**
     * 前提条件是有序的数组，进行查找该值的位置
     * 7
     * [1,2,3,4,5,6,7,8]
     * [1,2,3,4]-[5,6,7,8]
     * [6,7,8]
     * [6,7]-[8]
     * [1,2,3,4]
     * [1,2] [3]
     *
     * @param key
     * @param a
     * @return
     */
    public static int rank(int key, int[] a) {
        //二分查询，进行不断的拆分该数组
        //数组的长度
        int length = a.length - 1;
        int mid = length / 2;
        //判断的标志信息,这样写有问题，不是二分查找，
        while (mid >= 0 && mid < a.length) {
            //这样写有问题，不是二分查询，只进行了一次拆分后面并没有进行查分
            if (key < a[mid]) mid = mid - 1;
            else if (key > a[mid]) mid = mid + 1;
            else return mid;
        }
        return -1;
    }


    //正确的写法，采取基准点，引入变量操作
    public static int rank4(int key, int[] a) {
        //二分查询，进行不断的拆分该数组
        //数组的长度
        int length = a.length - 1;
        //基准点
        int ho = 0;
        //判断的标志信息,这样写有问题，不是二分查找，
        while (ho <= length) {
            //这样写有问题，不是二分查询，只进行了一次拆分后面并没有进行查分
            int mid = ho + (length - ho) / 2;
            if (key < a[mid]) {
                length = mid - 1;

            } else if (key > a[mid]) {
                ho = mid + 1;

            } else return mid;
        }
        return -1;
    }


    public static int rank3(int key, int[] a) {
        //二分查询，进行不断的拆分该数组
        //数组的长度
        int length = a.length - 1;

        int ho = 0;
        int hi = a.length - 1;
        //判断的标志信息,这样写有问题，不是二分查找，
        while (ho <= hi) {
            //需要在循环里面每次进行拆分,这样写也有问题，得加上一个标志位
            int mid = ho + (hi - ho) / 2;
            //这样写有问题，不是二分查询，只进行了一次拆分后面并没有进行查分
            if (key < a[mid]) hi = hi - 1;
            else if (key > a[mid]) ho = mid + 1;
            else return mid;
        }
        return -1;
    }


    public static int rank2(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
