import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String line = input.nextLine();
        String[] pieces = line.split(" ");

        for(int i = 0;i < pieces.length; i++){
            if(pieces[i].contains("av")){
                System.out.println(pieces[i]);
            }
        }
    }
}
