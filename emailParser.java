import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String email;
        String domain;
        String username;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();
        domain = email.substring(0, email.indexOf("@"));
        username = email.substring(email.indexOf("@") + 1);

        if(email.contains("@")) {
            System.out.printf("email-id: %s\n", email);
            System.out.printf("Username: %s\n", username);
            System.out.printf("email domain: %s", domain);
        }
        else {
            System.out.println("email-id must contain @");
        }


        scanner.close();
    }
}