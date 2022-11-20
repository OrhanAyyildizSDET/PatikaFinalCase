package PatikaStore;

import java.util.HashMap;
import java.util.Scanner;

import static PatikaStore.CellPhone.getAllCellPhones;
import static PatikaStore.Laptop.*;
import static java.lang.System.*;

public class AdminInterface {
    private static HashMap<Object, Object> ids= new HashMap<Object, Object>();
    public void signIn(){
        while (true){
            Scanner scanner1 = new Scanner(in);
            out.print("Please enter userName : ");
            String userName = scanner1.nextLine();
            out.print("Please enter password : ");
            String password = scanner1.nextLine();
            if (userName.equals("patika")&&password.equals("patika")){
                out.println("Succesfully entered!");
                startMenu();
                break;
            }
            else {
                out.println("Your password or userName are incorrect");
            }
        }
    }
    public void startMenu(){
        out.println();
        out.println();
        Scanner scanner = new Scanner(in);
        out.println("Welcome to the AdminPanel!");
        out.println("How can ı help you?");
        int choice;
        while (true){
            out.println("1.Notebook Process");
            out.println("2.CellPhone Process");
            out.println("3.Get list of Marks");
            out.println("4.Log out");
            out.print("Please make a your choice...  ");
            choice = scanner.nextInt();
            if (choice != 1 && choice != 2 && choice != 3 && choice != 4){
                out.println("Please enter valid choice");
            } else {
                break;
            }
        }

        out.println("Your choice is : "+choice);
        switch (choice) {
            case 1:
                notebook();
                break;
            case 2:
                cellPhone();
                break;
            case 3:
                marks();
                break;
            case 4:
                out.println("Goodbye admin!");
                break;
            default:
                out.println("Please enter a valid choice");
                break;
        }
        out.println();

    }
    public void notebook(){
        out.println();
        out.println();

        out.println("1.Notebook Add");
        out.println("2.Notebook delete");
        out.println("3.List of Notebook by marks");
        out.println("4.Back to main menu");
        Scanner scanner = new Scanner (in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addNotebook();
                break;
            case 2:
                deleteNotebook();
                break;
            case 3:
                listOfNotebooks();
                break;
            case 4:
                startMenu();
                break;
            default:
                out.println("Please enter a valid choice");
        }
        out.println();

    }
    public void cellPhone(){
        out.println();
        out.println();

        out.println("1.CellPhone add");
        out.println("2.CellPhone delete");
        out.println("3.List of CellPhone by marks");
        out.println("4.Return to main menu");
        Scanner scanner = new Scanner (in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addCellPhone();
                break;
            case 2:
                deleteCellPhone();
                break;
            case 3:
                getAllCellPhones();
                startMenu();
                break;
            case 4:
                startMenu();
                break;
            default:
                out.println("Please enter a valid choice");
        }
        out.println();

    }
    public void marks(){
        out.println();
        out.println();

        out.println("We have this marks of cell phone and notebook");
        Marks.allMarks();
        out.println();
        startMenu();
    }

    public void addNotebook(){
        out.println();
        out.println();
        out.println();
        out.println();
        Scanner scanner = new Scanner (in);
        out.println("Please enter the notebooks features");
        out.print("unitPrice : "); int price = scanner.nextInt();
        out.print("discountAmount : "); double discount = scanner.nextDouble();
        out.print("stockAmount : "); int stock = scanner.nextInt();
        out.print("name : " ); String name = scanner.next();
        out.print("brand : " ); String brand = scanner.next();
        out.print("memoryAmount : " ); int memory = scanner.nextInt();
        out.print("screenSize : " ); double screen = scanner.nextDouble();
        out.print("batterySize : " ); int battery = scanner.nextInt();
        out.print("RAM : " ); int ram = scanner.nextInt();
        out.print("colour : "); String colour = scanner.next();

        HashMap<Object, Object> notebook = new HashMap<>();
        notebook.put("name", name);
        notebook.put("brand", brand);
        notebook.put("memory", memory);
        notebook.put("screenSize", screen);
        notebook.put("ram", ram);
        notebook.put("batterySize", battery);
        notebook.put("colour", colour);
        notebook.put("unitPrice",price);
        notebook.put("stockAmount",stock);
        notebook.put("discountAmount",discount);
        String id = String.format("%06f",Math.random());
        notebook.put("id",id);
        Laptop.addNotebooktoMaps(notebook);
        ids.put(brand,id);
        out.println("Notebook successfully added!");
        notebook();
        out.println();

    }
    public void deleteNotebook(){
        out.println();
        out.println();
        out.println(ids);
        out.println("Please enter the id and the brand you want to delete");
        Scanner scanner = new Scanner (in);
        String deleteId = scanner.next();
        String brand = scanner.next();
        deleteNotebooks(deleteId,brand);
        startMenu();
        out.println();

    }
    public void addCellPhone(){
        out.println();
        out.println();

        Scanner scanner = new Scanner (in);
        out.println("Please enter the notebooks features");
        out.print("unitPrice : "); int price = scanner.nextInt();
        out.print("discountAmount : "); double discount = scanner.nextDouble();
        out.print("stockAmount : "); int stock = scanner.nextInt();
        out.print("name : " ); String name = scanner.next();
        out.print("brand : " ); String brand = scanner.next();
        out.print("memoryAmount : " ); int memory = scanner.nextInt();
        out.print("screenSize : " ); double screen = scanner.nextDouble();
        out.print("batterySize : " ); int battery = scanner.nextInt();
        out.print("RAM : " ); int ram = scanner.nextInt();
        out.print("colour : "); String colour = scanner.next();

        HashMap<Object, Object> cellPhone = new HashMap<>();
        cellPhone.put("name", name);
        cellPhone.put("brand", brand);
        cellPhone.put("memory", memory);
        cellPhone.put("screenSize", screen);
        cellPhone.put("ram", ram);
        cellPhone.put("batterySize", battery);
        cellPhone.put("colour", colour);
        cellPhone.put("unitPrice",price);
        cellPhone.put("stockAmount",stock);
        cellPhone.put("discountAmount",discount);
        cellPhone.put("id",Math.random());


        CellPhone.addCellPhonetoMaps(cellPhone);
        out.println();
        out.println("CellPhone successfully added!");
        cellPhone();
        out.println();

    }
    public void deleteCellPhone(){
        out.println();
        out.println();
        out.println();
        out.println();

    }
    public void listOfNotebooks(){
        out.println("Which process do you want 1. Get all notebooks  2.Get specific marks notebook");
        Scanner scanner = new Scanner (in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                getAllNotebooks();
                startMenu();
                break;
            case 2:
                out.println("Which marks do you want?");
                String note = scanner.next();
                getMarkNotebook(note);
                startMenu();
                break;
        }
    }
}
