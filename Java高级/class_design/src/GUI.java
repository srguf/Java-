import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GUI extends JFrame{

    //连接数据库
    JDBC jdbc=new JDBC();
    //获取数据库的连接
    Connection con=jdbc.linkDataBase();

    JLabel labe2=new JLabel("用户名：");  //标签
    JLabel labe=new JLabel("密码    ：");  //标签

    JButton btn2=new JButton("登录");    //登录按钮
    JButton btn3=new JButton("退出");     //退出按钮

    JTextField inputField1=new JTextField(20);      //文本框
    JPasswordField inputField2=new JPasswordField(20);      //密码框
    JPanel btnP1 = new JPanel();    //画板

    public GUI(String s,int w,int h){
        init(s);    //s是名字
        ii();
        GUITools.center(this);  //设置居中
        setSize(w, h);      //尺寸
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void init(String s) {

        setTitle(s);
        GUITools.setTitleImage(this, ".\\title.png");

        btnP1.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(btnP1);
        btnP1.setLayout(null);

        labe.setForeground(Color.blue);
        labe.setBounds(90, 139, 54, 15);
        btnP1.add(labe);

        inputField1.setBounds(140, 84, 164, 28);
        btnP1.add(inputField1);

        inputField2.setBounds(140, 133, 164, 28);
        btnP1.add(inputField2);

        labe2.setForeground(Color.blue);
        labe2.setBounds(90, 90, 54, 15);
        btnP1.add(labe2);


        //登录按钮
        btn2.setBounds(125, 186, 87, 28);
        btnP1.add(btn2);
        //退出按钮
        btn3.setBounds(240, 186, 87, 28);
        btnP1.add(btn3);

        JLabel label_2 = new JLabel("    职工工资管理系统");
        label_2.setFont(new Font("Dialog", Font.BOLD, 15));
        label_2.setForeground(Color.BLACK);
        label_2.setBounds(140, 40, 187, 34);
        btnP1.add(label_2);
    }

    //登录界面
    public void ii() {

        btn2.addActionListener(e->{

            //使用hashmap获取登录信息
            HashMap<String, String> loginInf = jdbc.loginInf(con);

            String content=inputField1.getText();
            String content2=String.valueOf(inputField2.getPassword());


            if((content!=null&&!content.trim().equals(""))&&(content2!=null&&!content2.trim().equals(""))) {

                if(loginInf.containsKey(content)&&loginInf.containsValue(content2)){
                    new GUI2(this,true);
                }else {
                    JOptionPane.showMessageDialog(null,"账号密码错误","消息提示",JOptionPane.ERROR_MESSAGE);
                    inputField2.setText("");
                }

            }else {
                JOptionPane.showMessageDialog(null,"无效用户","消息提示",JOptionPane.ERROR_MESSAGE);

            }
        });
        btn3.addActionListener(e->{
            System.exit(0);
        });

    }

}

class GUITools {

    static Toolkit kit = Toolkit.getDefaultToolkit();

    public static void center(Component c) {
        int x = (kit.getScreenSize().width - c.getWidth()) / 2;
        int y = (kit.getScreenSize().height - c.getHeight()) / 2;
        c.setLocation(x, y);
    }

    public static void setTitleImage(JFrame frame,String titleIconPath) {
        frame.setIconImage(kit.createImage(titleIconPath));
    }
}



class GUI2 extends JDialog{

    JDBC jdbc=new JDBC();
    Connection con=jdbc.linkDataBase();


    JScrollPane tablePane = new JScrollPane();
    JTable table = new JTable();

    JPanel panel=new JPanel();
    JLabel label=new JLabel("请输入工号：");
    JTextField inputField=new JTextField(15);


    JButton btn=new JButton("搜索");
    JButton btn2=new JButton("刷新");

    JPanel pane2=new JPanel();
    JButton btny1,btny2,btny3,btny4,btny5;
    JLabel labe2=new JLabel("  xxx 有限公司 ");
    JPanel pane3=new JPanel();
    JPanel pane=new JPanel();
    JPanel panei=new JPanel();
    JPanel panej=new JPanel();



    public GUI2(Frame owner, boolean modal) {
        super(owner, modal);
        init2();
        addComponent();
        jj();
        queryStudent();

        setVisible(true);

    }



    private void init2() {
        this.setTitle("工资管理系统!");
        this.setSize(600,600);
        GUITools.center(this);
        this.setResizable(false);


    }
    private void addComponent() {
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
        table.setEnabled(false);
        tablePane.setBounds(50, 50, 500, 100);
        tablePane.setViewportView(table);
        pane3.add(tablePane);

        panel.add(label);
        panel.add(inputField);
        panel.add(btn);
        panel.add(btn2);

        btny1=new JButton("删除用户");
        btny2=new JButton("修改用户");
        btny3=new JButton("添加用户");
        btny4=new JButton("使用帮助");
        btny5=new JButton("退出系统");

        pane2.setLayout(new BorderLayout());  //给按钮的总面板布局
        panei.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
        panej.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));

        panei.add(btny1);
        panei.add(labe2);
        panei.add(btny2);

        panej.add(btny3);
        panej.add(btny4);
        panej.add(btny5);

        pane2.add(panei,BorderLayout.PAGE_START);
        pane2.add(panej,BorderLayout.CENTER);

        pane.setLayout(new BorderLayout());
        pane.add(panel,BorderLayout.PAGE_START);
        pane.add(pane3,BorderLayout.CENTER);
        pane.add(pane2,BorderLayout.PAGE_END);

        this.add(pane);
    }

    public void jj() {

        jdbc.allMembers(con);



        btn.addActionListener(e->{



            String content=inputField.getText();




            String[][] tbody = new String[1][7];//创建网格实体


            for (int i = 0; i < jdbc.no.length; i++) {
                if(Integer.parseInt(content)==jdbc.no[i]) {
                    tbody[0][0]= String.valueOf(jdbc.no[i]);
                    tbody[0][1]=jdbc.name[i];
                    tbody[0][2]=jdbc.sex[i];
                    tbody[0][3]= String.valueOf(jdbc.age[i]);
                    tbody[0][4]= String.valueOf(jdbc.salary[i]);
                    tbody[0][5]= String.valueOf(jdbc.allowance[i]);
                    tbody[0][6]= String.valueOf(jdbc.total[i]);

                    String[] thead = {"工号","姓名","性别","年龄","基本工资","津贴","综合工资"};

                    TableModel dataModel = new DefaultTableModel(tbody, thead);
                    table.setModel(dataModel);

                    JOptionPane.showMessageDialog(null,"查询成功","消息提示",JOptionPane.OK_CANCEL_OPTION);
                    return;

                }
            }

            JOptionPane.showMessageDialog(null,"该用户不存在","消息提示",JOptionPane.ERROR_MESSAGE);
            return;


        });

        btn2.addActionListener(e->{
            queryStudent();
        });

        btny1.addActionListener(e->{
            aee("删除员工","取消",1);
        });

        //修改用户数据
        btny2.addActionListener(e->{
            ass("修改用户","修改",2);
        });


        //添加用户操作
        btny3.addActionListener(e->{
            ass("添加用户","添加",3);
        });



        btny4.addActionListener(e->{
            aee("帮助文档","退出",4);
        });
        btny5.addActionListener(e->{
            try {
                FileSave.save();
            } catch (IOException e1) {

                e1.printStackTrace();
            }
            System.exit(0);
        });

    }


    public void aee(String u,String s,int g) {
        JDialog j=new JDialog(this);
        j.setTitle(u);
        j.setSize(400,320);
        GUITools.center(j);
        j.setResizable(false);
        JLabel la1=new JLabel("    工号");
        JLabel la2=new JLabel("                   1.修改用户：输入原有员工工号,并输入修改的信息。");
        JLabel la3=new JLabel("                   2.添加用户：输入需要添加的员工所以信息即可。");
        JLabel la4=new JLabel("                                *退出系统可以自动保存员工信息*");
        JTextField in1=new JTextField(15);
        JPanel btnP1 = new JPanel();
        JPanel btnP2 = new JPanel();




        JButton btn=new JButton("删除");
        JButton btn2=new JButton(s);


        JPanel btnP3 = new JPanel();
        btnP3.setLayout(new BorderLayout());
        if(g==4) {
            btnP1.setLayout(new BorderLayout());
            //btnP1.add(la2);
            btnP1.add(la2,BorderLayout.PAGE_START);
            btnP1.add(la3,BorderLayout.CENTER);
            btnP1.add(la4,BorderLayout.PAGE_END);
            btnP2.add(btn2);
            btnP3.add(btnP1,BorderLayout.PAGE_START);
            btnP3.add(btnP2,BorderLayout.CENTER);
            j.add(btnP3);
            j.setVisible(true);

            btn2.addActionListener(e->{
                j.dispose();
            });

        }


        if(g==1) {

            btnP1.add(la1);
            btnP1.add(in1);
            btnP2.add(btn);
            btnP2.add(btn2);
            btnP3.add(btnP1,BorderLayout.PAGE_START);
            btnP3.add(btnP2,BorderLayout.CENTER);
            j.add(btnP3);
            j.setVisible(true);





            btn.addActionListener(e->{

                jdbc.allMembers(con);//查所有员工
                String con1=in1.getText();//得到自己输入的员工号

                for (int i=0;i<jdbc.no.length;i++){

                    if (Integer.parseInt(con1)==jdbc.no[i]){
                        String sql="delete from 员工工资表 where JobNo = ?";

                        try {

                            PreparedStatement preparedStatement=con.prepareStatement(sql);
                            preparedStatement.setString(1,con1);


                            preparedStatement.executeUpdate();
                            JOptionPane.showMessageDialog(null,"删除成功","提示",JOptionPane.OK_CANCEL_OPTION);
                            return;

                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }

                }

                JOptionPane.showMessageDialog(null,"当前没有员工","警告",JOptionPane.ERROR_MESSAGE);
                return;


            });


            btn2.addActionListener(e->{
                j.dispose();

            });
        }

    }
    public void ass(String p,String w,int g) {

        JDialog j=new JDialog(this);
        j.setTitle(p);
        j.setSize(400,320);
        GUITools.center(j);
        j.setResizable(false);

        //属性标签
        JLabel la1=new JLabel("    工号");
        JLabel la2=new JLabel("    姓名");
        JLabel la3=new JLabel("    性别");
        JLabel la4=new JLabel("    年龄");
        JLabel la5=new JLabel("基本工资");
        JLabel la6=new JLabel("    津贴");
        JLabel la7=new JLabel("  总工资");

        //文本框
        JTextField in1=new JTextField(15);
        JTextField in2=new JTextField(15);
        JTextField in3=new JTextField(15);
        JTextField in4=new JTextField(15);
        JTextField in5=new JTextField(15);
        JTextField in6=new JTextField(15);
        JTextField in7=new JTextField(15);



        in7.setEditable(false);//总薪资自动计算
        in7.setBackground(Color.gray);//设置灰色背景






        //按钮
        JButton btn=new JButton(w);//如果是添加功能 w:添加  如果是修改功能  w:修改
        JButton btn2=new JButton("取消");


        JPanel btnP1 = new JPanel();
        JPanel btnP2 = new JPanel();
        JPanel btnP3 = new JPanel();
        JPanel btnP4 = new JPanel();
        JPanel btnP5 = new JPanel();
        JPanel btnP6 = new JPanel();
        JPanel btnP7 = new JPanel();

        JPanel btnP8 = new JPanel();
        JPanel btnP9 = new JPanel();
        JPanel btnP10 = new JPanel();
        JPanel btnP11 = new JPanel();
        JPanel btnP12 = new JPanel();
        btnP8.setLayout(new BorderLayout());
        btnP9.setLayout(new BorderLayout());
        btnP10.setLayout(new BorderLayout());

        btnP1.add(la1);
        btnP1.add(in1);
        btnP2.add(la2);
        btnP2.add(in2);
        btnP3.add(la3);
        btnP3.add(in3);
        btnP4.add(la4);
        btnP4.add(in4);
        btnP5.add(la5);
        btnP5.add(in5);
        btnP6.add(la6);
        btnP6.add(in6);
        btnP7.add(la7);
        btnP7.add(in7);
        btnP12.add(btn);
        btnP12.add(btn2);

        btnP8.add(btnP1,BorderLayout.PAGE_START);
        btnP8.add(btnP2,BorderLayout.CENTER);
        btnP8.add(btnP3,BorderLayout.PAGE_END);

        btnP9.add(btnP4,BorderLayout.PAGE_START);
        btnP9.add(btnP5,BorderLayout.CENTER);

        btnP10.add(btnP6,BorderLayout.PAGE_START);
        btnP10.add(btnP7,BorderLayout.CENTER);
        btnP10.add(btnP12,BorderLayout.PAGE_END);


        j.setLayout(new BorderLayout());
        j.add(btnP8,BorderLayout.PAGE_START);
        j.add(btnP9,BorderLayout.CENTER);
        j.add(btnP10,BorderLayout.PAGE_END);
        j.setVisible(true);


        if (g==3){
            in1.setEditable(false);
            in1.setBackground(Color.gray);
        }


        if (g==2){

            in2.setEditable(false);
            in3.setEditable(false);
            in2.setBackground(Color.gray);
            in3.setBackground(Color.gray);

            jdbc.allMembers(con);

            in1.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    in1.setText("");
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (in1.getText().equals("")){
                        in1.setText("请在输入员工号后按下enter~");
                    }

                }
            });


            in1.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {

                    if (e.getKeyChar()==KeyEvent.VK_ENTER){

                        System.out.println(1);


                        for (int i=0;i<jdbc.no.length;i++){

                            if (Integer.parseInt(in1.getText())==jdbc.no[i]){
                                JOptionPane.showMessageDialog(null,"查询成功","提示",JOptionPane.OK_CANCEL_OPTION);
                                in2.setText(jdbc.name[i]);
                                in3.setText(jdbc.sex[i]);
                                in4.setText(String.valueOf(jdbc.age[i]));
                                in5.setText(String.valueOf(jdbc.salary[i]));
                                in6.setText(String.valueOf(jdbc.allowance[i]));
                                in7.setText(String.valueOf(jdbc.total[i]));

                            }
                        }
                        JOptionPane.showMessageDialog(null,"当前没有员工","警告",JOptionPane.ERROR_MESSAGE);
                        return;

                    }

                }
            });
        }




        btn.addActionListener(e->{

            String con1=in1.getText();
            String con2=in2.getText();
            String con3=in3.getText();
            String con4=in4.getText();
            String con5=in5.getText();
            String con6=in6.getText();
            String con7=in7.getText();

            String h=con1.replace(" ","");

            int y=chief.data.size();

            if(g==3) {

                in1.setEditable(false);//工号不可变
                in1.setBackground(Color.gray);//背景设置为灰色
                jdbc.add(con,con2,con3,con4,con5,con6);
                JOptionPane.showMessageDialog(null,"添加成功","提示",JOptionPane.OK_CANCEL_OPTION);

            }

            if(g==2) {

                int total=Integer.parseInt(con5)+Integer.parseInt(con6);

                String sql="update 员工工资表 set Age = ?,Salary = ?,Allowance = ?,total = ? where JobNo = ?";



                try {
                    PreparedStatement preparedStatement=con.prepareStatement(sql);
                    preparedStatement.setString(1,con4);
                    preparedStatement.setString(2,con5);
                    preparedStatement.setString(3,con6);
                    preparedStatement.setString(4, String.valueOf(total));
                    preparedStatement.setString(5,con1);

                    preparedStatement.executeUpdate();

                    in7.setText(String.valueOf(total));

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }









                in2.setEditable(false);
                in3.setEditable(false);
                in2.setBackground(Color.gray);
                in3.setBackground(Color.gray);








            }


        });

        btn2.addActionListener(e->{
            j.dispose();
        });

    }

    public void queryStudent() {

        jdbc.allMembers(con);

        String[] thead = {"工号","姓名","性别","年龄","基本工资","津贴","综合工资"};


        String[][] abody=new String[jdbc.no.length][7];

        System.out.println(jdbc.no.length);

        for (int i=0;i<jdbc.no.length;i++){

            System.out.println(jdbc.no.length);

            abody[i][0]= String.valueOf(jdbc.no[i]);
            abody[i][1]=jdbc.name[i];
            abody[i][2]=jdbc.sex[i];
            abody[i][3]= String.valueOf(jdbc.age[i]);
            abody[i][4]= String.valueOf(jdbc.salary[i]);
            abody[i][5]= String.valueOf(jdbc.allowance[i]);
            abody[i][6]= String.valueOf(jdbc.total[i]);

        }

        TableModel dataModel = new DefaultTableModel(abody, thead);
        table.setModel(dataModel);
    }

    public String[][] list2Array(ArrayList<Staff> list){
        String[][] tbody = new String[list.size()][7];
        for (int i = 0; i < list.size(); i++) {
            Staff staff = list.get(i);
            tbody[i][0] = staff.getId();
            tbody[i][1] = staff.getName();
            tbody[i][2] = staff.getSex();
            tbody[i][3] = staff.getAge()+"";
            tbody[i][4] = staff.getBasic();
            tbody[i][5] = staff.getAllowances();
            tbody[i][6] = staff.getInterated();

        }
        return tbody;
    }
}