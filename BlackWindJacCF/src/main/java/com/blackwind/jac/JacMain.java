package com.blackwind.jac;

import com.blackwind.jac.DM.dm;
import com.jacob.com.Variant;
import java.util.Scanner;
/**
 * @BY BlackWind
 * @QQ 2597906396
 * @Email 2597906396@qq.com
 * @date 2023/7/15 20:39
 * 这个类是程序的入口类
 * 如果需要查看dm函数封装类请到：com.blackwind.jac.DM.dm查看
 */
public class JacMain {
    public static void main(String[] args) {
        /**
         * @BY BlackWind
         * @QQ 2597906396
         * @Email 2597906396@qq.com
         * @date 2023/7/18 14:39
         * 这下面是大漠不带变参指针的调用写法
         */
        int jg =dm.FindWindow("Valve001","Left 4 Dead 2");
        System.out.println("结果"+jg);
        long addr = dm.GetModuleBaseAddr( jg,"server.dll");
        System.out.println(addr);



        /**
         * @BY BlackWind
         * @QQ 2597906396
         * @Email 2597906396@qq.com
         * @date 2023/7/18 14:40
         * 下面是带变参指针的
         */
        Variant[] jg1 =dm.GetCursorPos();
        int 结果 = Integer.valueOf(String.valueOf(jg1[0]));
        int 坐标x = Integer.valueOf(String.valueOf(jg1[1]));
        int 坐标y = Integer.valueOf(String.valueOf(jg1[2]));
        System.out.println("结果:"+结果+"坐标x:"+坐标x+"坐标z:"+坐标y);


    }
}
