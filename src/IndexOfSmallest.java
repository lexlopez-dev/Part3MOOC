import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();

        System.out.println("Enter some integers: ");

        while(true) {
            Integer num = Integer.valueOf(input.nextLine());
            if(num == 9999){
                break;
            }else{
                intList.add(num);
            }
        }

        int smallest = intList.get(0);

        for(int i = 0; i < intList.size(); i ++){
            int num = intList.get(i);
            if (num < smallest) {
                smallest = intList.get(i);
            }else if(smallest == num){
                System.out.println("Found at index: " + i);
            }
        }

        System.out.println("Smallest number: " + smallest);

    }
}