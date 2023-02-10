package cn.ruhe.study;

import java.util.Scanner;

public class Day01 {
//两数之和
//给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值target的那两个整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//你可以按任意顺序返回答.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    System.out.println("请输入数组:");
//    int n = scanner.nextInt();
    int[] nums = {12,11,4,7,9,10};
    int target = 22;
    for (int i = 0; i < nums.length; i++) {
        for (int j = i+1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target){
                System.out.println(i+","+j);
            }
        }
    }
}
}
