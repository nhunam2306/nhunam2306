import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    Point() {

    }

    void setX(double x) {
        this.x = x;
    }

    double getX() {
        return x;
    }

    void setY(double y) {
        this.y = y;
    }

    double getY() {
        return y;
    }

    static void nhap(Point diem1, Point diem2, Point diem3) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap toa do x cua diem 1:");
        diem1.setX(sc.nextDouble());
        System.out.println("nhap toa do y cua diem 1:");
        diem1.setY(sc.nextDouble());

        System.out.println("nhap toa do x cua diem 2:");
        diem1.setX(sc.nextDouble());
        System.out.println("nhap toa do y cua diem 2:");
        diem1.setY(sc.nextDouble());

        System.out.println("nhap toa do x cua diem 3:");
        diem1.setX(sc.nextDouble());
        System.out.println("nhap toa do y cua diem 3:");
        diem1.setY(sc.nextDouble());
    }

    static double dodai_diem1_diem2(Point diem1, Point diem2) {
        return Math.sqrt(((diem2.x - diem1.x) * (diem2.x - diem1.x)) + ((diem2.y - diem1.y) * (diem2.y - diem1.y)));
    }

    static double dodai_diem1_diem3(Point diem1, Point diem3) {
        return Math.sqrt(((diem3.x - diem1.x) * (diem3.x - diem1.x)) + ((diem3.y - diem1.y) * (diem3.y - diem1.y)));
    }

    static double dodai_diem2_diem3(Point diem2, Point diem3) {
        return Math.sqrt(((diem3.x - diem2.x) * (diem3.x - diem2.x)) + ((diem3.y - diem2.y) * (diem3.y - diem2.y)));
    }

    static int kiem_tra_thang_hang(Double a, Double b, Double c) {
        if (a + b == c || a + c == b || c + b == a) {
            return 1;
        } else {
            return 0;
        }

    }

    static double chuvi(double a, double b, double c) {
        return a + b + c;
    }

    static double S(double a, double b, double c) {
        return (0.25 * Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)));

    }

    public static void main(String[] args) {
        System.out.println(" kiem tra 3 diem co thang hang hay khong:");
        System.out.println("tinh khoang cach 2 diem:");
        System.out.println("tinh chu vi :");
        System.out.println("nhap 3 diem ");

        Point diem1 = new Point();
        Point diem2 = new Point();
        Point diem3 = new Point();
        nhap(diem1, diem2, diem3);
        double a = dodai_diem1_diem2(diem1, diem2);
        double b = dodai_diem1_diem3(diem1, diem3);
        double c = dodai_diem2_diem3(diem2, diem3);
        int check = kiem_tra_thang_hang(a, b, c);
        if (check == 1) {
            System.out.println(" 3 diem ban vua nhap thang hang nhau");
        } else {
            System.out.println("3 diem khong thang hang ");
            System.out.println("khoang cach diem 1 va diem 2:" + a);
            System.out.println("khoang cach diem 1 va diem 3" + b);
            System.out.println("khoang cach diem 2 va diem 3" + c);
            System.out.println("chu vi tam giac tao boi 3 diem =" + S(a, b, c));
        }

    }

}