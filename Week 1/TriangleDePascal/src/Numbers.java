public class Numbers {
    /*Déclare les attributs de la classe*/
    private int col;
    private int row;
    private int[][] table;

    /*Constructor d'objet par défaut sans attributs*/ 
    Numbers() {

    }
    /*Constructor d'objet avec attributs*/
    Numbers(int a, int b) {
        this.row = a;
        this.col = b;
        this.table = new int[a][b]; /*Attribut la taille de l'array 2D*/
    }

    /*Génère une table de valeurs selon des paramètres de colonnes et rangées.
    Commence toujours de compter à 1.*/
    public void generateNumberTable() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                this.table[i][j] = i*this.col + j + 1;
            }
        }
    }

    /*Créer un triangle de Pascal*/
    public void pascalTriangle(int size) {
        int[][] triangle = new int[size][];
        for (int i = 0; i < size; i++) {
            int colLen = i + 1;
            triangle[i] = new int[colLen];
            triangle[i][0] = 1;
            triangle[i][colLen - 1] = 1;
            for (int j = 1; j < colLen - 1; j++) { /*Vérifie que le pic commence à 1 et que chaque rangée débute et termine avec 1.*/
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        print2D(triangle);
    }

    /*Imprime la table de valeurs dans la console.*/
    public void printTable() {
        // for (int i = 0; i < this.row; i++) {
        //     for (int j = 0; j < this.col; j++) {
        //         System.out.print(this.table[i][j] + "\t"); /*Imprime la valeur avec un TAB pour aesthétique*/
        //     }
        //     System.out.println(); /*Nouvelle ligne après chaque rangées.*/
        // }
        // System.out.println();
        print2D(this.table);
    }

    public void print2D(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + "\t"); /*Imprime la valeur avec un TAB pour aesthétique*/
            }
            System.out.println(); /*Nouvelle ligne après chaque rangées.*/
        }
        System.out.println();
    }
}
