import java.util.ArrayList;
import java.util.Scanner;

public class NumbersList {
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

        System.out.print("From where?");
        Integer start = Integer.valueOf(input.nextLine());
        System.out.print("To where?");
        Integer end = Integer.valueOf(input.nextLine());

        for(int i = 0; i < intList.size(); i ++){
            int num = intList.get(i);
            if (num >= start && num <= end) {
                System.out.println(num);
            }
        }

    }
}
