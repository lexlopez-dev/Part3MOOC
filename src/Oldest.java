import java.util.Scanner;

public class Oldest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int oldest = 0;
        String name = "";

        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int ageOf = Integer.valueOf(parts[1]);

            if(ageOf > oldest){
                oldest = ageOf;
                name = parts[0];
            }
        }

        System.out.println("The oldest age is: " + oldest);
        System.out.println("Name of the oldest: " + name);
    }
}
