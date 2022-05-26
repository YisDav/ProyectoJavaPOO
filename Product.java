import java.util.*;

public class Product {
 
  private int ID;
  public String name, description; 
  private String reference;
  public int type; // bebidas,  postres  y  platos.
  public double price;
  public int stock; // cantidad de producto.
  

  /*
  * @ Constructor Product
  */
  Product(String name, int type, String description, double price, int stock) {
    this.ID = productList2.size();
    this.name = name;
    this.type = type;
    this.description = description;
    this.price = price;
    this.stock = stock;
    this.reference = String.format("00%d0%d", this.ID, this.type);
    productList2.add(this);
  }

  
  /*
  * @ Métodos getter
  */
  public int getID(){
    return this.ID;
  }

  public String getReference(){
    return this.reference;
  }
  
  /*
  * @ Métodos setter
  */

  public int setID(int ID) {
    this.ID = ID;
    return this.ID;
  }

  public String setReference(String reference) {
    this.reference = reference;
    return this.reference;
  }

  
  /*
  * STATIC
  */
  public static ArrayList<Product> productList2 = new ArrayList<Product>();

  public static Product getProductElementByID(int ID) {
    Product producto_actual;
    for(int i = 0 ; i < productList2.size() ; i++) {
      producto_actual = productList2.get(i);
      if(producto_actual.getID() == ID)
        return producto_actual;
    }
    return null;
  }

  public static Product getProductElementByInputID(String message) {
    int productID; Product productElement = null; boolean validID = true;
    
    do {
      productID = Main.askUserInt(message);
      try {
        productElement = getProductElementByID(productID-1);
        String name = productElement.name; // only for test
        validID = true;
      }
      catch(Exception e) {
        validID = false;
        System.out.println("Lo sentimos, el producto con el ID "+productID+" no pudo ser encontrado");
      }

    } while(!validID);

    return productElement;
  }

  public static int getProductsCount(){
    return productList2.size();
  }
}