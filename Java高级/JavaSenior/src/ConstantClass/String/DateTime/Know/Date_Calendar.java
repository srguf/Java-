package ConstantClass.String.DateTime.Know;

import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * JDK 8 之前日期和时间的API测试
 * 1.System类中的currentTimeMillis
 * 2.java.util.Date类和其子类java.sql.Date类
 * 3.SimpleDateFormat类的使用
 * 4.Calendar类的使用
 */

public class Date_Calendar {

    /**
     * System类中的currentTimeMillis   (Millis：Millisecond 毫秒)
     *      1970.01.01  00.00.00到当前日期的时间差
     */
    @Test
    public void testCurrentTimeMillis(){
        long time = System.currentTimeMillis();
            //1970.01.01  00.00.00到当前日期的时间差
            //称为时间戳
        System.out.println(time);

    }

    /**
     * java.util.Date类
     *          |---java.sql.Date类
     *
     * 1.两个构造器的使用
     *      > 构造器一 Date():创建一个对应当前时间的Date对象
     *      > 构造器二 Date(long l):创建指定毫秒数的Date对象
     * 2.两个方法的使用
     *      > toString():显示当前的年、月、日、时、分、秒
     *      > getTime():获取当前Date对象对应的毫秒数。(时间戳)
     * 3.java.sql.Date对应着数据库中日期类型的变量
     *      >如何实例化？    java.sql.Date
     *      >sql.Date对象 ---> util.Date对象     多态
     *      >如何将util.Date对象 --> sql.Date对象    java.sql.Date date4 = new java.sql.Date(date3.getTime());
     */
    @Test
    public void testDate(){
        //构造器一 Date()：创建一个对应当前时间的Date对象
        Date date = new Date();
        System.out.println(date.toString()); //CST: China Standard Time

        System.out.println(date.getTime()); //1970.01.01  00.00.00到当前日期的时间差

        //构造器二 :创建指定毫秒数的Date对象
        Date date1 = new Date(1658141126327L);
        System.out.println(date1);

        //创建 java.sql.Date对象
        java.sql.Date date2 = new java.sql.Date(1658141126327L);
        System.out.println(date2.toString()); //2022-07-18

        //如何将util.Date对象 --> sql.Date对象
        //情况一：
//        Date date3 = new java.sql.Date(1658141126327L);
//        java.sql.Date date4 = (java.sql.Date) date3;
        //情况二：
        Date date3 = new Date();
        java.sql.Date date4 = new java.sql.Date(date3.getTime());
        System.out.println(date4);

    }

    /**
     * SimpleDateFormat的使用：SimpleDateFormat 对日期 Date 类的格式化和解析 (为Date服务)
     *  先进行SimpleDateFormat的实例化
     *  1.两个操作：
     *      >格式化：标准日期格式 ---> 本地区字符串类型的日期  ( 实例.format() )
     *      >解析： 本地区字符串类型的日期 ---> 标准日期格式   ( 实例.parse() )
     *  2.SimpleDateFormat的实例化
     *      注意：在进行实例化时日期的格式将被固定下来
     *
     */
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat：使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化：日期 ---> 字符串
        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);

        //解析： 字符串 ---> 日期
        String str = "2022/7/24 下午4:29";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        //*****************按照指定的格式进行格式化和解析：调用带参的构造器****************************
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date2 = new Date();
        //格式化
        String format1 = sdf1.format(date2);
        System.out.println(format1);
        //解析
        Date parse = sdf1.parse("2022-07-24 05:44:29");
        System.out.println(parse);
    }

    /**
     * 注意：
     *  获取月份时，从0开始
     *  获取星期 时，周日是1，周二是2, ....周六是7
     *
     *
     * 自己的小理解：
     *  1.实例化的过程相当于将当前的时间以不同的形式全部储存下来
     *      (java.util.GregorianCalendar
     *      [time=1661429777227,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
     *      zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,
     *      transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=7,
     *      WEEK_OF_YEAR=35,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=237,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,
     *      AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=16,SECOND=17,MILLISECOND=227,ZONE_OFFSET=28800000,DST_OFFSET=0])
     *
     *  2.然后通过 实例.get() 的方式取得你想要的格式 例如：Calendar.DAY_OF_MONTH 意味着 Calendar类里的 DAY_OF_MONTH 格式
     *              或是通过 getTime() 将 Calendar类型 转变为 Date类型 的信息
     *              setTime() 则是将 Date类型 的信息赋给 实例.setTime() 中的实例
     *
     *  3.set()、add() 操作相当于对存储下来的 实例 进行操作
     */
    @Test
    public void testCalendar(){
        //1.实例化：
        //方式一：创建其子类 (GregorianCalender) 的对象
        //方式二：调用其静态方法 getInstance() (效果相同)
        Calendar calendar = Calendar.getInstance();

        //2.常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(Calendar.DAY_OF_WEEK);
        //set()
        calendar.set(Calendar.DAY_OF_MONTH,22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        //add()
        calendar.add(Calendar.DAY_OF_MONTH,3);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        //getTime() 日历类 ---> Date
        Date date = calendar.getTime();
        System.out.println(date);
        //setTime() Date ---> 日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

    }
}
