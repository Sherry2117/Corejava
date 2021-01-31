package arrays;

public class AdditionTwoMatrices {

    public static void main(String[] args) {
        int a[][] = {{1, 3, 4}, {3, 4, 5}};
        int b[][] = {{1, 3, 4}, {3, 4, 5}};

        //creating another matrix to store the sum of the matrices

        int c[][] = new int[2][3];
        for (int i = 0; i < 2; i++) { //rows
            for (int j = 0; j < 3; j++) { //column
                c[i][j] = b[i][j] +b[i] [j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}