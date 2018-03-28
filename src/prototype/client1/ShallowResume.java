package prototype.client1;

import java.util.ArrayList;

public class ShallowResume implements Cloneable{
    public String name = null;
    public Integer age = null;
    public String sex = null;
    public ArrayList<String> famMem =  new ArrayList<>();
    public WorkExperience work = null;

    public ShallowResume(String name){
        this.name = name;
        work = new WorkExperience();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPersonal(String sex, int age, ArrayList<String> famMem){
        this.age = age;
        this.sex = sex;
        this.famMem = famMem;
    }

    public void setWork(String timeArea, String company) {
        work.timeArea = timeArea;
        work.company = company;
    }

    // 重写clone方法为public类型，并调用Object类的本地clone()方法
    @Override
    protected ShallowResume clone() throws CloneNotSupportedException {
        return (ShallowResume)super.clone();
    }
    public void display(){
        System.out.println(this.name + " " + this.sex + " " + this.age);
        System.out.print("Family member: ");
        for(String elem : famMem)
            System.out.print(elem + " ");
        System.out.println();
        System.out.print("Work experience: " + this.work.timeArea);
        System.out.println(" " + this.work.company);
    }
}
