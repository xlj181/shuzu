import jdk.internal.util.xml.impl.Input;
import jdk.nashorn.internal.parser.Scanner;

public class Demo3 {
    public static void main(String[] args) {
       /* String name="小明";
        int age=25;
        int job=3;
        String jishu="Java";
        String hobby="篮球";
        System.out.println("这个同学的姓名："+name);
        System.out.println("年龄是："+age);
        System.out.println("工作了"+job+"年了");
        System.out.println("技术方向是"+jishu);
        System.out.println("兴趣爱好："+hobby);*/
      /* double r=2;
        final double  PI =3.14;
        double sum=r*r*PI;
        System.out.println(sum);*/
      /*
       需求说明：正确使用Scanner的常用方法，接收控制台输入的“姓名”和“号码”，
       当两次输入的值分别为“张三”和“100”时


       Scanner scan=new Scanner(System.in);
        System.out.print("请输入您的名字：");
        String name=scan.next();
        System.out.print("请输入您的号码：");
        int haoma=scan.nextInt();
        System.out.println(name+"您好！您的等待号码为："+haoma);
        */
       /*
       需求说明：使用Scanner类获取键盘输入的会员卡号“8349”，
       并将该数据存储在变量中


       Scanner scan=new Scanner(System.in);
            System.out.println("请输入4位会员卡号：");
            int member=scan.nextInt();
        System.out.println("您的会员卡号是："+member);*/
     /*
      需求说明：使用变量以及赋值运算符
      实现两个int类型数据num1和num2的交换

      int num1=5;
       int num2=6;
        System.out.println("交换前：");
        System.out.println(num1);
        System.out.println(num2);
        int sum=num1+num2;
          num1=sum-num1;
        num2=sum-num1;
        System.out.println("交换后：");
        System.out.println(num1);
        System.out.println(num2);*/

     /*   Scanner scan=new Scanner(System.in);
        System.out.print("输入张浩的Java成绩：");
        int grade=scan.nextInt();
            if(grade>90){
                System.out.println("老师说：不错，奖励一个iPhone！");
            }
        */


      /*  Scanner scan=new Scanner(System.in);
        System.out.print("输入张浩的Java成绩：");
            int grade=scan.nextInt();
        System.out.print("输入张浩的音乐成绩：");
            int grade1=scan.nextInt();
            if(grade>90&&grade1>80||(grade==100&&grade>70)){
                System.out.println("老师说：不错，奖励一个iPhone！");
            }
            */

      /*
            Scanner scan=new Scanner(System.in);
        System.out.print("输入张浩的Java成绩：");
        int grade=scan.nextInt();
        if(grade>90){
            System.out.println("给予奖励！");
        }else{
            System.out.println("老师说：惩罚蹲5分钟马步！");
        }
        */

       /* Scanner scan=new Scanner(System.in);
             System.out.print("请输入考试成绩：");
        int grade=scan.nextInt();
        if(grade>80){
            System.out.println("良好");
        }else if(grade>=60){
            System.out.println("中等");
        }else{
            System.out.println("差");
        }
            */

       /*
            Scanner scan=new Scanner(System.in);
        System.out.print("输入比赛成绩（s):");
            double grade=scan.nextDouble();
        System.out.print("输入性别：");
                String sex=scan.next();
            if(grade<10){
                if(sex.equals("男")){
                    System.out.println("您进入了男子组决赛");
                }else if(sex.equals("女")){
                    System.out.println("您进入了女子组决赛");
                }else{
                    System.out.println("对不起，您的性别不符合参赛要求");
                }


            }else{
                System.out.println("您的成绩不合格，进不了决赛");
            }
            */


        /*  Scanner scan=new Scanner(System.in);
        System.out.print("输入考试名次：");
            int rank=scan.nextInt();
            switch (rank){
                case 1:
                    System.out.println("麻省理工游");
                    break;
                case 2:
                    System.out.println("笔记本一台");
                    break;
                case 3:
                    System.out.println("移动硬盘一部");
                    break;
            }
            */

      /*
        Scanner scan=new Scanner(System.in);
        System.out.print("输出星期数子（1~7）：");
         int week=scan.nextInt();
         switch (week){
             case 1:
                 System.out.println("星期一");
                 break;
             case 2:
                 System.out.println("星期二");
                 break;
             case 3:
                 System.out.println("星期三");
                 break;
             case 4:
                 System.out.println("星期四");
                 break;
             case 5:
                 System.out.println("星期五");
                 break;
             case 6:
                 System.out.println("星期六");
                 break;
             case 7:
                 System.out.println("星期日");
                 break;
         }
         */

      /*      int i=0;
            while(i<=50){
                System.out.println("打印第"+(i)+"份试卷");
                i++;
            }
            */
      /*
            int i=2;
            int sum=0;
            while(i<101){
                sum+=i;  i+=2;
            }
        System.out.println(sum);
        */

    /*  int i=2;
      int sum=0;
      do{
          sum=sum+i;
          i+=2;
      }while(i<101);
        System.out.println(sum);
        */

     /* double sum=0;
      double ave=0.0;
      int fs=0;
      Scanner scan=new Scanner(System.in);
        System.out.print("请输入学生的姓名：");
        String name=scan.next();
        //i:当前是几门功课
        //sum:记录总分
        //ave:平均分
        for(int i=1;i<=5;i++){
            System.out.print("请输入第"+i+"门功课成绩：");
            double score= scan.nextDouble();
            sum=sum+score;
        }
        ave=sum/5;
        System.out.println("5门功课的平均分是："+ave);
        */

       /* int i=0;
        int sum=0;
        while(i<=50) {
            if(i%7==0){
                sum += i;
            }
           i++;
        }
        System.out.println(sum);*/

       /*int i=1;
       int sum=0;
       do{
           if(i%7==0){
               sum+=i;
           }
           i++;
       }
       while(i<50);
        System.out.println(sum);
        */


    }
}
