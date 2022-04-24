import java.util.*;

class Admin extends Employee {
  //---- Attributes
  //---- / Attributes
  

  //---- Constructor
  Admin(int ID, String fullName, Date_ex birth_date, Date_ex join_date, double salary) {
    super(ID, fullName, birth_date, join_date, salary);
  }
  //---- / Constructor

  
  //---- Other methods
  // METODO PARA CREAR UN PRODUCTO
  public Product createProduct()
  {
    Main.sysout("Por favor, ingresa los datos del producto que deseas crear");
    
    String 
      name = Main.askUserStr("Nombre del producto: "),
      description = Main.askUserStr("Descripción: ");    
    
    int 
      type = Main.askUserInt("Tipo de producto:\n1. prod1\n2. prod2\n3. prod3"),
      stock = Main.askUserInt("Stock:");
    
    double 
      price = Main.askUserDouble("Precio:");
    
    return new Product(name, type, description, price, stock);
  }
  
  // METODO PARA ELIMINAR UN PRODUCTO
  public void deleteProduct(int productID) {
    Product productToDelete = Product.getProductElementByID(productID);
    productToDelete = null;
  }
  
  // METODO PARA CAMBIAR EL PRECIO UN PRODUCTO
  public void changePrice(int productID) {
    Product productChange = Product.getProductElementByID(productID);
    productChange.price = Main.askUserDouble("Ingresa el nuevo precio del plato "+productChange.name+":");
  }

  // METODO PARA CAMBIAR EL STOCK UN PRODUCTO
  public void changeStock(int productID) {
    Product productChange = Product.getProductElementByID(productID);
    productChange.stock = Main.askUserInt("\nIngresa la disponibilidad del plato "+productChange.name+": ");
    }

  // METODO PARA CAMBIAR EL STOCK UN PRODUCTO
  public void changeDesc(int productID) {
    Product productChange = Product.getProductElementByID(productID);
    productChange.description = Main.askUserStr("\nIngresa la nueva descripcion del plato "+productChange.name+": ");
    }
  
  //---- / Other methods
}