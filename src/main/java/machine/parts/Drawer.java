package machine.parts;

import products.Product;

import java.util.ArrayList;

public class Drawer {

    private DrawerCodes code;
    private Double price;
    private ArrayList<Product> products;


    public Drawer(DrawerCodes code, Double price) {
        this.code = code;
        this.price = price;
        this.products = new ArrayList<Product>();
    }

    public DrawerCodes getCode() {
        return code;
    }

    public Double getPrice() {
        return price;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public Product removeProduct(){
        return this.products.remove(0);
    }
}
