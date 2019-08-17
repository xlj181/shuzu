package dey;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        int[] arrs=new int[10];
        int a=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入10个数字:");
        for(int i=0;i<arrs.length;i++) {
            arrs[i] = scan.nextInt();
            if (arrs[i] > 10) {
                a++;
            }
        }
            int[]arrs1=new int[arrs.length-1];
                a=0;
                for(int i=0;i<arrs.length;i++){
                    if(arrs[i]<10){
                        arrs1[a++] =arrs[i];
                    }

                }
        System.out.println(Arrays.toString(arrs1));
    }
}
