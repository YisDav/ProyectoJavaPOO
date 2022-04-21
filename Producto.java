import java.util.*;

public class Producto {
 
  private int ID;
  public String name, description; 
  private String reference;
  public int type; // bebidas,  postres  y  platos.
  public double price;
  public int stock; // cantidad de producto.
  

  /*
  * @ Constructor Producto
  */
  Producto(String name, int type, String description, double price, int stock) {
    this.name = name;
    this.type = type;
    this.description = description;
    this.price = price;
    this.stock = stock;
    setLastID();
    setDefaultReference();
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
  private int setLastID(){
    lastCreatedID += 1;
    this.ID = lastCreatedID;
    return this.ID;
  }

  public String setReference(String reference) {
    this.reference = reference;
    return this.reference;
  }

  public String setDefaultReference() {
    String reference = String.format("00%d0%d", this.ID, this.type);
    return setReference(reference);
  }

  
  /*
  * STATIC
  */

  private static int lastCreatedID = -1;
  private static ArrayList<Producto> productList2 = new ArrayList<Producto>();
  public static int getLastCreatedID() {
    return lastCreatedID;
  }
  public static Producto getProductElementByID(int ID) {
    Producto producto_actual;
    for(int i = 0 ; i <= productList2.size() ; i++) {
      producto_actual = productList2.get(i);
      if(producto_actual.getID() == ID)
        return producto_actual;
    }
    return null;
  }

  public static int getProductsCount(){
    return productList2.size();
  }
}