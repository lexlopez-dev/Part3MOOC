import java.util.Scanner;

public class IndexNotFound {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] numbers = new int[5];

        numbers[0] = 15;
        numbers[1] = 12;
        numbers[2] = 10;
        numbers[3] = 30;
        numbers[4] = 50;

        System.out.println("Search for? ");
        int search = Integer.valueOf(reader.nextLine());

        for(int i = 0;i < numbers.length; i++){
            if(numbers[i] == search){
                System.out.println(search + " is at index " + i);
            }
        }


    }
}
