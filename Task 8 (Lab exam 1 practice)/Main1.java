import java.util.Scanner;

class Course {
    String[] name = new String[3];
    double[] mark = new double[3];
    int n = 0;

    void addStudent(String s, double m) {
        name[n] = s;
        mark[n] = m;
        n++;
    }

    String getHighestScorer() {
        int max = 0;
        for (int i = 1; i < n; i++)
            if (mark[i] > mark[max]) max = i;
        return name[max] + " (" + (int) mark[max] + ")";
    }

    int countTopGrades(double t) {
        int c = 0;
        for (int i = 0; i < n; i++)
            if (mark[i] >= t) c++;
        return c;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.next(); 

        Course c = new Course();

        for (int i = 0; i < 3; i++)
            c.addStudent(sc.next(), sc.nextDouble());

        System.out.println("Highest Scorer: " + c.getHighestScorer());
        System.out.println("Number of A+ (80+): " + c.countTopGrades(80));
    }
}

