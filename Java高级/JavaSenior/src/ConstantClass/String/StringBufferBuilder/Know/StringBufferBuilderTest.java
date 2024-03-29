package ConstantClass.String.StringBufferBuilder.Know;

import org.testng.annotations.Test;

/**
 * 关于 StringBuffer 和 StringBuilder 的使用
 *
 */

public class StringBufferBuilderTest {
    /**
     * String、StringBuffer、StringBuilder三者的异同？
     * String：       不可变的字符序列；                                  底层使用char[]存储
     * StringBuffer： 可变的字符序列；               线程安全的，效率低；    底层使用char[]存储
     * StringBuilder：可变的字符序列； JDK5.0新增的； 线程不安全的，效率高；  底层使用char[]存储
     *
     * 效率从高到低排列：StringBuilder > StringBuffer > String
     *
     *
     * 源码分析：
     * String str1 = new String(); //char[] value = new char[0];
     * String str2 = new String("abc"); //char[] value = new char[]{'a','b','c'};
     *
     * StringBuffer sb1 = new StringBuffer(); //char[] value = new char[16]; 底层创建了一个长度是16的数组
     * sb1.append('a'); //value[0] = 'a';
     * sb1.append('b'); //value[1] = 'b';
     *
     * StringBuffer sb2 = new StringBuffer("abc"); // char[] value = new char["abc".length() + 16]
     *
     *
     * 问题一：
     *      system.out.println(sb2.length); //3
     * 问题二：
     *      扩容问题：如果要添加的数据底层数组盛不下了，那就要扩容底层的数组。
     *              默认情况下扩容为原来的二倍+2，同时将原有数组中的元素复制到新的数组中
     *
     *       指导意义：开发中建议大家使用：StringBuffer(int capacity) 或 StringBuilder(int capacity)
     *
     */
    @Test
    public void test(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.length());


    }

    /**
     * String 与 StringBuffer、StringBuilder之间的转换
     *  String --> StringBuffer、StringBuilder：调用 StringBuffer、StringBuilder 的构造器
     *  StringBuffer、StringBuilder --> String：①调用 String 的构造器
     *                                         ②toString()
     */
    @Test
    public void test1(){

    }

}
