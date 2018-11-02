package sword;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class 数字在排序数组中出现的次数 {

    /**
     * 统计一个数字在排序数组中出现的次数。
     */

    public static void main(String[] args) {
        int[] arr = new int[]{12,12,12,12,13,13,14,15};
        System.out.println(new 数字在排序数组中出现的次数().GetNumberOfK(arr,13));
    }

    public int GetNumberOfK(int [] array , int k) {
        if(array==null||array.length==0)
            return 0;
        int first=getFirstK(array,k,0,array.length-1);
        int last=getLastK(array,k,0,array.length-1);
        if(first==-1 ||last==-1){
            return 0;
        }
        else{
            return last-first+1;
        }

    }

    public  int getFirstK(int[] array,int k,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(k<array[mid])
                end=mid-1;
            else if(k>array[mid])
                start=mid+1;
            else{
                if((mid>0&&array[mid-1]!=k)||mid==0)
                    return mid;
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    public  int getLastK(int[] array,int k ,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(k<array[mid])
                end=mid-1;
            else if(k>array[mid])
                start=mid+1;
            else{
                if((mid<array.length-1&&array[mid+1]!=k)||mid==array.length-1)
                    return mid;
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }

}
