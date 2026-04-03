public class StudentMain {
    public static void main(String[] args) {
        
        student s = new student();

        System.out.println("Name : "+ s.name);
        System.out.println(s.GetAverage("Vimal", 80,70,90));
        System.out.println(s.GetGrade());
    }
}