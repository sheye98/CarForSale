//author:Sheye
//index:汽车租赁系统

package Carforsale;

import java.util.Scanner;

public class Rentcar {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("************欢迎光临Sh3YEe的汽车租赁公司************");
        System.out.println();
        System.out.println("0.轿车------------------------------------1.客车");
        Scanner scn = new Scanner(System.in);
        int in1 = scn.nextInt();    //判断的是汽车还是客车
        System.out.println("请选择你要租赁的汽车类型:" + in1);
        System.out.println();
        if (in1 == 0) { //判断是小轿车
            System.out.println("请选择你要租赁的汽车品牌: 0.别克   1.宝马");
            String[] st1 = new String[]{"别克", "宝马"};
            int inc1 = scn.nextInt();    //设置车型是别克还是宝马，同时设置Brand
            //判断是宝马
            if(inc1==1){
                System.out.println("请选择你要租赁的汽车品牌: 0.X6  1.550i1");
                Car car = new Car();
                car.setBrand(st1[inc1]);
                String[] st2 = new String[]{"X6", "550i1"};
                int inc2 = scn.nextInt();
                car.setType(st2[inc2]);
                MotoOperation mo = new MotoOperation();
                System.out.println("分配给您的汽车牌号是: "+mo.motoLeaseOut(st1[inc1],st2[inc2]).getId());  //取出车的车牌号
                Moto mo1 = car;
                MotocalRent(mo1);
            }
            else {  //别克
                System.out.println("请选择你要租赁的汽车品牌: 0.别克林荫大道  1.别克GL8");
                Car car = new Car();
                car.setBrand(st1[inc1]);
                String[] st3 = new String[]{"别克林荫大道", "别克GL8"};
                int inc3 = scn.nextInt();
                car.setType(st3[inc3]);  //设置别克的车型
                MotoOperation mo = new MotoOperation();
                System.out.println("分配给您的汽车牌号是: "+mo.motoLeaseOut(st1[inc1],st3[inc3]).getId());
                Moto mo2 = car;
                MotocalRent(mo2);
            }
        }
        else {  //判断是大巴
            System.out.println("请选择你要租赁的客车品牌: 0.金龙  1.金杯");
            String[] st1 = new String[]{"金龙","金杯"};
            int inb1 = scn.nextInt();
            if(inb1==1){    //金龙
                System.out.println("请选择你要租赁的客车品牌: 0.16座  1.34座");
                Bus bus = new Bus();
                bus.setBrand(st1[inb1]);
                String[] st2 = new String[]{"16座","34座"};
                int inb2 = scn.nextInt();
                bus.setType(st2[inb2]);
                MotoOperation mo = new MotoOperation();
                System.out.println("分配给您的汽车牌号是: "+mo.motoLeaseOut(st1[inb1],st2[inb2]).getId());  //取出车的车牌号
                Moto mo3 = bus;
                MotocalRent(mo3);
            }
            else {  //金杯
                System.out.println("请选择你要租赁的客车品牌: 0.16座  1.34座");
                Bus bus = new Bus();
                bus.setBrand(st1[inb1]);
                String[] st2 = new String[]{"16座", "34座"};
                int inb3 = scn.nextInt();
                bus.setType(st2[inb3]);
                MotoOperation mo = new MotoOperation();
                System.out.println("分配给您的汽车牌号是: "+mo.motoLeaseOut(st1[inb1],st2[inb3]).getId());
                Moto mo4 = bus;
                MotocalRent(mo4);
            }
        }
    }

    public static void MotocalRent(Moto sy) {
        System.out.println("请输入您要租赁的天数:");
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        System.out.println("您要租赁的天数为:"+input);
        System.out.println("您需要支付的租赁费用是:"+sy.calRent(input));
    }
}

