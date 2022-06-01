package src;
import java.util.*;

public class Product implements Listable {
 
  private int ID;
  public String name, description; 
  private String reference;
  public int type; // bebidas,  postres  y  platos.
  public double price;
  public int stock; // cantidad de producto.
  private int active = -1; // 0 : false ; 1 : true ; Others (-1) : undefined 
  

  /*
  * @ Constructor Product
  */
  Product(String name, int type, String description, double price, int stock) {
    this.ID = list.size();
    this.name = name;
    this.type = type;
    this.description = description;
    this.price = price;
    this.stock = stock;
    this.reference = String.format("00%d0%d", this.ID, this.type);
    this.addToList();
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
  public static ArrayList<Product> list = new ArrayList<Product>();

  public static ArrayList<Product> getList() {
    ArrayList<Product> fixed_list = new ArrayList<>();
    for(Product product : list) {
      if(product.active == 1) fixed_list.add(product);
    }
    return fixed_list;
  }

  public static ArrayList<Product> getList(int productType) {
    ArrayList<Product> fixed_list = new ArrayList<>();
    for(Product product : getList()) {
      if(product.type == productType){
        fixed_list.add(product);
      }
    }
    return fixed_list;
  }

  @Override
  public void addToList() {
    if(this.active == 0 || this.active == 1) {
      for(Product product : list) {
        if(product.equals(this)) {
          if(product.active == 1) {
            String message = String.format("Cannot add to a list because %s (ID_ex: %d) is alredy added as the same class (or eliminated). Class registrated: %s - Re-trying class: %s", this.name, this.ID, product.getClass().getName(), this.getClass().getName());
            throw new RuntimeException(message);
          }
          else if(product.active == 0) {
            throw new RuntimeException("You first have to revert the soft delete.");
          }
        }
      }
    }
    else {
      this.active = 1;
      list.add(this);
    }
  }

  @Override
  public Product softDelete() {
    this.active = 0;
    return this;
  }

  @Override
  public Product revertSoftDelete() {
    this.active = 1;
    return this;
  }

  public static Product getProductElementByID(int ID) {
    for(Product product : getList()) {
      if( product.getID() == ID )
        return product;
    }
    String message = String.format("No product with ID: %d was found", ID);
    throw new RuntimeException(message);
  }

  public static Product getProductElementByInputID(String message, int productID) {
    Product productElement = null; boolean validID = true;
    do {
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

  public static Object [][] to2DObjectProductList (int productType) {
    Object [][] obj = new Object [getList(productType).size()][4];
    for(int i = 0; i < getList(productType).size(); i++) {
      Product product = getList(productType).get(i);
      obj[i] = new Object [] {product.name, product.description, product.price, product.stock};
    }
    return obj;
  }
}