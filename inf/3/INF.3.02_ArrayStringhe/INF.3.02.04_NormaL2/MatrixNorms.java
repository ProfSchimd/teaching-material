public class MatrixNorms {

    // Metodo per calcolare la norma L2 di una riga
    public static double rowL2Norm(double[][] matrix, int rowIndex) {
        double sum = 0;
        for (int j = 0; j < matrix[rowIndex].length; j++) {
            sum += matrix[rowIndex][j] * matrix[rowIndex][j];
        }
        return Math.sqrt(sum);
    }

    // Metodo per calcolare la norma L2 di una colonna
    public static double columnL2Norm(double[][] matrix, int colIndex) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][colIndex] * matrix[i][colIndex];
        }
        return Math.sqrt(sum);
    }

    // Metodo per calcolare le norme L2 di tutte le righe
    public static double[] allRowsL2Norms(double[][] matrix) {
        double[] norms = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            norms[i] = rowL2Norm(matrix, i);
        }
        return norms;
    }

    // Metodo per calcolare le norme L2 di tutte le colonne
    public static double[] allColumnsL2Norms(double[][] matrix) {
        double[] norms = new double[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            norms[j] = columnL2Norm(matrix, j);
        }
        return norms;
    }

    // Metodo per calcolare le norme L2 di tutte le righe e colonne
    public static double[][] allRowsAndColumnsL2Norms(double[][] matrix) {
        double[][] result = new double[2][];
        result[0] = allRowsL2Norms(matrix);
        result[1] = allColumnsL2Norms(matrix);
        return result;
    }

    // Metodo per stampare un array di double
    public static void printArray(double[] array, String label) {
        System.out.print(label + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Test dei metodi
        System.out.println("Norma L2 della riga 0: " + rowL2Norm(matrix, 0));
        System.out.println("Norma L2 della colonna 0: " + columnL2Norm(matrix, 0));

        double[] rowNorms = allRowsL2Norms(matrix);
        printArray(rowNorms, "Norme L2 di tutte le righe");

        double[] columnNorms = allColumnsL2Norms(matrix);
        printArray(columnNorms, "Norme L2 di tutte le colonne");

        double[][] norms = allRowsAndColumnsL2Norms(matrix);
        printArray(norms[0], "Norme L2 di tutte le righe");
        printArray(norms[1], "Norme L2 di tutte le colonne");
    }
}