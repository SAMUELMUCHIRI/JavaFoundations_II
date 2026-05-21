package task;

public class Product {
    //Private attributes:
    private String name ;
    private double price ;
    private int quantity ;
    private String category ;
    private static int totalProductsCreated = 0 ;

    public Product(String name, String category, int quantity , double price) {
        this.name = name ;
        this.price = price ;
        this.quantity = quantity ;
        this.category = category ;
        totalProductsCreated++ ;
    }

    public double getTotalValue() {
        return price * quantity ;
    }
    public static int getProductCount() {
        return totalProductsCreated ;
    }

    public void describe()
    {
        System.out.println("Product: "+ name +"\t|\t Category: "+ category +" \t|\t Qty: "+ quantity + " \t|\t Unit Price: $"+ price +" \t|\t Total Value: $"+ getTotalValue());
    }

    public String product()
    {
        return name;
    }


}
