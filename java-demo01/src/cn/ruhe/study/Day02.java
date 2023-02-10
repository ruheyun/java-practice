package cn.ruhe.study;

import java.util.Scanner;

public class Day02 {
//    给你一个整数 x 。
//    如果 x 是一个回文整数，打印 true ，否则，返回 false 。
//    解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//    例如，121 是回文，而 123 不是。
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入一个整数:");
    int x = scanner.nextInt();//假如为1234
    //定义一个临时变量记录x的原始值
    int temp = x;
    int num = 0;
    while (x != 0){
        int i = x % 10;
        x = x / 10;
        num = num * 10 + i;
    }
    System.out.println(temp == num);
}
}
