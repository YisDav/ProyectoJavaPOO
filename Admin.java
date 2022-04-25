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
    Main.sysout("\nPor favor, ingresa los datos del producto que deseas crear");
    
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
    Scanner readerDouble = new Scanner(System.in);
    Product productChange = Product.getProductElementByID(productID);
    productChange.price = Main.askUserDouble("Ingresa el nuevo precio del plato '"+productChange.name+"':");
    Main.sysout("¡Cambio de precio exitoso!");
  }

  // METODO PARA CAMBIAR EL STOCK UN PRODUCTO
  public void changeStock(int productID) {
    Product productChange = Product.getProductElementByID(productID);
    productChange.stock = Main.askUserInt("\nIngresa la disponibilidad del plato '"+productChange.name+"': ");
    Main.sysout("¡Cambio de stock exitoso!");
    }

  // METODO PARA CAMBIAR EL STOCK UN PRODUCTO
  public void changeDesc(int productID) {
    Product productChange = Product.getProductElementByID(productID);
    productChange.description = Main.askUserStr("\nIngresa la nueva descripcion del plato '"+productChange.name+"': ");
    Main.sysout("¡Cambio de descripcion exitosa!");
    }

  // METODO PARA CREAR UN EMPREADO
  public Waiter createWaiter() {
    String
      new_name = Main.askUserStr("Ingrese el nombre completo del nuevo empleado: ");
    int 
      ID = Main.askUserInt("Ingrese el ID del nuevo empleado: ");
    Date_ex
      fecha_cumple = Date_ex.askUserDate_ex("Ingrese la fecha de nacimiento: "),
      fecha_ingreso = Date_ex.askUserDate_ex("Ingrese la fecha de ingreso: ");
    double 
      salary = Main.askUserDouble("Ingrese el salario del nuevo empleado");
    
    Waiter waiter1 = new Waiter(ID, new_name, fecha_cumple, fecha_ingreso, salary, 0.0);
    Main.sysout("¡Waiter creado exitosamente!");

    return waiter1;
    }

  // METODO PARA ELIMINAR UN EMPLEADO
  public void deleteWaiter(int waiterID) {
    Waiter WaiterToDelete = Waiter.getWaiterByID(waiterID);
    WaiterToDelete = null;
    Main.sysout("¡Empleado eliminado exitosamente!");
  }

  
  
  //---- / Other methods
}