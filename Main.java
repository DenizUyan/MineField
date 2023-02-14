import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the row number: ");
        int row = input.nextInt();
        System.out.print("Please enter the col number: ");
        int col = input.nextInt();
        MineSweeper mine = new MineSweeper(row, col);
        mine.run();
    }
}