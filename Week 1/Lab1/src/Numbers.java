public class Numbers {
    private int[] numbers;
    private int[][] squares;

    Numbers(int size) {
        this.numbers = new int[size];
    }

    Numbers(int row, int col) {
        this.squares = new int[row][col];
    }

    public void generateNumbers() {
        for (int i = 0; i < this.numbers.length; i++) {
            this.numbers[i] = i;
        }
    }

    public void printNumbers() {
        for (int i = 0; i < this.numbers.length; i++) {
            System.out.print(this.numbers[i] + "\t");
        }
    }

    public void printIndices() {
        for (int i = 0; i < this.squares.length; i++) {
            for (int j = 0; j < this.squares[0].length; j++) {
                System.out.print("(" + i + ", " + j + ")\t");
            }
            System.out.println();
        }
    }

    public void generateSquares() {
        for (int i = 0; i < this.squares.length; i++) {
            for (int j = 0; j < this.squares[0].length; j++) {
                this.squares[i][j] = (i * this.squares[0].length + j) * (i * this.squares[0].length + j);
            }
        }
    }

    public void printSquares() {
        for (int i = 1; i < this.squares.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%5d ", this.squares[i][j]);
            }
            System.out.println();
        }
    }

    public void printStarPattern1() {
        for (int i = 1; i < this.squares.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%s ", "*");
            }
            System.out.println();
        }
    }

    public void printStarPattern2() {
        for (int i = this.squares.length - 2; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%s ", "*");
            }
            System.out.println();
        }
    }
}
