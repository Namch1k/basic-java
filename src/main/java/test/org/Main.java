package test.org;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static boolean isValidMatrix(int[][] matrix) {
        return matrix != null && matrix.length > 0 && matrix[0].length > 0;
    }
    public static int[][] setMatrix(int row, int col) {
        if ((row <= 0 || col <= 0) || (row > 20 || col > 20)) {
            System.out.println("Invalid value of rows or cols");
            return null;
        }
        int[][] matrix = new int[row][col];
        Scanner scan = new Scanner(System.in);
        System.out.print(
                "How to set matrix: " +
                "\n1. Manual input" +
                "\n2. Random generation" +
                "\nEnter your choice: "
        );
        switch (scan.nextInt()) {
            case 1:
                matrix = inputMatrix(row, col);
                break;
            case 2:
                matrix = randomMatrix(row, col);
                break;
            default:
                System.out.println("Invalid value");
                matrix = null;
                break;
        }
        return matrix;
    }
    public static void getMatrix(int[][] matrix) {
        if (!isValidMatrix(matrix)) {
            System.out.println("Matrix is null.");
            return;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        System.out.println("Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int [][] inputMatrix (int row, int col) {
        System.out.println("Enter elements of the matrix:");
        int[][] matrix = new int[row][col];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix;
    }
    public  static int [][] randomMatrix(int row, int col) {
        final int RANDOM_RANGE = 100;
        System.out.println("Generating matrix...");
        int[][] matrix = new int[row][col];
        Random random = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = random.nextInt(RANDOM_RANGE);
            }
        }
        return matrix;
    }
    public static int[] minMax(int[][] matrix) {
        if (!isValidMatrix(matrix)) {
            System.out.println("Matrix is null.");
            return null;
        }
        int min = matrix[0][0];
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return new int[]{min, max};
    }
    public static double calculateArithmeticMean(int[][] matrix) {
        if (!isValidMatrix(matrix)) {
            System.out.println("Matrix is null.");
            return 0;
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        return (double) sum / count;
    }
    public static double calculateGeometricMean(int[][] matrix) {
        if (!isValidMatrix(matrix)) {
            System.out.println("Matrix is null.");
            return 0;
        }
        int totalElements = 0;
        double product = 1.0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                product *= matrix[i][j];
                totalElements++;
            }
        }
        return Math.pow(product, 1.0 / totalElements);
    }
    public static void main(String[] args) {
        System.out.println("Enter matrix`s size");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter quantity of rows: ");
        int row = scan.nextInt();
        System.out.print("Enter quantity of cols: ");
        int col = scan.nextInt();

        int [][] matrix = setMatrix(row, col);
        getMatrix(matrix);
        System.out.print(
                "What do you want to do with the matrix: " +
                "\n1. Search for the min/max values" +
                "\n2. Calculation of arithmetic mean" +
                "\n3. Calculation of geometric mean" +
                "\nEnter your choice: "
        );
        switch (scan.nextInt()) {
            case 1:
                System.out.println(Arrays.toString(minMax(matrix)));
                break;
            case 2:
                System.out.println(calculateArithmeticMean(matrix));
                break;
            case 3:
                System.out.println(calculateGeometricMean(matrix));
                break;
            default:
                System.out.println("Invalid value");
                break;
        }
    }
}