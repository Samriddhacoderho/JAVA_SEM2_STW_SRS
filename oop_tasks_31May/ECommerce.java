package oop_tasks_31May;

public class ECommerce {
    private String name;
    private int ID;
    private double price;
    private int stockQuantity=20;

    public ECommerce(String name, int ID, double price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0)
        {
                    this.price = price;
        }
        else
        {
            System.out.println("Price cannot be negative or zero");
        }
    }

    public int purchasedStock(int quantity)
    {
        this.stockQuantity=this.stockQuantity-quantity;
        return this.stockQuantity;
    }

    public int reStock(int quantity)
    {
        this.stockQuantity=this.stockQuantity+quantity;
        return this.stockQuantity;
    }

    public static void main(String[] args) {
        ECommerce e1=new ECommerce("Laptop", 1, 200000);
        System.out.println("Now, stock is:"+e1.purchasedStock(10));
        System.out.println("Noew, stock is:"+e1.reStock(3));
    }

}
