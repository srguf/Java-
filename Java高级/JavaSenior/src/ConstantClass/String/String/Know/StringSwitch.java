package ConstantClass.String.String.Know;

import org.testng.annotations.Test;

import javax.swing.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 涉及到String类与其他结构之间的转换
 *
 */

public class StringSwitch {

    /**
     * 复习：
     * String与基本数据类型，包装类之间的转换:
     *   1.String --> 基本数据类型、包装类：调用包装类的静态方法：parseXxx(str)
     *   2.基本数据类型、包装类 --> String：调用String重载的valueOf(xxx)
     *
     * 注意：
     *  这里的转换方法都是静态方法
     */
    @Test
    public void test(){
        String str1 = "123";
        int num = Integer.parseInt(str1);
        String str2 = String.valueOf(num);
        System.out.println(str2);
    }

    /**
     * String 与 char[] 之间的转换:
     *   1.String --> char[]:调用String的toCharArray方法
     *   2.char[] --> String：调用String的构造器
     *
     * 注意：
     *  这里的转换方法是非静态的方法，对象可以直接调用
     */
    @Test
    public void test1(){
        String str1 = "abc123"; //题目：  a21cb3   思路：先转 char[] 变形，再变回String
        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        char[] arr = new char[]{'h','e','l','l','o'};
        String str2 = new String(arr);//调用构造器
        System.out.println(str2);
    }

    /**
     * String 与 byte 之间的转换:
     *   1.String --> byte[]:调用String的getbytes()
     *   2.byte[] --> String:调用String的构造器
     *
     * 编码：字符串 --> 字节(底层的二进制数)
     * 解码：字节 --> 字符串
     * 说明：解码时，要求解码使用的字符集必须与编码时使用的字符集一致。否则会出现乱码
     *
     * 注意：
     *  这里的转换方法是非静态的方法，对象可以直接调用
     */
    @Test
    public void test2() throws UnsupportedEncodingException {
        String str1 = "123abc中国";
        byte[] bytes = str1.getBytes(); //使用默认的字符集，进行转换
        System.out.println(Arrays.toString(bytes));
        System.out.println(str1.getBytes("gbk")); //使用GBK字符集进行编码
        System.out.println();

        String str2 = new String(bytes);
        System.out.println(str2);
        System.out.println(new String(str1.getBytes("gbk"))); //编码与解码格式不同导致乱码
    }
}
