public class student {

    String name ;
    int mark1;
    int mark2;
    int mark3;

    double GetAverage(String s, int m1, int m2, int m3) {
        this.name = s;
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
        
        return (m1 + m2 + m3) / 3.0;
    }

    String GetGrade() {
        double average = GetAverage(name, mark1, mark2, mark3);

        if(average >= 90) {
            return "A";
        }

        else if(average >= 80) {
            return "B";
        }

        else if(average >= 70) {
            return "C";
        }

        else if(average >= 60) {
            return "D";
        }

        else {
            return "Fail";
        }
    }
}