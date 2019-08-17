package kgc.cn;

public class Ad {
    public static void main(String[] args) {
        shellSort(a);
    }
    static  int a[]={30,25,28,40,15,10,38,35,20,26};
    public static void shellSort(int[] a){
        int d = a.length;
        while(true) {
            d = (int) Math.ceil(3);
            for (int i = 0; i <= d; i++) {//
                //直接插入排序  j j+d j+2d ...
                for (int j = i; j < a.length-d; j+=d) {
                    int k = j;//j以前部分已经为有序
                    int insertNum = a[k+d];  //要插入的数据
                    while(k >= j && a[k] > insertNum){
                        a[k+d] =a[k];
                        k-=d;
                    }//跳出循环 a[k] < insertNum,
                    //所以k后面的是要插入的位置
                    //if ((k+d)!= j) {
                    a[k+d] = insertNum;
                    //}
                }
            }
            if (d == 1) {
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }
    }


}
