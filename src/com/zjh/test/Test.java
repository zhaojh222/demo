package com.zjh.test;

/**
 * Created by jiazhao on 6/14/18.
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        callArr(arr[0],arr);
        System.out.println(arr[0] + "," + arr[1]);
    }

    static void callArr(int i,int arr[]){
        arr[i] = 6;
        i = 5;
    }
}

