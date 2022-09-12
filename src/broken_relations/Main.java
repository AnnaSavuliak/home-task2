package broken_relations;

public class Main {
    public static void main(String[] args) {
        checkSymmetric();
        checkTransitivity();
        checkReflexive();
    }

    private static void checkSymmetric() {
        System.out.println("Checking symmetric...");

        Point a = new Point(1,2);
        BrokenSymmetricPoint b = new BrokenSymmetricPoint(1,2,"green");

        System.out.println("a equals b: " + a.equals(b));
        System.out.println("b equals a: " + b.equals(a));

        System.out.println("---------------------");
    }

    private static void checkTransitivity() {
        System.out.println("Checking transitivity...");

        Point a = new BrokenTransitivityPoint(1,2,"red");
        Point b = new Point(1,2);
        BrokenTransitivityPoint c = new BrokenTransitivityPoint(1,2,"green");

        System.out.println("a equals b: " + a.equals(b));
        System.out.println("b equals c: " + b.equals(c));
        System.out.println("a equals c: " + a.equals(c));

        System.out.println("---------------------");
    }
    private static void checkReflexive() {
        System.out.println("Checking reflexive...");

        Point a = new BrokenReflexivePoint(1,2);
        System.out.println("a equals a: " + a.equals(a));
    }
}
