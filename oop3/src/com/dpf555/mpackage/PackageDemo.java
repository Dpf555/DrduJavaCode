package com.dpf555.mpackage;

import java.util.Random;
import java.util.Scanner;

public class PackageDemo {
    /*
    *   包：本质来说是文件夹，用来管理文件
    *   当包名冲突时：使用全类名 java.util.Scanner
    *   一个类中，需要使用不同的类，但是这两个类名是相同的，默认只能导入一个，另一个需要带包访问
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
    }
}
