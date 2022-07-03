import java.util.Scanner;

public class App {
    public static Scanner sc=new Scanner(System.in);               
    public static String prodid="";
    public static Integer qty=0;
    public static Customer customer=null;
    public static void main(String[] args) throws Exception {
        
        int choice=0;
        
        do{
            System.out.println("1.Add Product to cart");
            System.out.println("2.View Cart Items");
            System.out.println("3.Delete cart");
            System.out.println("4.exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice){
            case 1:
            if(customer==null){
            readCustomerDetails();}
            showProducts();
            readProductDetails();
            createCartObjectAndAddToCartList();
            break;
            case 2:
            viewCartItems();
            break;
            case 3:
            deleteCart();
            break;
            default:
            System.out.println("Thank you");
            }

        }while(choice<4);
    }
    private static void createCartObjectAndAddToCartList() {
        Cart cart=new Cart(customer.getCustId(),prodid,ProductUtility.getProdPrice(prodid),qty);
        CartUtility.addProductToCart(cart);
    }
    private static void readProductDetails() {
       System.out.println("Enter product id");
       prodid=sc.next();
       System.out.println("Enter quantity");
       qty=sc.nextInt();

    }
    private static void readCustomerDetails() {
        Scanner sc=new Scanner(System.in);
        Customer customer =new Customer();
        String custId="";
        String custname="";
        String city="";
        System.out.println("Enter cust id");
        custId=sc.next();
        System.out.println("Enter cust name");
        custname=sc.next();
        System.out.println("Enter cust city");
        city=sc.next();


    }
    private static void deleteCart() {
        Cart temp=null;
        for(Cart c:CartUtility.cartList){
            if(c.getCustid().equals(customer.getCustId())){
                temp=c;
                break;
            }
        }
        CartUtility.cartList.remove(temp);
        System.out.println("Cart removed");
    }
    private static void viewCartItems() {
        for(Cart c:CartUtility.cartList){
            int price=ProductUtility.getProdPrice(c.getProdid());
            String prodname=ProductUtility.getProdName(c.getProdid());
            System.out.println(prodname+"-"+c.getPrice()+"-"+c.getQty()+(c.getQty()*price));

        }
        System.out.println();
    }
    private static String addProductToCart() {
        return null;
    }
    public static void showProducts(){
        
            System.out.printf("%-8s%-15s%-8s%-12s%-8s","PROD-ID","PROD-NAME","CATEGORY","PRICE","QOH");
            System.out.println();
            for(Product p:ProductUtility.prodlist){
                System.out.printf("%-8s%-15s%-8s%-12s%-8s",p.getProdid(),p.getProdname(),p.getCategory(),p.getPrice(),p.getQoh());
            System.out.println();

        }
    }
}
