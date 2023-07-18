package ConstantClass.String.String.Know;

import org.testng.annotations.Test;

import java.net.SocketTimeoutException;

/**
 *   String的使用
 *
 *
 */

public class StringTest {

    /**
     * String:字符串，使用一对""引起来表示
     * 1.String声明为 final 的，不可被继承
     * 2.String实现了 Serializable 接口：表示字符串是支持序列化的
     *         实现了 Comparable 接口：表示 String 可以比较大小
     * 3.String内部定义了 final char[] value 用于存储字符串数据
     * 4.String代表不可变的字符序列，简称：不可变性
     *      体现：1)当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有的value进行赋值
     *           2)当对现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值
     *           3)当调用String的replace()修改指定字符或字符串时，也需要重新指定内存区域赋值
     * 5.通过字面量的方式(区别于new)给一个字符串赋值，此时字符串值声明在字符串常量池中
     * 6.字符串的常量池中是不会存储相同内容的字符串的。
     */
    @Test
    public void test1(){
        String s1 = "abc";//字面量的定义方式
        String s2 = "abc";
        String s3 = "abc";
        s1 = "hello";

        String s4 = new String("abc");
        String s5 = new String("abc");

        System.out.println("s1 = s2 ? : " + s1 == s2);//比较s1和s2的地址值

    }

    /**
     * String实例化的方式
     * 方式一：通过字面量定义的方式
     * 方式二：通过 new + 构造器 的方式
     *
     *  面试题：String s = new String("abc");方式创建对象，在在内存中创建了几个对象？
     *          2个。一个是堆空间中new结构，另一个是char[]对应的常量池中的数据:"abc".
     *
     */
    public  class  Person{
        String name;
        int age;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    @Test
    public void Test2(){
        //通过字面定义的方式，此时s1和s2的数据javaEE声明在方法区中的字符串常量池中
        String s1 = "javaEE";
        String s2 = "javaEE";
        //通过 new + 构造器 的方式：此时s3和s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);//true
        System.out.println(s3 == s4);//false
        System.out.println("****************");

        Person p1 = new Person("Tom",12);
        Person p2 = new Person("Tom",12);

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//true

    }

    /**
     * 结论：
     * 1.常量与常量的拼接结果在常量池。且常量池中不会存在相同内容的常量
     * 2.只要其中有一个是变量，结果就在堆中。
     * 3.intern()返回s5常量池中的值
     */
    @Test
    public void test3(){
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false

        String s8 = s5.intern();//intern()返回s5常量池中的值
        System.out.println(s3 == s8);//true
    }

    @Test
    public void test4() {
        //面试题：
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2 + "hadoop";
        System.out.println(s1 == s3); //false

        final String s4 = "javaEE"; //final 常量
        String s5 = s4 + "hadoop";
        System.out.println(s1 == s5); //true

    }
}
