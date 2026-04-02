class Student {
    String name ;
    int marks;

    void StuName(String n) {
        if(n != " ") {
            this.name  =  n;
        }
    }

    void StuMarks(int m) {
        this.marks = m;
    }

    void display() {
        System.out.println("My name is : "+name);
        System.out.println("My marks are : "+marks);
        
    }
}

public class StudentRes {
    public static void main(String[] args) {
    Student s = new Student();
    s.StuName("Vimal");
    s.StuMarks(95);

    s.display();

    }
}