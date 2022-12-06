package PatikaStore;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Markalar : Samsung, Lenovo, Apple, Casper, Asus,HP , Monster
public class Laptop {
    static  Faker faker = new Faker();
    public static HashMap<Object,Object> ids = new HashMap<Object,Object>();
    static List<HashMap<Object,Object>> samsung = new ArrayList<>();
    static List<HashMap<Object,Object>> lenovo = new ArrayList<>();
    static List<HashMap<Object,Object>> apple = new ArrayList<>();
    static List<HashMap<Object,Object>> casper = new ArrayList<>();
    static List<HashMap<Object,Object>> asus = new ArrayList<>();
    static List<HashMap<Object,Object>> hp = new ArrayList<>();
    static List<HashMap<Object,Object>> monster = new ArrayList<>();

    static {
        initializeItemstoMaps();
    }
//    ı can add with constructor but ı had no time so in future ı will add this
    private static void initializeItemstoMaps(){
        for(var i = 0; i < 7;i++){
            HashMap<Object,Object> notebook = new HashMap< >();
            String name = faker.name().firstName();
            notebook.put("name",name);
            String id = String.format("%06f",Math.random());
            notebook.put("id",id);
            ids.put(name,id);
            notebook.put("discountAmount",(int)(Math.random()*20+5));
            notebook.put("screenSize",String.format("%.1f",Math.random()*10+10));
            notebook.put("unitPrice",(int)(Math.random()*1000+2000)+" $");
            notebook.put("ram",12);
            notebook.put("batterySize",6000+" mh");
            notebook.put("stockAmount",(int)(Math.random()*20));
            notebook.put("colour","black");
            notebook.put("memory",(int)(Math.random()*1+3)+" TeraBytes");
            if (i == 0){
                notebook.put("brand","apple");
                apple.add(notebook);
            }
            else if (i == 1){
                notebook.put("brand","asus");
                asus.add(notebook);
            }
            else if (i == 2){
                notebook.put("brand","casper");
                casper.add(notebook);
            }
            else if (i == 3){
                notebook.put("brand","hp");
                hp.add(notebook);
            }
            else if (i == 4){
                notebook.put("brand","lenovo");
                lenovo.add(notebook);
            }
            else if (i == 5) {
                notebook.put("brand","monster");
                monster.add(notebook);
            }
            else {
                notebook.put("brand","samsung");
                samsung.add(notebook);
            }
        }
    }
    public static void addNotebooktoMaps(HashMap<Object,Object> notebook){
        String brand = notebook.get("brand").toString();
        switch (brand){
            case "samsung":
                samsung.add(notebook);
                break;
            case "lenovo":
                lenovo.add(notebook);
                break;
            case "apple":
                apple.add(notebook);
                break;
            case "casper":
                casper.add(notebook);
                break;
            case "asus":
                asus.add(notebook);
                break;
            case "hp":
                hp.add(notebook);
                break;
            case "monster":
                monster.add(notebook);
                break;
        }

    }
    public static void getAllNotebooks(){
        System.out.format("%11s %14s %23s %14s %16s %16s %16s %12s %16s %16s %16s","ID","NAME","DISCOUNT AMOUNT","BRAND","MEMORY","SCREEN SIZE",
                "UNIT PRICE","RAM","BATTERY SIZE","STOCK AMOUNT","COLOUR");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (HashMap<Object,Object> apple : apple){
            System.out.format("%12s | %12s | %15s | %17s | %14s | %11s | %14s | %13s | %14s | %14s | %15s", apple.get("id"), apple.get("name"), apple.get("discountAmount"),
                    apple.get("brand"), apple.get("memory"), apple.get("screenSize"), apple.get("unitPrice"), apple.get("ram"),apple.get("batterySize"),
                    apple.get("stockAmount"),apple.get("colour"));
            System.out.println();

        }
        for (HashMap<Object,Object> asus : asus){
            System.out.format("%12s | %12s | %15s | %17s | %14s | %11s | %14s | %13s | %14s | %14s | %15s", asus.get("id"), asus.get("name"), asus.get("discountAmount"),
                    asus.get("brand"), asus.get("memory"), asus.get("screenSize"), asus.get("unitPrice"), asus.get("ram"),asus.get("batterySize"),
                    asus.get("stockAmount"),asus.get("colour"));
            System.out.println();

        }
        for (HashMap<Object,Object> casper : casper){
            System.out.format("%12s | %12s | %15s | %17s | %14s | %11s | %14s | %13s | %14s | %14s | %15s", casper.get("id"), casper.get("name"), casper.get("discountAmount"),
                    casper.get("brand"), casper.get("memory"), casper.get("screenSize"), casper.get("unitPrice"), casper.get("ram"),casper.get("batterySize"),
                    casper.get("stockAmount"),casper.get("colour"));
            System.out.println();

        }
        for (HashMap<Object,Object> hp : hp){
            System.out.format("%12s | %12s | %15s | %17s | %14s | %11s | %14s | %13s | %14s | %14s | %15s", hp.get("id"), hp.get("name"), hp.get("discountAmount"),
                    hp.get("brand"), hp.get("memory"), hp.get("screenSize"), hp.get("unitPrice"), hp.get("ram"),hp.get("batterySize"),
                    hp.get("stockAmount"),hp.get("colour"));
            System.out.println();

        }
        for (HashMap<Object,Object> lenovo : lenovo){
            System.out.format("%12s | %12s | %15s | %17s | %14s | %11s | %14s | %13s | %14s | %14s | %15s", lenovo.get("id"), lenovo.get("name"), lenovo.get("discountAmount"),
                    lenovo.get("brand"), lenovo.get("memory"), lenovo.get("screenSize"), lenovo.get("unitPrice"), lenovo.get("ram"),lenovo.get("batterySize"),
                    lenovo.get("stockAmount"),lenovo.get("colour"));
            System.out.println();

        }
        for (HashMap<Object,Object> monster : monster){
            System.out.format("%12s | %12s | %15s | %17s | %14s | %11s | %14s | %13s | %14s | %14s | %15s", monster.get("id"), monster.get("name"), monster.get("discountAmount"),
                    monster.get("brand"), monster.get("memory"), monster.get("screenSize"), monster.get("unitPrice"), monster.get("ram"),monster.get("batterySize"),
                    monster.get("stockAmount"),monster.get("colour"));
            System.out.println();

        }
        for (HashMap<Object,Object> samsung : samsung){
            System.out.format("%12s | %12s | %15s | %17s | %14s | %11s | %14s | %13s | %14s | %14s | %15s", samsung.get("id"), samsung.get("name"), samsung.get("discountAmount"),
                    samsung.get("brand"), samsung.get("memory"), samsung.get("screenSize"), samsung.get("unitPrice"), samsung.get("ram"),samsung.get("batterySize"),
                    samsung.get("stockAmount"),samsung.get("colour"));
            System.out.println();

        }
        System.out.println();
        System.out.println();
    }
    public static void deleteNotebooks(String deleteId, String brand){
        System.out.println(ids);
        if (brand.equals("apple")){
            for (var i = 0; i <apple.size(); i++){
                if (apple.get(i).get("id").equals(deleteId)){
                    apple.remove(i);
                }
            }
        }
        else if (brand.equals("asus"))
            for (var i = 0; i < asus.size(); i++) {
                if (asus.get(i).get("id").equals(deleteId)) {
                    asus.remove(i);
                }
        }
        else if (brand.equals("casper")) {
            for (var i = 0; i <casper.size(); i++){
                if (casper.get(i).get("id").equals(deleteId)){
                    casper.remove(i);
                }
            }
        } else if (brand.equals("lenovo")) {
            for (var i = 0; i < lenovo.size(); i++) {
                if (lenovo.get(i).get("id").equals(deleteId)) {
                    lenovo.remove(i);
                }
            }
        } else if (brand.equals("monster")) {
                for (var i = 0; i < monster.size(); i++) {
                    if (monster.get(i).get("id").equals(deleteId)) {
                        monster.remove(i);


                }
            }
        }else if (brand.equals("samsung")) {
            for (var i = 0; i < samsung.size(); i++) {
                if (samsung.get(i).get("id").equals(deleteId)) {
                    samsung.remove(i);


                }
            }
        }else if (brand.equals("hp")) {
            for (var i = 0; i < hp.size(); i++) {
                if (hp.get(i).get("id").equals(deleteId)) {
                    hp.remove(i);


                }
            }
        }



    }
    public static void getMarkNotebook(String note){
        System.out.format("%11s %12s %20s %12s %16s %16s %16s %12s %16s %16s %16s","ID","NAME","DISCOUNT AMOUNT","BRAND","MEMORY","SCREEN SIZE",
                "UNIT PRICE","RAM","BATTERY SIZE","STOCK AMOUNT","COLOUR");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        if (note.equals("apple")){
            for (HashMap<Object,Object> apple : apple){
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%14s %18s", apple.get("id"), apple.get("name"), apple.get("discountAmount"),
                        apple.get("brand"), apple.get("memory"), apple.get("screenSize"), apple.get("unitPrice"), apple.get("ram"),apple.get("batterySize"),
                        apple.get("stockAmount"),apple.get("colour"));
                System.out.println();

            }
        } else if (note.equals("asus")) {
            for (HashMap<Object,Object> asus : asus){
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%14s %18s", asus.get("id"), asus.get("name"), asus.get("discountAmount"),
                        asus.get("brand"), asus.get("memory"), asus.get("screenSize"), asus.get("unitPrice"), asus.get("ram"),asus.get("batterySize"),
                        asus.get("stockAmount"),asus.get("colour"));
                System.out.println();

            }
        } else if (note.equals("casper")) {
            for (HashMap<Object,Object> casper : casper){
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%14s %18s", casper.get("id"), casper.get("name"), casper.get("discountAmount"),
                        casper.get("brand"), casper.get("memory"), casper.get("screenSize"), casper.get("unitPrice"), casper.get("ram"),casper.get("batterySize"),
                        casper.get("stockAmount"),casper.get("colour"));
                System.out.println();

            }
        } else if (note.equals("hp")) {
            for (HashMap<Object,Object> hp : hp){
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%14s %18s", hp.get("id"), hp.get("name"), hp.get("discountAmount"),
                        hp.get("brand"), hp.get("memory"), hp.get("screenSize"), hp.get("unitPrice"), hp.get("ram"),hp.get("batterySize"),
                        hp.get("stockAmount"),hp.get("colour"));
                System.out.println();

            }
        } else if (note.equals("lenovo")) {
            for (HashMap<Object,Object> lenovo : lenovo){
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%14s %18s", lenovo.get("id"), lenovo.get("name"), lenovo.get("discountAmount"),
                        lenovo.get("brand"), lenovo.get("memory"), lenovo.get("screenSize"), lenovo.get("unitPrice"), lenovo.get("ram"),lenovo.get("batterySize"),
                        lenovo.get("stockAmount"),lenovo.get("colour"));
                System.out.println();

            }
        } else if (note.equals("monster")) {
            for (HashMap<Object,Object> monster : monster){
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%14s %18s", monster.get("id"), monster.get("name"), monster.get("discountAmount"),
                        monster.get("brand"), monster.get("memory"), monster.get("screenSize"), monster.get("unitPrice"), monster.get("ram"),monster.get("batterySize"),
                        monster.get("stockAmount"),monster.get("colour"));
                System.out.println();

            }
        } else if (note.equals("samsung")) {
            for (HashMap<Object,Object> samsung : samsung){
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%14s %18s", samsung.get("id"), samsung.get("name"), samsung.get("discountAmount"),
                        samsung.get("brand"), samsung.get("memory"), samsung.get("screenSize"), samsung.get("unitPrice"), samsung.get("ram"),samsung.get("batterySize"),
                        samsung.get("stockAmount"),samsung.get("colour"));
                System.out.println();

            }
        }
        else {
            System.out.println("You entered invalid select value");
        }
    }
    public static void purchaseNotebook(String id,String brand){
        System.out.println(ids);
        if (brand.equals("apple")){
            for (var i = 0; i <apple.size(); i++){
                if (apple.get(i).get("id").equals(id)){
                    System.out.println(apple.get(i).get("unitPrice"));
                    break;
                }
                else {
                    System.out.println("You entered the wrong or uncompleted id");
                }
            }
        }
        else if (brand.equals("asus"))
            for (var i = 0; i < asus.size(); i++) {
                if (asus.get(i).get("id").equals(id)){
                    System.out.println(asus.get(i).get("unitPrice"));
                    break;
                }
                else {
                    System.out.println("You entered the wrong or uncompleted id");
                }
            }
        else if (brand.equals("casper")) {
            for (var i = 0; i <casper.size(); i++){
                if (casper.get(i).get("id").equals(id)){
                    System.out.println(casper.get(i).get("unitPrice"));
                    break;
                }
                else {
                    System.out.println("You entered the wrong or uncompleted id");
                }
            }
        } else if (brand.equals("lenovo")) {
            for (var i = 0; i < lenovo.size(); i++) {
                if (lenovo.get(i).get("id").equals(id)){
                    System.out.println(lenovo.get(i).get("brand")+" "+apple.get(i).get("unitPrice"));
                    break;
                }
                else {
                    System.out.println("You entered the wrong or uncompleted id");
                }
            }
        } else if (brand.equals("monster")) {
            for (var i = 0; i < monster.size(); i++) {
                if (monster.get(i).get("id").equals(id)){
                    System.out.println(monster.get(i).get("unitPrice"));
                    break;
                }
                else {
                    System.out.println("You entered the wrong or uncompleted id");
                }
            }
        }else if (brand.equals("samsung")) {
            for (var i = 0; i < samsung.size(); i++) {
                if (samsung.get(i).get("id").equals(id)){
                    System.out.println(samsung.get(i).get("unitPrice"));
                    break;
                }
                else {
                    System.out.println("You entered the wrong or uncompleted id");
                }
            }
        }else if (brand.equals("hp")) {
            for (var i = 0; i < hp.size(); i++) {
                if (hp.get(i).get("id").equals(id)){
                    System.out.println(hp.get(i).get("unitPrice"));
                    break;
                }
                else {
                    System.out.println("You entered the wrong or uncompleted id");
                }
            }
        }
    }
}
