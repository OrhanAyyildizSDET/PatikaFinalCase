package PatikaStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Markalar : Samsung, Lenovo, Apple, Casper, Asus,HP , Monster
public class Laptop {
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
        HashMap<Object,Object> appleNotebook = new HashMap<Object,Object>();
        String name = "helloworld";
        appleNotebook.put("name",name);
        String id = String.format("%06f",Math.random());
        appleNotebook.put("id",id);
        ids.put(name,id);
        appleNotebook.put("discountAmount",1.5);
        appleNotebook.put("screenSize",6.1);
        appleNotebook.put("unitPrice",12);
        appleNotebook.put("ram",12);
        appleNotebook.put("batterySize",6999);
        appleNotebook.put("stockAmount",24);
        appleNotebook.put("colour","black");
        appleNotebook.put("memory",2800);
        appleNotebook.put("brand","apple");

        apple.add(appleNotebook);


        HashMap<Object,Object> asusNotebook = new HashMap<Object,Object>();
        String name01 = "kamikaze";
        asusNotebook.put("name",name);
        String id01 = String.format("%06f",Math.random());
        asusNotebook.put("id",id01);
        ids.put(name01,id01);
        asusNotebook.put("discountAmount",1.5);
        asusNotebook.put("screenSize",6.1);
        asusNotebook.put("unitPrice",12);
        asusNotebook.put("ram",12);
        asusNotebook.put("batterySize",6999);
        asusNotebook.put("stockAmount",24);
        asusNotebook.put("colour","black");
        asusNotebook.put("memory",2800);
        asusNotebook.put("brand","asus");
        asus.add(asusNotebook);

        HashMap<Object,Object> casperNotebook = new HashMap<Object,Object>();
        String name02 = "helloworld";
        casperNotebook.put("name",name);
        String id02 = String.format("%06f",Math.random());
        casperNotebook.put("id",id);
        ids.put(name02,id02);
        casperNotebook.put("discountAmount",1.5);
        casperNotebook.put("screenSize",6.1);
        casperNotebook.put("unitPrice",12);
        casperNotebook.put("ram",12);
        casperNotebook.put("batterySize",6999);
        casperNotebook.put("stockAmount",24);
        casperNotebook.put("colour","black");
        casperNotebook.put("memory",2800);
        casperNotebook.put("brand","casper");
        casper.add(casperNotebook);

