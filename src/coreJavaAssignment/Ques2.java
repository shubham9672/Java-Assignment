package coreJavaAssignment;

// Q-2=> Implement your own encapsulating classes

class Student{
    private String name;
    private int rollNo;
    private int age;
    public int getAge() { return age; }
    public String getName() { return name; }
    public int getRollno() { return rollNo; }
    public void setAge(int newAge) { age = newAge; }
    public void setName(String newName)
    {
        name = newName;
    }

    public void setRoll(int newRoll) { rollNo = newRoll; }
}

public class Ques2 {
    public static void main(String[] args) {
    Student st=new Student();
    st.setName("Shubham");
    st.setAge(15);
    st.setRoll(41);
    System.out.println("Student Details \n Name: "+st.getName()+"\n Age: "+st.getAge()+"\n Roll No.: "+st.getRollno());
    }
}
