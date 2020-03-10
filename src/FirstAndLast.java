import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();

        System.out.println("Enter strings: ");

        while(true){
            String name = String.valueOf(input.nextLine());
            if (name.equals("")){
                break;
            }else{
                nameList.add(name);
            }
        }

        int last = nameList.size() - 1;
        System.out.println("Last String is: " + nameList.get(last));
        System.out.println("First String is: " + nameList.get(0));
    }
}
