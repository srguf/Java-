import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class JDBC {

    int[] no=null;
    String[] name=null;
    String[] sex=null;
    int[] age=null;
    int[] salary=null;
    int[] allowance=null;
    int[] total=null;



    public static void main(String[] args) {

        JDBC jdbc = new JDBC();
        Connection con=jdbc.linkDataBase();
//        jdbc.loginInf(con);
//        jdbc.allMembers(con);

        jdbc.allMembers(con);


    }

    //获取数据库链接
    public Connection linkDataBase(){

        String url="jdbc:mysql:///工资管理系统";
        String user="root";
        String password="102030456789";

        Connection con= null;
        try {

            con = DriverManager.getConnection(url,user,password);
            //System.out.println(con);
            return con;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }

    //查询数据库信息
    //获取所有的登录信息
    public HashMap<String,String> loginInf(Connection con){

        String sql="select * from 登录信息";

        HashMap<String, String> hashMap = new HashMap<>();

        try {
            PreparedStatement p1=con.prepareStatement(sql);
            ResultSet resultSet = p1.executeQuery();
            while (resultSet.next()){
                //System.out.println(resultSet.getString(1)+"--->"+resultSet.getString(2));
                hashMap.put(resultSet.getString(1), resultSet.getString(2));
            }
            return hashMap;
        } catch (SQLException e) {
            e.printStackTrace();
        }



        return null;
    }

    public void add(Connection con,String name,String sex,String age,String salary,String allowance){

        String sql="insert into 员工工资表 (Name,Sex,Age,Salary,Allowance,Total) values (?,?,?,?,?,?)";

        int total= Integer.parseInt(salary)+Integer.parseInt(allowance);

        try {
            PreparedStatement preparedStatement=con.prepareStatement(sql);
            //preparedStatement.setString(1,no);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, sex);
            preparedStatement.setString(3,age);
            preparedStatement.setString(4,salary);
            preparedStatement.setString(5,allowance);
            preparedStatement.setString(6, String.valueOf(total));

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void allMembers(Connection con){


        String sql="select * from 员工工资表";

        try {
            PreparedStatement preparedStatement=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet set = preparedStatement.executeQuery();

            set.last();
            int count=set.getRow();
            set.beforeFirst();



            no=new int[count];
            name= new String[count];
            sex= new String[count];
            age=new int[count];
            salary=new int[count];
            allowance=new int[count];
            total=new int[count];

            int i=0;

            while (set.next()){

                no[i]=set.getInt(1);
                name[i]=set.getString(2);
                sex[i]=set.getString(3);
                age[i]=set.getInt(4);
                salary[i]=set.getInt(5);
                allowance[i]=set.getInt(6);
                total[i]=set.getInt(7);

                i++;

            }



            i--;

           /* for (int k=0; k<count; k++){
                System.out.println(no[k]);
                System.out.println(name[k]);
                System.out.println(sex[k]);
                System.out.println(age[k]);
                System.out.println(salary[k]);
            }
*/



        } catch (SQLException e) {
            e.printStackTrace();
        }



    }




}
