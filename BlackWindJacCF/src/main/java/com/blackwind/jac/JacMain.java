package com.blackwind.jac;

import com.blackwind.jac.DM.dm;
import com.jacob.com.Variant;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

/**
 * @BY BlackWind
 * @QQ 2597906396
 * @Email 2597906396@qq.com
 * @date 2023/7/15 20:39
 * 这个类是程序的入口类
 * 如果需要查看dm函数封装类请到：com.blackwind.jac.DM.dm查看
 */
public class JacMain {


    static int 模式 = 0;
    static boolean 开关 = false;


    public static void NEWDMDoxit() {
        int zc = dm.Reg("kszz3838954eacbb49110bb181153520f08f8f16", "B1I");
        System.out.println(zc);
        //System.out.println(zc);
        if (zc == 1) {
            System.out.println("大漠插件注册成功");
        } else {
            System.out.println("大漠插件注册失败");
            System.exit(0);
        }
    }

    public static void Mods1() throws InterruptedException {
        Variant[] 找黑边 = dm.FindColor(948,598,966,620,"000000-000000",1,0);
        int 找黑边结果 = dm.DataToInt(找黑边[0]);
        if (找黑边结果 == 1){
            //CB4223-27080D
            Variant[] 找名字红色 = dm.FindColor(931,598,947,620,"CB4223-27080D",0.9,0);
            int 找名字红色结果 = dm.DataToInt(找名字红色[0]);
            if (找名字红色结果 == 1 ){
                System.out.println("找到啦");
                Random ran = new Random();
                int 随机数 = ran.nextInt(5) + 5;
                int 随机数1 = ran.nextInt(2) +0;
                dm.LeftClick();
                sleep(随机数 + ran.nextInt(5) + 20);
                dm.LeftUp();
                dm.MoveR(0,随机数1);
            }

        }else{
            return;
        }
    }


    public static void main(String[] args) {
        /**
         * @BY BlackWind
         * @QQ 2597906396
         * @Email 2597906396@qq.com
         * @date 2023/7/20 19:54
         * 注册大漠到系统
         */
        NEWDMDoxit();

        //寻找cf窗口 并取句柄
        int windows11 = dm.FindWindow("CrossFire", "穿越火线");
        System.out.println(windows11);
        int 绑定窗口 = dm.BindWindow(windows11, "normal", "normal", "normal", 0);
        if (绑定窗口 == 1) {
            System.out.println("绑定窗口成功");
        } else {
            System.out.println("绑定窗口失败 java进程已结束");
            System.exit(0);
        }

        while (true) {
            try {

                if (dm.GetKeyState(19) == 1) {
                    dm.KeyUp(19);
                    if (模式 >= 5) {
                        //如果模式不大于等于5的话 就不执行操作了
                    } else {
                        //小与的话就加
                        模式 = 模式 + 1;
                        System.out.println("切换模式: " + 模式);
                    }
                }

                if (dm.GetKeyState(145) == 1) {
                    dm.KeyUp(145);
                    if (模式 <= 0) {
                        //如果模式不大于等于5的话 就不执行操作了
                    } else {
                        //小与的话就加
                        模式 = 模式 - 1;
                        System.out.println("切换模式: " + 模式);
                    }
                }

                if (dm.GetKeyState(44) == 1) {
                    dm.KeyUp(44);
                    if (开关) {
                        //如果模式不大于等于5的话 就不执行操作了
                        开关 = false;
                        System.out.println("脚本开启状态:" + 开关);
                    } else {
                        //小与的话就加
                        开关 = true;
                        System.out.println("脚本开启状态:" + 开关);
                    }
                }

                // System.out.println("你好");

                if (开关) {
                    if (模式 == 0)
                        Mods1();

                    if (模式 == 1)
                        System.out.println("模式未被开发");

                    if (模式 == 2)
                        System.out.println("模式未被开发");

                    if (模式 == 3)
                        System.out.println("模式未被开发");

                    if (模式 == 4)
                        System.out.println("模式未被开发");

                    if (模式 == 5)
                        System.out.println("模式未被开发");

                }
                //FindPICandCo();
                sleep(1);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
