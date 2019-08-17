package kgc.cn;

import com.sun.xml.internal.ws.message.ByteArrayAttachment;

import java.util.Arrays;
import java.util.Scanner;

public class Deno1 {
    public static void main(String[] args) {
        /*int[] arr={12,33,44};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
        }*/

        /*//1.定义一个数组
        int[] arr={1,7,8,9};
        int sum=0; //记录每次累加的和
        //2.取出数组中的每个元素
        //arr.length求数组的长度 4
        for(int i=0;i<arr.length;i++){
            //3.对取出的每个元素累加
            sum+=arr[i];//sum=0+arr[0] sum=1
                        //sum=1+arr[1] sum=8
                        //....
        }
        //4.循环结束把所有的数组中的元素都累加
        System.out.println(sum);*/


        /*int[] arr={8,1,6,9};
        //2.先用max存储数组中的第一个元素
        int max=arr[0];  //max

        //3.开始打擂从数组的第二个元素开始
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){  //相当于当前人能够打败擂台上的人
                max=arr[i];  //相当于擂台上的人被覆盖
            }
        }
        //整个循环走完相当于把整个数组中的元素都比较一遍，选出最大的
        System.out.println(max);  //相当于打擂最强人*/


        //求最小值
       /*
      int[] arr={1,3,6,9};
        int mini=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        System.out.println(mini);*/


           /* double sum=0;
            double[] arr={170.3,185.4,169.5,174.6,188.7};
            double max=arr[0];
            double min=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
                if(arr[i]<min) {
                    min = arr[i];
                }
                sum+=arr[i];
            }
        System.out.println("身高最高的事："+max+"\n身高最矮的是："+min+"\n身高平均值是："+sum/5+"\n身高总和是："+sum);*/

      /*  Scanner input=new Scanner(System.in);
        //新增，默认值null
        String[] names=new String[]{"jack",null,"tom",null,null,"lucy"};
        //让用户输入的一个查找的学生姓名，
        System.out.println("请输入要查找的学生姓名：");
        String findName = input.next();

        //1.循环数组，依次比较，判断查找的学生对应的位置
        //出现异常：NullPointerException  空指针异常
        /*
        异常发生原因：null.equals() 一定出NullPointerException错误
        null:表示数据在堆中不存在
         */
       /* int index=-1;
        for(int i=0;i<names.length;i++){
            if(names[i]==null){
                //跳过
                continue;
            }
            if(names[i].equals(findName) ){  //判断
                //找到了
                index=i;

                break;
            }
        }
        //2.根据查找的结果，输出对应提示信息
        if(index>-1){
            System.out.println("找到了，所在的位置是："+index);
        }else{
            System.out.println("查无此人");
        }
           */


        /*   String[] names=new String[]{"jack",null,"tom",null,null,"lucy"}*/

        /*Scanner scan=new Scanner(System.in);
        System.out.print("请输入学生姓名：");
            String name=scan.next();
        String[] names=new String[]{"jack",null,"tom",null,null,"lucy"};
         int index=-1;
        for(int i=0;i<names.length;i++){
                if(names[i]==null){
                    continue;
                }
            if(names[i].equals(name)){
                index=i;
                break;
            }
        }
        if(index>-1){
            System.out.println("找到此人，位置在："+index);
        }
        else{
            System.out.println("查无此人！！");
        }*/


        /*canner input=new Scanner(System.in);
        //新增，默认值null
        String[] names=new String[]{"jack",null,"tom",null,null,"lucy"};
        //让用户输入的一个查找的学生姓名，
        System.out.println("请输入要修改的学生姓名：");
        String findName = input.next();

        //先找
        int index=-1;//保存查找的位置
        for(int i=0;i<names.length;i++){
            //排除null
            if(names[i]==null){
                continue;
            }
            //数组每一个位置的值与findName判断
            if(names[i].equals(findName)){
                index=i;
                break;
            }
        }

        if(index==-1){
            System.out.println(findName+"不存在，无法修改");
            return;
        }

        System.out.println(findName+"修改后的新名称：");
        String newName = input.next();

        //显示修改后的结果
        names[index]=newName;

        for(String name:names){
            if(name==null){
                continue;
            }
            System.out.print(name+"  ");
        }*/


        // 修改

        /*Scanner scan=new Scanner(System.in);
        System.out.print("请输入学生姓名：");
            String name1=scan.next();
        String[] names=new String[]{"jack",null,"tom",null,null,"lucy"};
         int index=-1;
        for(int i=0;i<names.length;i++){
                if(names[i]==null){
                    continue;
                }
            if(names[i].equals(name1)){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println(name1+"不存在，无法修改");
            return;
        }
            System.out.println(name1+"修改后的新名字：");
                String newName=scan.next();

        names[index]=newName;
        for(String name:names){
            if(name==null){
                continue;
            }
            System.out.print(name+" ");
        }*/

        /*Scanner scan=new Scanner(System.in);
        System.out.println("输入学生人数：");
       int sg=scan.nextInt();
        int[]arr=new int[sg];
            for(int i=0;i<arr.length;i++){
                System.out.print("请输入要录入的第" + (i + 1) + "个学生的身高：");
                arr[i] = scan.nextInt();
            }
        for (int i = 0; i < arr.length; i++) {
            //如果是输出最后一个数据，不添加逗号
            if (i ==arr.length - 1) {
                System.out.println(arr[i]);
                continue;
            }
            System.out.print(arr[i] + ",");
        }
        //     5. 平均身高：？
        int sum = 0;//总和
        for (int height : arr) {
            sum += height;
        }
        System.out.println("平均值:"+sum /sg);
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                max=arr[i];
                System.out.print("最高的是："+arr[i]+"cm");
            }
            if(arr[i]<min){
                min=arr[i];
                System.out.println("z最爱的是："+arr[i]+"cm");
            }
        }
*/
        //冒泡排序
       /* int[] arrs={164,177,155,186,180};
        for(int i=0;i<arrs.length-1;i++){
            for(int j=0;j<arrs.length-1-i;j++){
                if(arrs[j]>arrs[j+1]){
                    int temp=arrs[j];
                    arrs[j]=arrs[j+1];
                    arrs[j+1]=temp;
                }
            }
        }
        System.out.println("排序后的结果：");
        for(int arr:arrs){
            System.out.print(arr+" ");
        }*/


        //选择排序
        /*int[] scans={155,167,188,170,160};
        for(int i=0;i<scans.length;i++){              //控制比较轮次
            for(int j=i+1;j<scans.length;j++){         // 控制比较次数
                if(scans[i]>scans[j]){
                    int temp=scans[i];
                    scans[i]=scans[j];
                    scans[j]=temp;
                }
            }
        }
        for(int i=scans.length-1;i>=0;i--){    //逆序的排放
            System.out.print(scans[i]+" ");
        }
        System.out.println();
        System.out.println("排序后的值：");
        for(int scan:scans){
            System.out.print(scan+" ");
        }*/


      /*  int[] arr ={ 12, 33, 55, 0, 23, 44 };
        //排序   升序
        Arrays.sort(arr);
        //查看排序后的结果
        System.out.println(Arrays.toString(arr));
        //二分法查找前提：数组必须升序排列
        //findIndx:查找200，找到了，给你200在排序后的数组中的下标
        int findIndex=Arrays.binarySearch(arr, 33);
        System.out.println(findIndex>-1?"找到了":"不存在");*/


       /* int[][] school = new int[4][5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < school.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个班级");
            for (int j = 0; j < school[i].length; j++) {
                System.out.print("请输入第" + (j + 1) + "个学生成绩");
                school[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < school.length; i++) {
            System.out.println((i + 1) + "班：" + Arrays.toString(school[i]));
        }*/


       /* for(int i=0;i<school.length;i++){
            int[] clazz=school[i];
            int sum=0;
            for(int per:clazz){
                sum+=per;
            }
            System.out.println("总分："+sum);
            System.out.println("平均分："+(sum/clazz.length));
            Arrays.sort(clazz);
            System.out.println("最大值："+clazz[clazz.length-1]);
            System.out.println("最小值："+clazz[0]);
        }*/
    }

}