import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
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

        System.out.println("Choose a Name: ");
        String search = String.valueOf(input.nextLine());

        if(nameList.contains(search)) {
            System.out.println(search + " was found!");
        }else{
            System.out.println(search + " is not on the array.");
        }


    }
}
