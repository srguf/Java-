package IDEADebug;

import org.testng.annotations.Test;

public class IDEADebug {
    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());//4

        System.out.println(sb);//"null"

        StringBuffer sb1 = new StringBuffer(str);//异常NullPointerException
        System.out.println(sb1);

    }
}
