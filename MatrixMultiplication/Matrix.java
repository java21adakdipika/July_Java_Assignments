import java.util.Scanner; 
 
public class Matrix { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Enter the no. of rows of 1st matrix: "); 
        int m1 = scanner.nextInt(); 
        System.out.print("Enter the no. of columns of 1st matrix: "); 
        int n1 = scanner.nextInt(); 
 
        System.out.print("Enter the no. of rows of 2nd matrix: "); 
        int m2 = scanner.nextInt(); 
        System.out.print("Enter the no. of columns of 2nd matrix: "); 
        int n2 = scanner.nextInt(); 
 
        if (n1 != m2) { 
            System.out.println("Error: The no. of columns of 1st matrix must be equal to the no. of rows of the 2nd matrix."); 
            return; 
        } 
 
        int[][] matrix1 = new int[m1][n1]; 
        int[][] matrix2 = new int[m2][n2]; 
 
        System.out.println("Enter the elements of the first matrix:"); 
        for (int i = 0; i < m1; i++) { 
            for (int j = 0; j < n1; j++) { 
                matrix1[i][j] = scanner.nextInt(); 
            } 
        } 
 
        System.out.println("Enter the elements of the second matrix:"); 
        for (int i = 0; i < m2; i++) { 
            for (int j = 0; j < n2; j++) { 
                matrix2[i][j] = scanner.nextInt(); 
            } 
        } 
 
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2); 
 
        System.out.println("Resultant matrix after multiplication:"); 
        for (int i = 0; i < m1; i++) { 
            for (int j = 0; j < n2; j++) { 
                System.out.print(resultMatrix[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
 
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) { 
        int m1 = matrix1.length; 
        int n1 = matrix1[0].length; 
        int m2 = matrix2.length; 
        int n2 = matrix2[0].length; 
 
        int[][] result = new int[m1][n2]; 
 
        for (int i = 0; i < m1; i++) { 
            for (int j = 0; j < n2; j++) { 
                for (int k = 0; k < n1; k++) { 
                    result[i][j] += matrix1[i][k] * matrix2[k][j]; 
                } 
            } 
        } 
 
        return result; 
    } 
}