package dey;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String[] arrs=new String[4];
        for(int i=0;i<arrs.length;i++){
            arrs[i]=scan.next();
        }
        System.out.println(Arrays.toString(arrs));

    }
}
