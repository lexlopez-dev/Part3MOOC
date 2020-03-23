import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            String line = input.nextLine();
            if (line.equals("")) {
                break;
            }

            String[] pieces = line.split(" ");
            int last = pieces.length - 1;
            System.out.println(pieces[last]);
        }

    }
}
