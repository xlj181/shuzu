package dey;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个四位整数：");
        int num = scan.nextInt();
        int qianw = (num / 1000 + 5) % 10;
        int baiw = (num / 100 %10+ 5) % 10;
        int shiw = (num / 10 %10+ 5) % 10;
        int gew = (num % 10 + 5) % 10;
        int a = qianw * 1000 + baiw * 100 + shiw * 10 + gew;
        //System.out.println(a);


    }
}
