package com.imooc;

public class test {
    public static void main(String[] args) {
        /**
         *  结果：i = 2 ， j = 1
         *  运行j = i++ 时，先把j = i 执行  再执行 i++
         */
        int i,j;
        i = 0;
        i = i + 1;
        j = i++;
        System.out.println("i = " + i + "   j = " + j);
    }
}
