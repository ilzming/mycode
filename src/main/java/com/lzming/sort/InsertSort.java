package com.lzming.sort;

/**
 * Created by liuzengming on 2016/11/7.
 *
 * 直接插入排序：
 * 基本思想：在要排序的一组数中，假设前面(n-1)[n>=2]个数已经是排序好的
 *
 */
public class InsertSort {

    /**
     * 时间复杂度O(n^2)
     */
    public void insertSort(int[] a) {
        //待插入元素
        int temp;
        //第一个当作已经排好序的
        for (int i=1,len=a.length; i<len; i++) {
            int j = i - 1;
            temp = a[i];
            //通过循环，逐个后移一位找到要插入的位置
            for (; j>=0 && temp<a[j] ; j--) {
                a[j+1] = a[j];
            }
            a[j+1] = temp; //插入
        }
    }
}
