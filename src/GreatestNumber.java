import java.util.ArrayList;
import java.util.Scanner;

public class GreatestNumber {
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

        int greatest = 0;

        for(int i = 0; i < intList.size(); i ++){
            if (intList.get(i) > greatest) {
                greatest = intList.get(i);
            }
        }
        System.out.println("Greatest number: " + greatest);
    }
}
