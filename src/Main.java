import  task.Product;
class Main {

 public static  void main(String[] args)
    {
        Product[] items = new Product[5];
        items[0]=new Product("Laptop",	"Electronics",	5,	999.99);
        items[1]=new Product("Office Chair",	"Furniture",	12,249.99);
        items[2]=new Product("Wireless Mouse",	"Electronics",	30,	45.00);
        items[3]=new Product("Standing Desk"	,"Furniture",	8,	599.99);
        items[4]=new Product("HDMI Cable"	,"Accessories",	50	,12.99);

        for(Product item : items)
        {
            item.describe();
        }

        double totalValue= 0.0;
        String highestProductName ="";
        for(Product item : items) {
            if (totalValue <= item.getTotalValue())
            {
                totalValue = item.getTotalValue();
                highestProductName = item.getName();
            }
        }
        System.out.println("\nProduct with the highest total value "+ highestProductName + " with a value of "+totalValue);

    }


}
