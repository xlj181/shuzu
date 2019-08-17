package dey;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入月份：");
        int yue=scan.nextInt();
        switch (yue){
            case 3:
            case 4:
            case 5:
                System.out.println(yue+"是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(yue+"是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(yue+"是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(yue+"是冬季");
                break;
                    default:
                        break;
        }
    }
}
