import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = scan.nextInt();
        System.out.print("Columns: ");
        int columns = scan.nextInt();

        for ( int i = 0; i < rows; ++i )
            for ( int j = 0; j <= columns; ++j )
                System.out.print( ( j == columns ) ? '\n' : ( i == 0 || i == rows - 1 || j == 0 || j == columns - 1 ) ? '*' : ' ');

        System.out.println();
    }
}