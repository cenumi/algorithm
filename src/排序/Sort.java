package 排序;

public class Sort {

    public static void main(String[] args) {
        int[] arr = {1,5,6,8,2,34,67,32,89,3,22,33};
    }

    /**
     * 交换数组内的指定两个元素
     * @param arr 指定数组
     * @param i 待交换元素角标
     * @param j 待交换元素角标
     */
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap2(int[] arr,int i,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static boolean isNotArray(int[] arr){
        return (arr == null || arr.length < 2);
    }

    /**
     * 冒泡排序 O（N^2）
     * @param arr 待排序数组
     */
    public static void bubbleSort(int[] arr){
        if (isNotArray(arr))
            return;
        for (int end = arr.length -1; end > 0; end-- ){
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    /**
     * 选择排序 O(N^2)
     * @param arr 待排序数组
     */
    public static void selectionSort(int[] arr){
        if (isNotArray(arr))
            return;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1 ; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr,i,minIndex);
        }
    }


    /**
     * 插入排序 O(N^2)
     * @param arr 待排序数组
     */
    public static void InsertionSort(int[] arr){
        if (isNotArray(arr))
            return;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0 && arr[j] > arr[j+1]; j--) {
                swap(arr,j,j+1);
            }
        }
    }

    /**
     * 快速排序
     * 经典快排：以数组最后一个数作为划分值
     *         问题是划分出的区域不一定是等规模的
     * 改进快排（使用荷兰国旗）：以数组最后一个数作为划分值，划分成3个区域，小于，等于，大于，然后递归小于和大于部分
     *
     * @param arr 待排序数组
     */
    public static void quickSort(int[] arr,int l,int r){
        if (l < r){
            int[] p = partition(arr,l,r);
            quickSort(arr,l,p[0] - 1);
            quickSort(arr,p[1] + 1,r);
        }
    }

    private static int[] partition(int[] arr,int l,int r){
        int less = l - 1;
        int more = r;
        int cur = l;

        while (cur < more){
            if (arr[cur] < arr[r]){
                swap(arr,++less,cur++);
            }else if (arr[cur] > arr[r]){
                swap(arr,--more,cur);
            }else{
                cur++;
            }
        }
        swap(arr,more,r);
        return new int[]{less+1,more};
    }

    /**
     * 堆排序
     *
     */
    public static void bigRootHeapSort(int[] arr){
        if (isNotArray(arr))
            return;
        for (int i = 0; i < arr.length; i++) {
            bigRootHeapInsert(arr,i);
        }
        int heapSize = arr.length;
        swap(arr,0,--heapSize);
        while (heapSize>0){
            heapify(arr,0,heapSize);
            swap(arr,0,--heapSize);
        }
    }

    private static void bigRootHeapInsert(int[] arr,int index){
        while(arr[index] > arr[(index - 1) / 2]){
            swap(arr,index,(index - 1) / 2);
            index = (index - 1) / 2;
        }
    }
    
    private static void heapify(int[] arr,int index,int heapSize){
        int left = index * 2 + 1;
        while (left < heapSize){
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left]?left + 1:left;
            largest = arr[largest] > arr[index] ? largest :index;
            if (largest == index){
                break;
            }
            swap(arr,largest,index);
            index = largest;
            left = index *  2 + 1;
        }
    }










}
