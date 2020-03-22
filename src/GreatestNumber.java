import java.util.ArrayList;
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();

        System.out.println("Enter an integer: ");
        Integer num = Integer.valueOf(input.nextLine());
        int place = 0;

        for(int i = 0; i < intList.size(); i ++){
            if (intList.get(i) == num) {
                place = i;
            }
        }
        System.out.println("Greatest number: ");
    }
}
