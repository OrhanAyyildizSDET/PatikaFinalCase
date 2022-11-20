package PatikaStore;
/*Ürünün sistemde kayıtlı benzersiz numarası
Birim fiyatı
İndirim oranı
Stok miktarı
Ürün adı
Marka bilgisi
(Sistemde ekli olan markalar kullanılacaktır)
Telefonun hafıza bilgisi (128 GB, 64 GB)
Ekran Boyutu (6.1 Inc)
Pil Gücü (4000)
RAM (6 MB)
Renk (Siyah,Kırmızı,Mavi)*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeaturePojo {
    private List<Map<Object,Object>> listOfGoods = new ArrayList<>();
    private Map<Object,Object> mapOfGoods = new HashMap<>();

    private int id;
    private int unitPrice;
    private double discountAmount;
    private int stockAmount;
    private String name;
    private String brand;
    private int memoryAmount;
    private double screenSize;
    private int batterySize;
    private int RAM;
    private String colour;

    public FeaturePojo(){}

    public FeaturePojo(int id, int unitPrice, double discountAmount, double screenSize, int batterySize,
                int stockAmount, String name, String brand, int memoryAmount, int RAM, String colour){

        this.id = id;
        this.unitPrice = unitPrice;
        this.discountAmount = discountAmount;
        this.screenSize = screenSize;
        this.batterySize = batterySize;
        this.stockAmount = stockAmount;
        this.name = name;
        this.brand = brand;
        this.memoryAmount = memoryAmount;
        this.RAM = RAM;
        this.colour = colour;
        mapOfGoods.put("id",this.id);
        mapOfGoods.put("unitPrice",this.unitPrice);
        mapOfGoods.put("discountAmount",this.discountAmount);
        mapOfGoods.put("screenSize",this.screenSize);
        mapOfGoods.put("batterySize",this.batterySize);
        mapOfGoods.put("stockAmount",this.stockAmount);
        mapOfGoods.put("name",this.name);
        mapOfGoods.put("brand",this.brand);
        mapOfGoods.put("memoryAmount",this.memoryAmount);
        mapOfGoods.put("RAM",this.RAM);
        mapOfGoods.put("colour",this.colour);

        listOfGoods.add(mapOfGoods);

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        this.mapOfGoods.put("id",id);
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
        this.mapOfGoods.put("discountAmount",discountAmount);
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
        this.mapOfGoods.put("stockAmount",stockAmount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.mapOfGoods.put("name",name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        this.mapOfGoods.put("brand",brand);
    }

    public int getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(int memoryAmount) {
        this.memoryAmount = memoryAmount;
        this.mapOfGoods.put("memoryAmount",memoryAmount);
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        this.mapOfGoods.put("screenSize",screenSize);
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
        this.mapOfGoods.put("batterySize",batterySize);
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
        this.mapOfGoods.put("ram",this.RAM);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
        this.mapOfGoods.put("colour",this.colour);
    }

    public Map<Object, Object> getListOfGoods() {
        return mapOfGoods;
    }

    public void setListOfGoods(Map<Object, Object> listOfGoods) {
        this.mapOfGoods = listOfGoods;
    }

    public Map<Object, Object> getMapOfGoods() {
        return mapOfGoods;
    }

    public void setMapOfGoods(Map<Object, Object> mapOfGoods) {
        this.mapOfGoods = mapOfGoods;
    }


    @Override
    public String toString() {
        return "Feature of "+brand+"\n"+
                "listOfGoods = " + listOfGoods + '\n'+
                "mapOfGoods = " + mapOfGoods + '\n' +
                " id = " + id +"\n"+
                " unitPrice = " + unitPrice +"\n"+
                " discountAmount = " + discountAmount +"\n"+
                " stockAmount = " + stockAmount +"\n"+
                " name = '" + name + '\'' +"\n"+
                " brand = '" + brand + '\'' +"\n"+
                " memoryAmount = " + memoryAmount +"\n"+
                " screenSize = " + screenSize +"\n"+
                " batterySize = " + batterySize +"\n"+
                " RAM = " + RAM +"\n"+
                " colour = " + colour + '\'';

    }
}
