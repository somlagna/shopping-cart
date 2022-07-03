import java.util.ArrayList;
import java.util.List;

public class ProductUtility {
    public static List<Product> prodlist=new ArrayList<>();
    static{
        prodlist.add(new Product("P001", "S11 Ultra", "Mobile", 2000, 20));
        prodlist.add(new Product("P002", "IPhone", "Mobile", 2100, 25));
        prodlist.add(new Product("P003", "Google home", "Gadgets", 800, 10));
        prodlist.add(new Product("P004", "Charger", "Mobile", 70, 30));


    }
    public static String getProdName(String prodid){
        String prodname="";
        for(Product p:prodlist){
            if(p.getProdid().equals(prodid)){
                prodname=p.getProdname();
                break;
            }
        }
        return prodname;
    }
    public static int getProdPrice(String prodid){
        int price=0;
        for(Product p:prodlist){
            if(p.getProdid().equals(prodid)){
                price=p.getPrice();
                break;
            }
        }
        return price;
    }
    public static Product findProduct(String prodid){
        Product temp=null;
        for(Product p:prodlist){
            if(p.getProdid().equals(prodid)){
                temp=p;
                break;
            }
        }
        return temp;
    }
}
