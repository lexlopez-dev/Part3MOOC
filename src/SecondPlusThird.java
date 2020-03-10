import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();

        System.out.println("Enter some integers: ");

        while(true) {
            Integer num = Integer.valueOf(input.nextLine());
            if(num == 0){
                break;
            }else{
                intList.add(num);
            }
        }
        System.out.println(intList);
        System.out.println(intList.get(1) + intList.get(2));
    }
}
