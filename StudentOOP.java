class Student {
    int rollno;
    String name;

    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    void displayDetails(){
        System.out.println("Name:" + name);
        System.out.println("Roll No:" + rollno);
    }
}

 public class StudentOOP{
    public static void main(String[] args){
        Student s1 = new Student("Nimisha",18);
        s1.displayDetails();
    }
}