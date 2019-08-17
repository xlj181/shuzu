import java.util.Scanner;

public class Demo1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //正确的信息
        int rightUser=10000;
        int rightPwd=123456;

        //登录 for处理业务，不要把结果语句放到循环输出
        boolean flag=false;//保存最终的登录结果，假设没有登录成功
        for (int i=0;i<3;i++) {
            System.out.print("账号：");
            int inputUser = input.nextInt();
            System.out.print("密码：");
            int inputPwd = input.nextInt();

            if(rightUser==inputUser && rightPwd==inputPwd){
                //不循环
                flag=true;//成功
                break;
            }
        }
        //处理结果：循环外层
        if(flag) {
            System.out.println("登录成功");
        }else {
            System.out.println("三次机会用完了，账号或密码输入错误，已锁定");
        }
    }
}