        Map<Object,Object> hpNotebook = new HashMap<Object,Object>();
        Map<Object,Object> lenovoNotebook = new HashMap<Object,Object>();
        Map<Object,Object> monsterNotebook = new HashMap<Object,Object>();
        Map<Object,Object> samsungNotebook = new HashMap<Object,Object>();

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
        System.out.format("%11s %12s %20s %12s %16s %16s %16s %12s %16s %16s %16s","ID","NAME","DISCOUNT AMOUNT","BRAND","MEMORY","SCREEN SIZE",
                "UNIT PRICE","RAM","BATTERY SIZE","STOCK AMOUNT","COLOUR");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (HashMap<Object,Object> apple : apple){
            System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", apple.get("id"), apple.get("name"), apple.get("discountAmount"),
                    apple.get("brand"), apple.get("memory"), apple.get("screenSize"), apple.get("unitPrice"), apple.get("ram"),apple.get("batterySize"),
                    apple.get("stockAmount"),apple.get("colour"));
            System.out.println();

        }
        for (HashMap<Object,Object> asus : asus){
            System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", asus.get("id"), asus.get("name"), asus.get("discountAmount"),
                    asus.get("brand"), asus.get("memory"), asus.get("screenSize"), asus.get("unitPrice"), asus.get("ram"),asus.get("batterySize"),
                    asus.get("stockAmount"),asus.get("colour"));
            System.out.println();

        }
        for (HashMap<Object,Object> casper : casper){
            System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", casper.get("id"), casper.get("name"), casper.get("discountAmount"),
                    casper.get("brand"), casper.get("memory"), casper.get("screenSize"), casper.get("unitPrice"), casper.get("ram"),casper.get("batterySize"),
                    casper.get("stockAmount"),casper.get("colour"));
            System.out.println();

        }
        for (HashMap<Object,Object> hp : hp){
            System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", hp.get("id"), hp.get("name"), hp.get("discountAmount"),
                    hp.get("brand"), hp.get("memory"), hp.get("screenSize"), hp.get("unitPrice"), hp.get("ram"),hp.get("batterySize"),
                    hp.get("stockAmount"),hp.get("colour"));
            System.out.println();

        }
        for (HashMap<Object,Object> lenovo : lenovo){
            System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", lenovo.get("id"), lenovo.get("name"), lenovo.get("discountAmount"),
                    lenovo.get("brand"), lenovo.get("memory"), lenovo.get("screenSize"), lenovo.get("unitPrice"), lenovo.get("ram"),lenovo.get("batterySize"),
                    lenovo.get("stockAmount"),lenovo.get("colour"));
            System.out.println();

        }
        for (HashMap<Object,Object> monster : monster){
            System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", monster.get("id"), monster.get("name"), monster.get("discountAmount"),
                    monster.get("brand"), monster.get("memory"), monster.get("screenSize"), monster.get("unitPrice"), monster.get("ram"),monster.get("batterySize"),
                    monster.get("stockAmount"),monster.get("colour"));
            System.out.println();

        }
        for (HashMap<Object,Object> samsung : samsung){
            System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", samsung.get("id"), samsung.get("name"), samsung.get("discountAmount"),
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
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", apple.get("id"), apple.get("name"), apple.get("discountAmount"),
                        apple.get("brand"), apple.get("memory"), apple.get("screenSize"), apple.get("unitPrice"), apple.get("ram"),apple.get("batterySize"),
                        apple.get("stockAmount"),apple.get("colour"));
                System.out.println();

            }
        } else if (note.equals("asus")) {
            for (HashMap<Object,Object> asus : asus){
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", asus.get("id"), asus.get("name"), asus.get("discountAmount"),
                        asus.get("brand"), asus.get("memory"), asus.get("screenSize"), asus.get("unitPrice"), asus.get("ram"),asus.get("batterySize"),
                        asus.get("stockAmount"),asus.get("colour"));
                System.out.println();

            }
        } else if (note.equals("casper")) {
            for (HashMap<Object,Object> casper : casper){
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", casper.get("id"), casper.get("name"), casper.get("discountAmount"),
                        casper.get("brand"), casper.get("memory"), casper.get("screenSize"), casper.get("unitPrice"), casper.get("ram"),casper.get("batterySize"),
                        casper.get("stockAmount"),casper.get("colour"));
                System.out.println();

            }
        } else if (note.equals("hp")) {
            for (HashMap<Object,Object> hp : hp){
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", hp.get("id"), hp.get("name"), hp.get("discountAmount"),
                        hp.get("brand"), hp.get("memory"), hp.get("screenSize"), hp.get("unitPrice"), hp.get("ram"),hp.get("batterySize"),
                        hp.get("stockAmount"),hp.get("colour"));
                System.out.println();

            }
        } else if (note.equals("lenovo")) {
            for (HashMap<Object,Object> lenovo : lenovo){
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", lenovo.get("id"), lenovo.get("name"), lenovo.get("discountAmount"),
                        lenovo.get("brand"), lenovo.get("memory"), lenovo.get("screenSize"), lenovo.get("unitPrice"), lenovo.get("ram"),lenovo.get("batterySize"),
                        lenovo.get("stockAmount"),lenovo.get("colour"));
                System.out.println();

            }
        } else if (note.equals("monster")) {
            for (HashMap<Object,Object> monster : monster){
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", monster.get("id"), monster.get("name"), monster.get("discountAmount"),
                        monster.get("brand"), monster.get("memory"), monster.get("screenSize"), monster.get("unitPrice"), monster.get("ram"),monster.get("batterySize"),
                        monster.get("stockAmount"),monster.get("colour"));
                System.out.println();

            }
        } else if (note.equals("samsung")) {
            for (HashMap<Object,Object> samsung : samsung){
                System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %18s", samsung.get("id"), samsung.get("name"), samsung.get("discountAmount"),
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
            }
        }
        else if (brand.equals("asus"))
            for (var i = 0; i < asus.size(); i++) {
                if (asus.get(i).get("id").equals(id)){
                    System.out.println(asus.get(i).get("unitPrice"));
                    break;
                }
            }
        else if (brand.equals("casper")) {
            for (var i = 0; i <casper.size(); i++){
                if (casper.get(i).get("id").equals(id)){
                    System.out.println(casper.get(i).get("unitPrice"));
                    break;
                }
            }
        } else if (brand.equals("lenovo")) {
            for (var i = 0; i < lenovo.size(); i++) {
                if (lenovo.get(i).get("id").equals(id)){
                    System.out.println(lenovo.get(i).get("brand")+" "+apple.get(i).get("unitPrice"));
                    break;
                }
            }
        } else if (brand.equals("monster")) {
            for (var i = 0; i < monster.size(); i++) {
                if (monster.get(i).get("id").equals(id)){
                    System.out.println(monster.get(i).get("unitPrice"));
                    break;
                }
            }
        }else if (brand.equals("samsung")) {
            for (var i = 0; i < samsung.size(); i++) {
                if (samsung.get(i).get("id").equals(id)){
                    System.out.println(samsung.get(i).get("unitPrice"));
                    break;
                }
            }
        }else if (brand.equals("hp")) {
            for (var i = 0; i < hp.size(); i++) {
                if (hp.get(i).get("id").equals(id)){
                    System.out.println(hp.get(i).get("unitPrice"));
                    break;
                }
            }
        }

    }
}
