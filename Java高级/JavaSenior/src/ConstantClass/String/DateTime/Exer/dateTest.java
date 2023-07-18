package ConstantClass.String.DateTime.Exer;

import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 练习一：字符串"2020-09-08"转换为java.sql.Date
 * 练习二："三天打鱼两天晒网" 1990-01-01   xxxx-xx-xx 打鱼？晒网？
 *      总天数的计算？
 *          方法一：(date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24) + 1
 *          方法二：年月日分开计算天数，相加
 */

public class dateTest {
    /**
     *
     * 练习一：字符串"2020-09-08"转换为java.sql.Date
     * @throws ParseException
     */
    @Test
    public void test1() throws ParseException {
        //本地类型 ---> 标准格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        String str = "2020-09-08";
        Date dateFormat = sdf.parse(str);
        //date --> java.sql.date
        java.sql.Date date1 = new java.sql.Date(dateFormat.getTime());
        System.out.println(date1);
    }


    @Test
    public void test2(){

    }
}
