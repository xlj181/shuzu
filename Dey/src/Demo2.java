import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
       /* double score=89.5;
        String name="张三";
        char sex='男';
        System.out.println("本次考试成绩最高分："+score);
        System.out.println("最高分得主："+name);
        System.out.println("性别："+sex);*/

        /*Scanner scan=new Scanner(System.in);
        System.out.print("请输入一个数值：");
        int num=scan.nextInt();
        for(int i=0,j=num;j>=0;j--,i++)
            System.out.println(i+"+"+j+"="+(i+j));*/

       /* Scanner scan=new Scanner(System.in);
        System.out.print("请输入一个数：");
        int num=scan.nextInt();
        if (num==1){
            System.out.println("您输入的数字是1");
        }else{
           num--;
            System.out.println("num自减的值是："+num);
        }*/

       /*//计算n!   1*2*3*....*n
        Scanner scan=new Scanner(System.in);
         System.out.print("请输入一个正整数：");
            int n=scan.nextInt();
            int sum=0;
             int result=1;//阶乘的最终结果
        for(int i=1;i<=n;i++){
            result *= i;
            sum += result;
        }
            System.out.println(n+"的阶乘是"+result);
            System.out.println("1!+2!+3!+....+"+n+"!="+sum);*/

          /* //计算30人的平均分，使用数组实现
           //数组长度：数组名字.length
          double[] scores=new double[3];
            Scanner scan=new Scanner(System.in);
            //记录总分
            double sum=0;
            for(int i=0;i<scores.length;i++){
                System.out.print("请输入第"+(i+1)+"个同学成绩：");
                //为数组的30个格子赋值
                scores[i]=scan.nextInt();
                sum += scores[i];
            }
            //计算平均分
            double avg = sum/scores.length;
        System.out.println("班级学员的平均分是："+avg);*/

         /* for(int i=1;i<=4;i++){
              switch (i){
                  case 1:
                      System.out.print('a');
                  case 2:
                      System.out.print('b');
                      break;
                  case 3:
                      System.out.print('c');
                  case 4:
                      System.out.print('d');
                      break;
              }
          }*/

        /*我国古代数学家张邱建在《算经》中出了一道“百钱买百鸡”的问题，
        题意是这样的： 5文钱可以买一只公鸡，3文钱可以买一只母鸡，1文钱可以买3只雏鸡。
        现在用100文钱买100只鸡，那么各有公鸡、母鸡、雏鸡多少只？请编写程序实现。*/
         /*int j=0;
         for(int gj=0;gj<=20;gj++){
             for(int mj=0;mj<=33;mj++){
                 for(int zj=0;zj<=300;zj++){
                     if(5*gj+3*mj+zj/3==100&&gj+mj+zj==100){
                         j++;
                         System.out.println("公鸡："+gj+"\t母鸡："+mj+"\t雏鸡："+zj);
                     }
                 }
             }
          }*/


         /*  題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
         小兔子长到第三个月后每个月又生一
        对兔子，假如兔子都不死，问每个月的兔子总数为多少？
       刚开始真的无从下手，这么难的，怎么可以说是基础呢，
        感觉这些应该是逻辑分析很强的，第一个月只有一对兔子，
        第二个月还是只有一对兔子，第三个月，就有两对了，
        第四个月3对，第五个月5对，第六个月8对，第七个月是13对
        */
        /* //i表示月份，
         int i;
         long arr[]=new long[36];   // 这个数组时用来计算每个月的兔子对数
          arr[0]=arr[1]=1;
        System.out.println("第一个月有兔子1对"+","+"总数是"+2);
        System.out.println("第2个月有兔子1对"+", "+"总数是"+2);
            for(i=2;i<=35;i++){
                arr[i]=arr[i-1]+arr[i-2];
                System.out.println("第"+i+"个月有兔子"+arr[i]+"对"+", "+"总数是"+2*arr[i]);
                //规律是：每个数字都是前面两个数字之和
            }*/
//
        Scanner scan = new Scanner(System.in);
        while (true) {
        System.out.print("请输入行数：");
        int rows = scan.nextInt();

            for (int i = -rows / 2; i <= rows / 2; i++) {
                for (int k = 1; k <= Math.abs(i); k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= rows - 2 * Math.abs(i); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("输入yes继续打印");
            String an=scan.next();
            if(!an.equals("yes")){
                break;
            }
        }
    }
}