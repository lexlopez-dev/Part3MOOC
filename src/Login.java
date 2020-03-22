import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};

        System.out.print("Enter a username: ");
        String id = reader.nextLine();

        int index = 0;
        for(int i = 0; i < username.length; i++){
            if(id.equals(username[i])){
                index = i;
            }
        }

        System.out.print("Enter the password: ");
        String pass = reader.nextLine();

        if(pass.equals(password[index])){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password.");
        }

    }
}