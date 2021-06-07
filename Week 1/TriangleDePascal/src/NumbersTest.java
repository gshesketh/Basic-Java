import java.util.Scanner;

public class NumbersTest {
    /*Demande des paramètres de rangées et colonnes pour la table de valeurs.
    Imprime la table ainsi que le triangle de pascal.*/
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Sélectionnez le nombres de rangées désiré :");
        int rang = console.nextInt();
        System.out.println("Sélectionnez le nombres de colonnes désiré :");
        int colo = console.nextInt();
        System.out.println("\nTable de valeurs\n");
        Numbers n1 = new Numbers(rang, colo);
        Numbers n2 = new Numbers();
        n1.generateNumberTable();
        n1.printTable();
        System.out.println("Sélectionnez la taille du triangle de Pascal désiré :");
        int taille = console.nextInt();
        System.out.println("\nTriangle de Pascal\n");
        n2.pascalTriangle(taille);
        console.close();
    }
}
