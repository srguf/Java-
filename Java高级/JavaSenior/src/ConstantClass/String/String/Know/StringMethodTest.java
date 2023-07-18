package ConstantClass.String.String.Know;

import org.testng.annotations.Test;

/**
 * int length(): 返回字符串的长度
 * char charAt(int index): 返回索引处的字符
 * boolean isEmpty(): 判断是否是空字符串
 * String toLowerCase(): 使用默认语言环境，将 String 中的所有字符转换为小写
 * String toUpperCase(): 使用默认语言环境，将 String 中的所有字符转换为大写
 * String trim(): 返回字符串的副本，忽略前导空白和尾部空白
 * boolean equals(Object obj): 比较字符串的内容是否相同
 * boolean equalsIgnoreCase(String anotherString): 与equals()类似，忽略大小写
 * String concat(String str): 指定字符串连接到此字符串的结尾。等价于"+"
 * int compareTo(String anotherString): 比较两个字符串的大小
 * String substring(int beginIndex): 返回一个新的字符串，它时此字符串从beginIndex开始截取
 * String substring(int beginIndex,int endIndex): 返回一个新的字符串，它时此字符串从beginIndex开始截取，到endIndex前结束
 *
 *
 * boolean endsWith(String suffix): 测试此字符串是否一指定的后缀结束
 * boolean startsWith(String suffix): 测试此字符串是否以指定的前缀开始
 * boolean startsWith(String suffix,int toffset):测试此字符串是否以指定的前缀开始(从toffset开始)
 *
 *
 * 字符串的查询：
 * boolean contains(CharSequence s): 当且仅当此字符串包含指定的char值序列时，返回true
 * int indexOf(String str): 返回指定子字符串在此字符串中第一次出现处的索引
 * int indexOf(String str,int fromIndex): 返回指定子字符串在此字符串中第一次出现处的索引，从fromIndex处开始找
 * LastIndexOf(String str): 返回指定子字符串在此字符串中最后出现处的索引
 * LastIndexOf(String str,int fromIndex):返回指定子字符串在此字符串中最后出现处的索引，从fromIndex处开始找
 * 注：indexOf和LastIndexOf如果未找到都是返回-1
 *
 * //什么情况下，indexOf(str) 和 LastIndexOf(str) 返回值相同
 * //没有 或 只有唯一的str
 *
 *
 * 替换：
 * String replace(char oldChar,car newChar):
 * String replace(charSequence target,charSequence replacement):
 * String replaceAll(String regex,String replacement):
 * String replaceFirst(String regex,String replacement):
 *
 * 匹配：
 * boolean matches(String regex): 告知此字符串是否匹配给定的正则表达式
 *
 * 切片：
 * String[] split(String regex):
 * String[] split(String regex,int limit):
 *
 */

public class StringMethodTest {

    @Test
    public void test(){
        String s1 = "HelloWorld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.isEmpty());
        System.out.println();

        String s2 = "HelloWorld";
        System.out.println(s2.toLowerCase());//这里s2本身没有变
        System.out.println(s2.toUpperCase());
        System.out.println("s2 = " + s2); //s2不可变仍为原来的字符串
        String s3 = s1.toUpperCase();
        System.out.println("s1 = " + s1); //s1也不可变仍为原来的字符串
        System.out.println("s3 = " + s3);
        System.out.println();

        String s4 = "   he ll ow wor d    ";
        System.out.println("-----" + s4 + "-----");
        System.out.println("-----" + s4.trim() + "-----");
        System.out.println();


    }
}
