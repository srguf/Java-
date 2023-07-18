import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


class FileSave{
    public static void save() throws IOException {
        File f=new File("Staff.txt");
        if(f.exists()) {
            f.delete();
        }
        f.createNewFile();
        FileWriter fw=null;
        fw=new FileWriter("Staff.txt");
        int i;
        for(i=0;i<chief.data.size();i++) {
            String tmp=new String(chief.data.get(i).getId()+"\t"+chief.data.get(i).getName()+"\t"+chief.data.get(i).getSex()+"\t"+chief.data.get(i).getAge()+"\t"+chief.data.get(i).getBasic()+"\t"+chief.data.get(i).getAllowances()+"\t"+chief.data.get(i).getInterated());
            fw.write(tmp+"\r\n");
        }
        fw.close();
    }
}

public class Staff {
    private String id;
    private String name;
    private String sex;
    private String age;
    private String basic;
    private String allowances;
    private String interated;

    public Staff() {
    }

    public Staff(String id,String name,String sex,String age,String basic,String allowances,String interated) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.basic = basic;
        this.allowances = allowances;
        this.interated = interated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {



        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }




    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getAllowances() {
        return allowances;
    }

    public void setAllowances(String allowances) {
        this.allowances = allowances;
    }

    public String getInterated() {
        return interated;
    }

    public void setInterated(String interated) {
        this.interated = interated;
    }
}