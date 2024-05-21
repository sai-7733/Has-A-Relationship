class Address{
    int streetNum;
    String city;
    String state;
    String country;
    Address(int streetNum,String city,String state,String country){
        this.streetNum=streetNum;
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
public class Student{
    int rollNum;
    String studentName;
    Address stdAddr;
    Student(int rollNum,String studentName,Address stdAddr){
        this.rollNum=rollNum;
        this.studentName=studentName;
        this.stdAddr=stdAddr;
    }
    public static void main(String args[]){
        Address add=new Address(55,"kadapa","AP","India");
        Student st=new Student(23,"Sai",add);
        System.out.println(st.studentName);
        System.out.println(st.rollNum);
        System.out.println(st.stdAddr.streetNum);
        System.out.println(st.stdAddr.country);
        System.out.println(st.stdAddr.state);
    }
}