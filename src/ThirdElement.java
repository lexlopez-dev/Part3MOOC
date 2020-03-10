import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();

        System.out.print("Enter strings: ");
        while(true){
            String name = String.valueOf(input.nextLine());
            if (name.equals("")){
                break;
            }else{
                nameList.add(name);
            }
        }
        System.out.println(nameList);
        System.out.println(nameList.get(2));


    }
}
