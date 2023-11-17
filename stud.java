abstract class Marks {
    abstract double percent();
}

class A extends Marks {
    private double s1, s2, s3;

    public A(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    double percent() {
        return (s1 + s2 + s3) / 3;
    }
}

class B extends Marks {
    private double s1, s2, s3, s4;

    public B(double s1, double s2, double s3, double s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    @Override
    double percent() {
        return (s1 + s2 + s3 + s4) / 4;
    }


}

public class stud {
    
    public static void main(String[] args) {
        A studA = new A(80, 75, 90);
        B studB = new B(85, 90, 88, 92);

        System.out.println("Percentage of Student A: " + studA.percent() + "%");
        System.out.println("Percentage of Student B: " + studB.percent() + "%");
    }
}
