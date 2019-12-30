package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Relative_Sort_Array_1122 {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] ans = relativeSortArray(arr1, arr2);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    //    思路： 1. 创建一个数组长度小于等于1001 = list
//2. 将arr1循环放入到list中arr1中的值作为下标，value为出现的次数
//3. 循环arr2，根据对应下标取出value,循环添加当前下标value次，然后将value赋值为0；
//4. 循环list，将value值不等于1的循环添加到数组末尾
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] tmp = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            tmp[arr1[i]]++;
        }
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            int num = arr2[i];
            for (int j = 0; j < tmp[num]; j++) {
                arr1[index++] = num;
            }
            tmp[num] = 0;
        }
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] != 0) {
                for (int j = 0; j < tmp[i]; j++) {
                    arr1[index++] = i;
                }
            }
        }

        return arr1;

    }

}
