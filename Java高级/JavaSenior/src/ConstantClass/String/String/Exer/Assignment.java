package ConstantClass.String.String.Exer;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.testng.annotations.Test;

import java.security.KeyStore;
import java.util.logging.XMLFormatter;

/**
 * String、StringBuffer、StringBuilder练习：
 *
 * 5.对字符串中字符进行自然顺序排序
 * 提示：
 * (1)字符串变成字符数组
 * (2)对数组排序，选择，冒泡，Arrays.sort();
 * (3)将排序后的数组变成字符串
 *
 */

public class Assignment {

    /**
     * 1.模拟一个trim方法，去除字符串两端的空格。
     * @param str
     * @return
     */
    public static String trim(String str){
        if (str == null){
            return null;
        }

        int x = 0;
        int y = 0;
        for (int i = 0,j = str.length() - 1; i < j; i++,j--) {
            if (str.charAt(i) == ' '){
                x++;
            }
            if (str.charAt(j) == ' '){
                y++;
            }
        }
        return str.substring(x,str.length() - y);

//        //空格数
//        int n = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == ' '){
//                n++;
//            }
//        }
//
//        //新数组
////        char[] c1 = str.toCharArray();
//        char[] c = new char[str.length() - n];
//        int j = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != ' '){
//                c[j] = str.charAt(i);
//                j++;
//            }
//        }
//        return new String(c);
    }
    @Test
    public void test1(){
        String str = "   Hello  ";
        System.out.println(trim(str));
    }


    /**
     * 2.将一个字符串进行反转。将字符串指定部分进行反转。
     *  比如"abcdefg"反转为"abfedcg"
     * @param str
     * @param startIndex
     * @param endIndex
     * @return
     */
    public static String invert(String str,int startIndex,int endIndex){
        if (endIndex - startIndex < 2){
            return str;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < ((endIndex - startIndex + 1) / 2); i++) {
            char temp = chars[startIndex + i];
            chars[startIndex + i] = chars[endIndex - i];
            chars[endIndex - i] = temp;
        }
        return new String(chars);
    }
    //使用StringBuffer、StringBuilder的方法实现：
    private static @NotNull String reverse(@NotNull String str, int startIndex, int endIndex){
        StringBuilder builder = new StringBuilder(str.length());
        //第一部分
        builder.append(str.substring(0,startIndex));
        //第二部分
        for (int i = endIndex; i >= startIndex; i--) {
            builder.append(str.charAt(i));
        }
        //第三部分
        builder.append(str.substring(endIndex + 1));

        return new String(builder);
    }
    @Test
    public void test2(){
        String str = "abcdefg";
        System.out.println(invert(str,2,5));
        System.out.println(reverse(str,2,5));
    }


    /**
     * 3.获取一个字符串在另一个字符串中出现的次数。
     *   比如获取“ab”在“abkkcadkabkebfkabkskab”中出现的次数。
     * @param motherString
     * @param sonString
     * @return
     */
    public static int number(@NotNull String motherString, String sonString){
        int n = 0;
        int m = 0;//用来对齐
        for (int i = 0; i < motherString.length(); i++) {
            if (i + sonString.length() > motherString.length()){
                break;
            }
            int result = sonString.equals(motherString.substring(i, i + sonString.length())) ? n++ : m++;
        }
        return n;
    }
    @Test
    public void test3(){
        String str1 = "abkkcadkabkebfkabkskab";
        String str2 = "ab";
        System.out.println(number(str1,str2));
    }


    /**
     * 4.获取两个字符串中最大的相同字串。
     *  *  比如：str1 = "abcwerthelloyuiodef" , str2 = "cvhellobmn"
     *  * 提示：将短的那个串进行长度依次递减的字串与较长的串进行比较。
     * @param str1
     * @param str2
     * @return
     */
    private static String find(String str1,String str2){
        if(str1 == null || str2 == null){
            return null;
        }

        String maxStr = str1.length() >= str2.length() ? str1 : str2;
        String minStr = str1.length() < str2.length() ? str1 : str2;
        for (int i = 0; i < minStr.length(); i++) {
            for (int x = 0,y = minStr.length() - i;y <= minStr.length();x++,y++){
                String subStr = minStr.substring(x,y);
                if(maxStr.contains(subStr)){
                    return subStr;
                }
            }
        }
        return null;
        //bug版
//        int beginIndex = 0;//str2 beginIndex
//        int endIndex = str2.length();//str2 endIndex + 1
//        int n = 2;
//        while (beginIndex < endIndex){
//            for (int k = 0; k < str1.length() - 1; k++) {
//                if (k + endIndex - beginIndex - 1 > str1.length() - 1){
//                    break;
//                }
//                if (str2.substring(beginIndex,endIndex).equals(str1.substring(k,k + endIndex - beginIndex))){
//                    return str2.substring(beginIndex,endIndex);
//                }
//            }
//            int L = ((n++ % 2) == 0) ? beginIndex++ : endIndex++;
//        }
//        return null;
    }
    @Test
    public void test4(){
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobmn";
        System.out.println(find(str1,str2));
    }

    @Test
    public void test5(){
        String str2 = "cvhellobmn";
        System.out.println(str2.substring(6,10));
    }
}
