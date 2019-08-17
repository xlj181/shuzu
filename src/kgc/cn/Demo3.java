package kgc.cn;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {

        String[] name = new String[6];          //名字
        boolean[] state = new boolean[6];       //是否可借的状态
        int[] time = new int[6];                //借出日期
        int[] count = new int[6];                //借出次数
        name[0] = "流浪地球";
        state[0] = true;
        time[0] = 1;
        count[0] = 0;

        name[1] = "速度与激情8";
        state[1] = false;
        time[1] = 1;
        count[1] = 5;

        name[2] = "喜剧之王";
        state[2] = true;
        time[2] = 1;
        count[2] = 0;

        name[3] = "功夫";
        state[3] = false;
        time[3] = 1;
        count[3] = 5;
        Scanner scan = new Scanner(System.in);
        int num = -1;                           //用户输入0返回主菜单，否则退出系统
        int index = -1;

        boolean isExit = false;                //标志用户是否退出系统，true为退出系统
        String[] names = {"新增", "查看", "删除", "借出", "归还", "退出"};
        do {
            System.out.println("欢迎使用迷你DVD管理器");
            System.out.println("------------------------------");
            System.out.println("输出菜单功能");
            for (int i = 0; i < names.length; i++) {
                System.out.println((i + 1) + ". " + names[i] + "  ");
            }
            System.out.println("------------------------------");
            System.out.println("请选择：");
            int id = scan.nextInt();
            switch (id) {

                case 1:
                    System.out.println("-->新增");
                    System.out.println("请输入DVD名称：");
                    String dvdName = scan.next();

                    for (int i = 0; i < name.length; i++) {
                        if (name[i] == null) {
                            index = i;
                            break;
                        }
                    }
                    if (index == -1) {
                        System.out.println("货架已满");
                    } else {
                        name[index] = dvdName;
                        System.out.println("新增《" + dvdName + "》成功！");
                    }

                    System.out.println("*************************");
                    break;
                case 2:
                    System.out.println("-->查看");
                    System.out.println("影片\t\t是否借出\t日期\t归还");
                    for (int i = 0; i < name.length; i++) {
                        if (name[i] != null) {
                            System.out.println(name[i] + '\t' + '\t' + state[i] + '\t' + time[i] + '\t' + '\t' + count[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("-->删除");
                    System.out.println("请输入要删除的影片：");
                    String movie = scan.next();
                    for (int i = 0; i < name.length; i++) {

                        if (name[i] != null && name[i].equals(movie)) {
                            index = i;
                            break;
                        }
                    }
                    if (index != -1) {
                        for (int i = index; i < name.length - 1; i++) {
                            name[i] = name[i + 1];
                            state[i] = state[i + 1];
                            time[i] = time[i + 1];
                            count[i] = count[i + 1];
                        }

                        name[name.length - 1] = null;
                        //可借状态
                        state[state.length - 1] = true;
                        time[time.length - 1] = 0;
                        count[count.length - 1] = 0;
                        System.out.println("成功删除！");
                    } else {
                        System.out.println("没有您要删除的内容！");
                    }

                    break;
                case 4:
                    System.out.println("-->借出");
                    System.out.print("请输入指定影片：");
                    String movies = scan.next();

                    for (int i = 0; i < name.length; i++) {
                        if (name[i] != null && name[i].equals(movies)) {
                            index = i;
                        }
                    }
                        if (state[index]) {
                            System.out.print("请输入借出日期：");
                            int times = scan.nextInt();
                            while (times < time[index] || times > 31) {
                                System.out.println("必须输入1-31的数字:");
                                times = scan.nextInt();
                            }
                            count[index]++;
                            time[index] = times;

                            System.out.println(movies + "借出成功！");
                        } else {
                            System.out.println("已经借出！");
                        }


                    System.out.println("*************************");
                    break;
                case 5:
                    System.out.println("-->归还");
                    System.out.println("请输入影片：");
                    String movie1 = scan.next();

                    for (int i = 0; i < name.length; i++) {
                        if (name[i] != null && name[i].equals(movie1)) {
                            index = i;
                        }
                    }
                        if (index == -1) {
                            System.out.println("未借出，不能归还！");
                        }
                        if (state[index]=true) {
                            System.out.println("输入归还日期：");
                            int time1 = scan.nextInt();
                            while (time1 < time[index] || time1 > 31) {
                                if (time1 < time[index]) {
                                    System.out.println("归还日期不能小于借出日期");
                                }
                                if (time1 > 31) {
                                    System.out.println("归还日期需在1-31之间");
                                }
                                time1 = scan.nextInt();
                            }
                            int money = (time1 - time[index]) * 1;
                            System.out.println("归还<<" + movie1 + ">>成功！");
                            System.out.println("借出日期为：" + time[index]);
                            System.out.println("归还日期为：" + time1);
                            System.out.println("应付租金(元):" + money + "元");
                        }
            System.out.println("*****************************");

            break;
            case 6:
                System.out.println("-->退出");
                break;
            default:
                System.out.println("请升级！！");
                break;
        }
        if (!isExit) {
            System.out.println("输入0返回：");
            num = scan.nextInt();
        } else {
            break;
        }
    } while(num ==0);
        System.out.println("谢谢使用本系统！");

}
}
