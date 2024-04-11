package Matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addition_of_Matrix_Using_List {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        
        List<List<Integer>> matrix1 = new ArrayList<>();
        List<List<Integer>> matrix2 = new ArrayList<>();
        List<List<Integer>> sum = new ArrayList<>();
        
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) 
        { //assigning a list of rows 
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) 
            {
            	row.add(sc.nextInt());
            }
            	matrix1.add(row);
        }
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(sc.nextInt());
            }
            matrix2.add(row);
        }
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
               row.add(matrix1.get(i).get(j)+matrix2.get(i).get(j));
            }
            sum.add(row);
        }
        System.out.println("The sum of the matrices is:");
//        for (List<Integer> row : sum) {
//            for (int element : row) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
        for (List<Integer> row : sum) {
            System.out.println(row);
        }

        sc.close();
        
    }
        
}

//Time Complexity Analysis:
//Input Reading:
//
//Reading the dimensions of the matrices: O(1)
//Reading the elements of each matrix: O(rows * columns) for each matrix (assuming rows and columns are the dimensions of the matrices)
//Matrix Addition:
//
//Traversing each element of the matrices and adding them: O(rows * columns) for each matrix
//Displaying the Result:
//
//Traversing the resulting matrix: O(rows * columns)
//Overall, the time complexity of the program is O(rows * columns) where rows and columns are the dimensions of the matrices.
//
//Space Complexity Analysis:
//Input Matrices:
//
//Each matrix occupies space for storing its elements: O(rows * columns) for each matrix
//Resultant Matrix:
//
//Space required for storing the resultant matrix: O(rows * columns)
//Auxiliary Space:
//
//Additional space required for storing list objects and other variables: O(rows * columns)
//Overall, the space complexity of the program is O(rows * columns).
