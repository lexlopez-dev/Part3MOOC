import java.util.ArrayList;
import java.util.Scanner;

public class ForEachSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();

        System.out.println("Enter some integers: ");

        while(true) {
            Integer num = Integer.valueOf(input.nextLine());
            if(num == -1){
                break;
            }else{
                intList.add(num);
            }
        }

        int sum = 0;
        int count = 0;
        for (Integer number : intList){
            sum = sum + number;
            count++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: "+ (sum / count));
    }
}
