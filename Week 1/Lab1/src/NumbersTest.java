public class NumbersTest {
    public static void main(String[] args) {
        Numbers n1 = new Numbers(10);
        n1.generateNumbers();
        System.out.println("\nPrinting Numbers\n");
        n1.printNumbers();

        Numbers n2 = new Numbers(10, 10);
        System.out.println("\n\nPrinting indices\n");
        n2.printIndices();

        n2.generateSquares();

        System.out.println("\nPrinting squares\n");
        n2.printSquares();

        System.out.println("\nPrinting star patterns\n");
        n2.printStarPattern1();
        n2.printStarPattern2();
    }
}
