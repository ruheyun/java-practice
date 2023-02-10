package cn.ruhe.study;

import java.util.Scanner;

public class Day03 {
//    给定两个整数，被除数dividend和除数divisor（都是正数，且不超过int的范围） 。
//    将两数相除，要求不使用乘法、除法和 % 运算符。
//    得到商和余数。
public static void main(String[] args) {
    //创建键盘录入对象
    Scanner scanner = new Scanner(System.in);
    //从键盘获取整数
    System.out.println("请输入被除数:");
    int x = scanner.nextInt();
    System.out.println("请输入除数:");
    int y = scanner.nextInt();
    //统计一共循环多少次,即商
    int count = 0;
    while (x >= y) {
        x = x - y;
        count++;
    }
    System.out.println("商为:" + count + "\t" + "余数为:" + x);
}
}
