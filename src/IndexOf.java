import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
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

        System.out.print("What number?");
        Integer userNum = Integer.valueOf(input.nextLine());


        for(int i = 0; i < intList.size(); i ++){
            int num = intList.get(i);
            if (num == userNum) {
                System.out.println(num + " is at index " + i);
            }
        }
    }
}

