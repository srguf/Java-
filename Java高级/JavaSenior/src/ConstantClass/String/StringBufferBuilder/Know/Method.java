package ConstantClass.String.StringBufferBuilder.Know;

import org.testng.annotations.Test;

/**
 * StringBuffer和StringBuilder的方法
 *
 */

public class Method {

    /**
     * StringBuffer的常用方法
     * StringBuffer append(xxx):提供了很多append()方法，用于进行字符串的拼接      append(xxx)存在方法链连续调用
     * StringBuffer delete(int start,int end):删除指定位置的内容
     * StringBuffer replace(int start,int end,String str):把(start,end)位置替换成str
     * StringBuffer insert(int offset,xxx):在指定位置插入xxx
     * StringBuffer reverse():把当前字符序列逆转
     *
     * public int indexOf(String str): 返回str在StringBuffer首次出现的位置
     * public String subString(int start,int end):返回一个从Start开始到End结束的走闭右开的字串
     * public int length(): 返回长度
     * public char charAt(int n): 取第n位字符
     * public void setCharAt(int n,char ch): 将第 n 位改为字符 ch
     *
     *
     * 总结：
     *  增：append(xxx)
     *  删：delete(int start,int end)
     *  改：replace(int start,int end,String str) / setCharAt(int n,char ch)
     *  查：charAt(int n) /
     *  插：insert(int offset,xxx)
     *  长度：length()
     *  *遍历：for + charAt / toString()
     *
     *  搜索：indexOf(String str) / subString(int start,int end):
     */
    @Test
    public void test(){
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('1');
        System.out.println(s1);

        s1.delete(3,5); //左闭右开
        s1.replace(0,4,"Hello");
        s1.insert(2,1);
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);


    }
}
