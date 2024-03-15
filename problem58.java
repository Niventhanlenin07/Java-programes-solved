import java.util.Scanner;
class problem58{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int num = scanner.nextInt();
        printPattern(num);
    }

    public static void printPattern(int num) {
        int totalRows = 2 * num - 1;
        int midRow = totalRows / 2 + 1;
        for (int i = 1; i <= totalRows; i++) {
            int stars;
            if (i <= midRow) {
                stars = num - i + 1;
            } else {
                stars = i - midRow + 1;
            }
            int dashes = num - stars;

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < dashes; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < dashes; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
