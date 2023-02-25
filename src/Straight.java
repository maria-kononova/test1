import java.lang.StringBuilder;
import java.math.RoundingMode;

public class Straight {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public double X1() {
        return x1;
    }

    public double Y1() {
        return y1;
    }

    public double X2() {
        return x2;
    }

    public double Y2() {
        return y2;
    }

    public Straight(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String printStraight() {
        StringBuilder builder = new StringBuilder();
        builder.append("y = ");

        double k = (Y1() - Y2()) / (X1() - X2());
        builder.append(k + "*x");
        double b =Y2() - k * X2();
        if (b>=0) builder.append("+ ");
        builder.append(b);
        return builder.toString();
    }

    private double getK() {
        return (Y2() - Y1()) / (X2() - X1());
    }

    public boolean parallelismCheck(Straight straight2)
    {
        return getK() == straight2.getK();
    }
    private double radianToDegree(double x)
    {
        return x * 180 / 3.14;
    }

    public double angleBetween(Straight straight2)
    {
        return radianToDegree(Math.atan(Math.abs(straight2.getK() - getK())/ (1+getK() * straight2.getK())));
    }
}
