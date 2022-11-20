package PatikaStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which process do you want ? (1.Admin) (2.Customer)");
        int select = scanner.nextInt();
        if (select == 1){
            AdminInterface adminInterface = new AdminInterface();
            adminInterface.signIn();
        }
        else {
            UserInterface userInterface = new UserInterface();
            userInterface.startMenu();
        }
    }
}
