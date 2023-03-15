package com.itheima.ifswitch;

public class SwitchDemo {
    public static void main(String[] args) {

/*    需求：做个电子备忘录，在控制台分别输出周一到周五的工作安排
    周一：埋头苦干，解决bug
    周二：	请求大牛程序员帮忙
    周三：今晚啤酒、龙虾、小烧烤
    周四：主动帮助新来的女程序解决bug
    周五：今晚吃鸡
    周六：与王婆介绍的小芳相亲
    周日：郁郁寡欢、准备上班。*/
        String week = "周日";
        switch (week) {
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周三":
                System.out.println("今晚啤酒、龙虾、小烧烤");
                break;
            case "周四":
                System.out.println("主动帮助新来的女程序解决bug");
                break;
            case "周五":
                System.out.println("今晚吃鸡");
                break;
            case "周六":
                System.out.println("与王婆介绍的小芳相亲");
                break;
            case "周日":
                System.out.println("郁郁寡欢、准备上班");
                break;
            default:
                System.out.println("日期或者信息有误");

        }


        //月份查看器
        String month = "十一月";
        switch (month) {
            case "一月":
            case "三月":
            case "五月":
            case "七月":
            case "八月":
            case "十月":
            case "十二月":
                System.out.println("有31天");
                break;
            case "二月":
                System.out.println("闰年有29天，非闰年有28天");
                break;
            case "四月":
            case "六月":
            case "九月":
            case "十一月":
                System.out.println("30天");
                break;
            default:
                System.out.println("您输入的月份有误");
        }

    }
}
