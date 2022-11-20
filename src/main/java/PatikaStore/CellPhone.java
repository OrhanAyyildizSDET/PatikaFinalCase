package PatikaStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static PatikaStore.Laptop.*;


//Markalar :  Apple, Huawei, Casper, Xiaomi
public class CellPhone {
    static List<HashMap<Object,Object>> apple = new ArrayList<>();
    static List<HashMap<Object,Object>> huawei = new ArrayList<>();
    static List<HashMap<Object,Object>> casper = new ArrayList<>();
    static List<HashMap<Object,Object>> xiaomi = new ArrayList<>();
    static {

        initializeItemstoMaps();
    }
    private static void initializeItemstoMaps(){
        HashMap<Object,Object> applePhone = new HashMap<Object,Object>();
        String name = "helloworld";
        applePhone.put("name",name);
        String id = String.format("%06f",Math.random());
        applePhone.put("id",id);
        ids.put(name,id);
        applePhone.put("discountAmount",1.5);
        applePhone.put("screenSize",6.1);
        applePhone.put("unitPrice",12);
        applePhone.put("ram",12);
        applePhone.put("batterySize",6999);
        applePhone.put("stockAmount",24);
        applePhone.put("colour","black");
        applePhone.put("memory",2800);
        applePhone.put("brand","apple");

        apple.add(applePhone);


        HashMap<Object,Object> huaweiPhone = new HashMap<Object,Object>();
        String name01 = "kamikaze";
        huaweiPhone.put("name",name);
        String id01 = String.format("%06f",Math.random());
        huaweiPhone.put("id",id01);
        ids.put(name01,id01);
        huaweiPhone.put("discountAmount",1.5);
        huaweiPhone.put("screenSize",6.1);
        huaweiPhone.put("unitPrice",12);
        huaweiPhone.put("ram",12);
        huaweiPhone.put("batterySize",6999);
        huaweiPhone.put("stockAmount",24);
        huaweiPhone.put("colour","black");
        huaweiPhone.put("memory",2800);
        huaweiPhone.put("brand","huawei");
        huawei.add(huaweiPhone);

        HashMap<Object,Object> casperPhone = new HashMap<Object,Object>();
        String name02 = "helloworld";
        casperPhone.put("name",name);
        String id02 = String.format("%06f",Math.random());
        casperPhone.put("id",id);
        ids.put(name02,id02);
        casperPhone.put("discountAmount",1.5);
        casperPhone.put("screenSize",6.1);
        casperPhone.put("unitPrice",12);
        casperPhone.put("ram",12);
        casperPhone.put("batterySize",6999);
        casperPhone.put("stockAmount",24);
        casperPhone.put("colour","black");
        casperPhone.put("memory",2800);
        casperPhone.put("brand","casper");
        casper.add(casperPhone);

        Map<Object,Object> hpNotebook = new HashMap<Object,Object>();
        Map<Object,Object> lenovoNotebook = new HashMap<Object,Object>();
        Map<Object,Object> monsterNotebook = new HashMap<Object,Object>();
        Map<Object,Object> samsungNotebook = new HashMap<Object,Object>();
    }
    public static void addCellPhonetoMaps(HashMap<Object,Object> cellPhone){
        String brand = cellPhone.get("brand").toString();
        switch (brand){
            case "apple":
                apple.add(cellPhone);
                break;
            case "lenovo":
                casper.add(cellPhone);
                break;
            case "huawei":
                huawei.add(cellPhone);
                break;
            case "xiaomi":
                xiaomi.add(cellPhone);
                break;
        }

    }
    public static void getAllCellPhones(){
        System.out.format("%15s %15s %20s %12s %16s %16s %16s %14s %16s %16s %16s","ID","NAME","DISCOUNT AMOUNT","BRAND","MEMORY","SCREEN SIZE",
                "UNIT PRICE","RAM","BATTERY SIZE","STOCK AMOUNT","COLOUR");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (HashMap<Object,Object> apple : apple){
            System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %21s", apple.get("id"), apple.get("name"), apple.get("discountAmount"),
                    apple.get("brand"), apple.get("memory"), apple.get("screenSize"), apple.get("unitPrice"), apple.get("ram"),apple.get("batterySize"),
                    apple.get("stockAmount"),apple.get("colour"));
            System.out.println();

        }
        for (HashMap<Object,Object> casper : casper){
            System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %21s", casper.get("id"), casper.get("name"), casper.get("discountAmount"),
                    casper.get("brand"), casper.get("memory"), casper.get("screenSize"), casper.get("unitPrice"), casper.get("ram"),casper.get("batterySize"),
                    casper.get("stockAmount"),casper.get("colour"));
            System.out.println();
        }
        for (HashMap<Object,Object> huawei : huawei){
            System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %21s", huawei.get("id"), huawei.get("name"), huawei.get("discountAmount"),
                    huawei.get("brand"), huawei.get("memory"), huawei.get("screenSize"), huawei.get("unitPrice"), huawei.get("ram"),huawei.get("batterySize"),
                    huawei.get("stockAmount"),huawei.get("colour"));
            System.out.println();
        }
        for (HashMap<Object,Object> xiaomi : xiaomi){
            System.out.format("%12s %12s %15s %17s %14s %15s %13s %16s %15s s%16s %21s", xiaomi.get("id"), xiaomi.get("name"), xiaomi.get("discountAmount"),
                    xiaomi.get("brand"), xiaomi.get("memory"), xiaomi.get("screenSize"), xiaomi.get("unitPrice"), xiaomi.get("ram"),xiaomi.get("batterySize"),
                    xiaomi.get("stockAmount"),xiaomi.get("colour"));
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    public static void purchasePhone(String id,String brand){}
}
