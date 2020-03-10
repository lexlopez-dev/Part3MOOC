import java.util.ArrayList;
import java.util.Scanner;

public class SizeAndIterating {
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
        System.out.println(nameList);
        System.out.println("In total: "+ nameList.size());

        for(int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));

            System.out.println("Printing in a different way");
            String name = nameList.get(i);
            System.out.println(name);
        }


    }
}
