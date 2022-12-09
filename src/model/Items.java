package model;

public class Items {
    int code;
    String name;
    int price;
    String size;
    String brand;

    public Items(int code, String name, int price, String size, String brand) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.size = size;
        this.brand = brand;
    }

    public int getcode() {
        return code;
    }

    public void setcode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public void display(){
        System.out.println("Item name: "+this.name);
        System.out.println("Code: "+this.code);
        System.out.println("Brand: "+this.brand);
        System.out.println("Price: "+this.price);

    }
}
