//import com.sun.org.apache.xpath.internal.operations.String;

class Admin extends Employee {
  //---- Attributes
  //---- / Attributes
  

  //---- Constructor
  Admin(int ID, String fullName, Date_ex birth_date, Date_ex join_date, double salary, String login_userName, String login_password) {
    super(ID, fullName, birth_date, join_date, salary, login_userName, login_password);
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
      Main.sysout("¡Producto creado exitosamente!");
    
    return new Product(name, type, description, price, stock);
  }
  
  // METODO PARA ELIMINAR UN PRODUCTO
  public void deleteProduct(Product product) {
    product = null;
  }
  
  // METODO PARA CAMBIAR EL PRECIO UN PRODUCTO
  public void changePrice(Product product) {
    product.price = Main.askUserDouble("Ingresa el nuevo precio del plato '"+product.name+"':");
    Main.sysout("¡Cambio de precio exitoso!");
  }

  // METODO PARA CAMBIAR EL STOCK UN PRODUCTO
  public void changeStock(Product product) {
    product.stock = Main.askUserInt("\nIngresa la disponibilidad del plato '"+product.name+"': ");
    Main.sysout("¡Cambio de stock exitoso!");
    }

  // METODO PARA CAMBIAR EL STOCK UN PRODUCTO
  public void changeDesc(Product product) {
    product.description = Main.askUserStr("\nIngresa la nueva descripcion del plato '"+product.name+"': ");
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
    String
      login_userName = Main.askUserStr("Ingrese el user name del empleado a crear"),
      login_password = Main.askUserStr("Ingrese el password del empleado a crear");
      
    Waiter waiter1 = new Waiter(ID, new_name, fecha_cumple, fecha_ingreso, salary, 0.0, login_userName, login_password);
    Main.sysout("¡Waiter creado exitosamente!");

    return waiter1;
    }

  // METODO PARA MODIFICAR NOMBRE DE EMPLEADO
  public void changeNameWaiter(Waiter waiter) {
    waiter.fullName = Main.askUserStr("\nIngresa el nuevo nombre de "+waiter.fullName+": ");
    Main.sysout("¡Cambio de nombre exitoso!");
  }

  // METODO PARA MODIFICAR EL SALARIO DE UN EMPLEADO
  public void changeSalaryWaiter(Waiter waiter) {
    waiter.salary = Main.askUserDouble("\nIngresa el nuevo salario de "+ waiter.fullName +" ("+waiter.salary+"): ");
    Main.sysout("¡Cambio de salario exitoso!");
  }
  
  
  // METODO PARA ELIMINAR UN EMPLEADO
  public void deleteWaiter(Waiter waiter) {
    waiter = null;
    Main.sysout("¡Empleado eliminado exitosamente!");
  }

  
  
  //---- / Other methods
}