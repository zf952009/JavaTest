package in.itcast.utils;

import com.sun.org.apache.bcel.internal.generic.RET;

/**
 * 排序大全
 * */
public class SortUtils {
    /**
     *冒泡排序
     * */
    public static int[] sort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;i<arr.length-1;j++){
                int temp = 0;
                if(arr[j] < arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    /**
     * 冒泡优化排序
     * */
    public static int[] sort1(int arr[]){
        for( int i = 0;i < arr.length - 1 ; i++ ){
            boolean isSort = true;
            for( int j = 0;j < arr.length - 1 - i ; j++ ){
                int temp = 0;
                if(arr[j] < arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSort = false;
                }
            }
            if(isSort){
                break;
            }
        }
        return arr;
    }
    /**
     * 选择排序
     * */
    public static int[] sort2(int arr[]){
        for( int i = 0;i < arr.length ; i++ ){
            int min = i;//最小元素的下标
            for(int j = i + 1;j < arr.length ; j++ ){
                if(arr[j] < arr[min]){
                    min = j;//找最小值
                }
            }
            //交换位置
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

}
