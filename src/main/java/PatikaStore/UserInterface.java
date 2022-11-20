package PatikaStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import static PatikaStore.CellPhone.getAllCellPhones;
import static PatikaStore.Laptop.getAllNotebooks;
import static java.lang.System.*;
import static java.lang.System.out;

public class UserInterface {
      public void startMenu(){
          Scanner scanner = new Scanner(in);
          out.println("Welcome to the PatikaStore!");
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
                  out.println("Please come again and dont forget us :)");
                  break;
              default:
                  out.println("Please enter a valid choice");
                  break;
          }
          out.println();
          out.println();
      }
      public void notebook(){
          out.println();
          out.println();
          out.println("1.Notebook Purchase");
          out.println("2.List of Notebook by marks");
          out.println("3.Return the main menu");
          Scanner scanner = new Scanner(in);
          int select = scanner.nextInt();
          switch (select){
              case 1:
                  purchase(0);
                  break;
              case 2:
                  getAllNotebooks();
                  startMenu();
                  break;
              case 3:
                  startMenu();
          }
          out.println();
      }


    public void cellPhone(){
        out.println();out.println();
          out.println("1.CellPhone Purchase");
          out.println("2.List of CellPhone by marks");
          out.println("3.Return the main menu");
          Scanner scanner = new Scanner(in);
          int select = scanner.nextInt();
          switch (select){
              case 1:
                  purchase(1);
                  break;
              case 2:
                  getAllCellPhones();
                  startMenu();
                  break;
              case 3:
                  startMenu();
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
          out.println();
      }
      public void purchase(int a){
          out.println();
          out.println();
          Scanner scanner = new Scanner(in);
          out.println("Please send the id and the brand of which you want to purchase");
          String id =  scanner.next();
          String brand = scanner.next();
          if (a == 0){
              Laptop.purchaseNotebook(id, brand);
          }else {
              CellPhone.purchasePhone(id,brand);
          }
          startMenu();

      }


}
