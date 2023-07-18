package ConstantClass.String.DateTime.Know;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * LocalDate、LocalTime、LocalDateTime 设使用
 *
 * 说明：
 *  1.LocalDateTime相较于LocalDate、LocalTime使用频率更高
 *
 */

public class JDK8DateTimeTest {
    /**
     * 获取当前的日期、时间、日期+时间
     */
    @Test
    public void test(){
        //取当前的日期、时间、日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println();

        //of():设置指定的年、月、日、时、分、秒。没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 10, 13, 23, 43);
        System.out.println(localDateTime1);
        System.out.println();

        //getXxx():获取目标信息
        System.out.println(localDateTime.getDayOfMonth());//4
        System.out.println(localDateTime.getDayOfWeek());//THURSDAY
        System.out.println(localDateTime.getDayOfYear());//216
        System.out.println(localDateTime.getMonth());//AUGUST
        System.out.println(localDateTime.getMonthValue());//8
        System.out.println(localDateTime.getMinute());//14
        System.out.println();

        //体现不可变性 (调用者localDate没有改变，calendar会改变调用者的值)
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);
    }

    @Test
    public void test1(){

    }
}
