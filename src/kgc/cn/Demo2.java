package kgc.cn;

import java.util.Scanner;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
    /*1.Scanner提示用户输入学员的身高
      身高：cm  175  int
      */
        /*Scanner input = new Scanner(System.in);
//        2.输入要录取的学生个数
        System.out.print("请输入学生人数：");
        int num = input.nextInt();
        //        3.根据个数定义数组，默认值0
        int[] heights = new int[num];
        //3-1 给数组空间赋值
        for (int i = 0; i < heights.length; i++) {
            System.out.print("请输入要录入的第" + (i + 1) + "个学生的身高：");
            heights[i] = input.nextInt();
        }*/
   /*     4.打印数组的数据，格式
        175,168,188,190*/
        /*
        i=0  175,
        i=1  175,168,
        。。
        i=3  175,168,188,190,
         */
        /*for (int i = 0; i < heights.length; i++) {
            //如果是输出最后一个数据，不添加逗号
            if (i == heights.length - 1) {
                System.out.println(heights[i]);
                continue;
            }
            System.out.print(heights[i] + ",");
        }

        //     5. 平均身高：？
        int sum = 0;//总和
        for (int height : heights) {
            sum += height;
        }
        System.out.println("平均值:"+sum / num);*/

    /*   最高的是：？
       最矮的是：？*/
        /*int max = heights[0];
        int min = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (max < heights[i]) {
                max = heights[i];
            }
            if (min > heights[i]) {
                min = heights[i];
            }
        }

        System.out.println("最大值："+max);
        System.out.println("最小值："+min);*/


        /*int[] numbers = new int[]{1,5,24,56,65,0};  //这个数组的长度是6，最后一个元素0是为数据插入预留的空间

      //  int num = 6;    //用我们的6做例子，当然可以进行键盘输入

        //键盘输入的方式
            Scanner input = new Scanner(System.in);
            System.out.println("请输入插入的数据:");
            int num = input.nextInt();


        int index = numbers.length-1;   //用来保存插入的下标，默认是最后一个位置
        //遍历数组，寻找插入的位置
        for(int i = 0;i < numbers.length-1;i++)     //我们不需要比较那个预留的空间，所以i < numbers.length-1
        {
            if(numbers[i] >num)    //一旦找到某个数比num大的，就表示num要插入到它的位置上
            {
                index = i;      //记录下标并退出循环
                break;
            }
        }

        //这个循环实现元素后移
        for(int i = numbers.length-1;i > index;i--) //要从倒数的最后一个元素开始后移
        {
            numbers[i] = numbers[i-1];  //把前一个元素后移
        }
        numbers[index] = num;

        System.out.println(Arrays.toString(numbers));*/


        /*int[] numbers = new int[]{1,5,24,56,65,0};  //这个数组的长度是6，最后一个元素0是为数据插入预留的空间


        Scanner input = new Scanner(System.in);
        System.out.print("请输入插入的数据:");

        numbers[numbers.length-1] = input.nextInt();

        Arrays.sort(numbers);       //sort进行方法升序排序
        System.out.println(Arrays.toString(numbers));*/


        //字符排序
        char[] chars = new char[9];

        chars[0] = 'a';
        chars[1] = 'c';
        chars[2] = 'u';
        chars[3] = 'b';
        chars[4] = 'e';
        chars[5] = 'p';
        chars[6] = 'f';
        chars[7] = 'z';

        System.out.print("原字符序列：");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        Arrays.sort(chars);   //对数组进行升序排序
        System.out.print("\n升序排序后：");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }

        //实现插入字符
        /*int index = chars.length;  //保存新增成绩插入位置
        char ch = 'm';
        System.out.println("\n待插入的字符是： " + ch);

        //找到新元素的插入位置
        for (int i = 0; i < chars.length; i++) {
            if (ch < chars[i]) {
                index = i;
                break;
            }
        }
        //元素后移
        for (int j = chars.length - 1; j > index; j--) {
            chars[j] = chars[j - 1]; //index下标开始的元素后移一个位置
        }
        chars[index] = ch;//插入数据
        System.out.println("插入字符的下标是：" + index);
        System.out.print("插入后的字符序列是： ");
        for (int k = 0; k < chars.length; k++) { // 循环输出目前数组中的数据
            System.out.print(chars[k] + " ");
        }

*/

        /* Scanner input=new Scanner(System.in);
        String[] menus={"新增","删除","修改","查找","排序"};
        do {
            System.out.println("===============欢迎============");
            System.out.println("输出功能菜单");
            //菜单当成数组
            for (int i=0;i<menus.length;i++) {
                System.out.println((i+1)+". "+menus[i]+"  ");
            }
            System.out.println("请选择要操作的功能编号：");
            int id = input.nextInt();
            switch (id){
                case 1://新增
                    System.out.println("新增");
                    break;
                case 2://删除

                    break;
                default:
                    System.out.println("请升级！！");
                    break;
            }
            System.out.println("是否继续使用该系统？输入yes表示继续，输入其他表示退出系统");
            if(!input.next().equals("yes")){
                break;
            }
        } while (true);*/
    }

}


