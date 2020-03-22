import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int[] numbers = new int[5];

        numbers[0] = 15;
        numbers[1] = 12;
        numbers[2] = 10;
        numbers[3] = 30;
        numbers[4] = 50;

        int index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index = index + 1;
        }


        System.out.println("Which two indices? ");
        int index1 = Integer.valueOf(reader.nextLine());
        int index2 = Integer.valueOf(reader.nextLine());

        int helper = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index1] = helper;


        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i = i + 1;
        }

    }
}
