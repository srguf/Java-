package tool;

import java.awt.*;
import java.util.Scanner;

public class MyTool {
    private static Scanner scan = new Scanner(System.in);

    /**
     * 读取键盘，获取用户输入
     *
     * @return
     */
    public static char readMenuSelection(){
        System.out.println("");
        char c;
        while(true){
            c = scan.next().charAt(0);
            if(c != '1' && c != '2' && c != '3' && c != 4){
                System.out.println("选择错误，请重新输入!");
                System.out.println("check error,please select again!");
            }else {
                break;
            }
        }
        return c;
    }






    public static void main(String[] args) {
        readMenuSelection();
    }







}
