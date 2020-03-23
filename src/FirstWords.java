import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            String line = input.nextLine();
            if (line.equals("")) {
                break;
            }

            String[] pieces = line.split(" ");
            System.out.println(pieces[0]);
        }

    }
}
