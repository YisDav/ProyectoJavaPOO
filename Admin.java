import java.util.ArrayList;

class Admin extends Employee {
  //---- Attributes
  //---- / Attributes
  

  //---- Constructor
  Admin(int ID, String fullName, Date_ex birth_date, Date_ex join_date, double salary, String login_userName, String login_password) {
    super(ID, fullName, birth_date, join_date, salary, login_userName, login_password);
  }
  //---- / Constructor

  // ---- Getters
  public static ArrayList<Admin> getList() {
    ArrayList<Admin> fixedList = new ArrayList<>();
    for (Person cPerson : Person.getList()) {
      if(cPerson instanceof Admin) {
        Admin cAdmin = (Admin) cPerson;
        fixedList.add(cAdmin);
      }
    }
    return fixedList;
  }
  // ---- / Getters

  //---- Other methods
  // METODO PARA CREAR UN PRODUCTO
  public Product createProduct()
  {
    System.out.println("\nPor favor, ingresa los datos del producto que deseas crear");
    
    String 
      name = Main.askUserStr("Nombre del producto: "),
      description = Main.askUserStr("Descripción: ");    
    
    int 
      type = Main.askUserInt("Tipo de producto:\n1. Bebidas\n2. Postres\n3. Platos"),
      stock = Main.askUserInt("Stock:"),
      fixed_type = type-1;
    
    double 
      price = Main.askUserDouble("Precio:");

    Product createdProduct = new Product(name, fixed_type, description, price, stock);  
    System.out.println("¡Producto '"+createdProduct.name+"' ($"+createdProduct.price+") creado exitosamente!");    
    return createdProduct;
  }
  
  // METODO PARA ELIMINAR UN PRODUCTO
  public void deleteProduct(int ID) {
    ID = ID-1;
    Product product = Product.getProductElementByID(ID);
    product.softDelete();
    System.out.printf("\n¡Producto %s (%d) eliminado exitosamente!\n", product.name, product.getID());

    /* DEPRECATED: 
      prod1.productList2.remove(ID);
      prod1.name = null;
      prod1.description = null;
      prod1.setReference("null");
      prod1.stock = 0;
      prod1.price = 0;
    */
  }
  
  // METODO PARA CAMBIAR EL PRECIO UN PRODUCTO
  public void changePrice(Product product) {
    double oldPrice = product.price;
    product.price = Main.askUserDouble("Ingresa el nuevo precio del plato '"+product.name+"':");
    System.out.println("¡El cambio de precio del producto '"+product.name+"' fue exitoso! ("+oldPrice+"->"+product.price+")");
  }

  // METODO PARA CAMBIAR EL STOCK UN PRODUCTO
  public void changeStock(Product product) {
    int oldStock = product.stock;
    product.stock = Main.askUserInt("\nIngresa la disponibilidad del plato '"+product.name+"': ");
    System.out.println("¡El cambio de stock del producto '"+product.name+"' ("+oldStock+"->"+product.stock+") fue exitoso!");
    }

  // METODO PARA CAMBIAR EL STOCK UN PRODUCTO
  public void changeDesc(Product product) {
    product.description = Main.askUserStr("\nIngresa la nueva descripcion del plato '"+product.name+"': ");
    System.out.println("¡El cambio de descripcion del producto '"+product.name+"' fue exitoso!");
  }

  // METODO PARA CREAR UN EMPLEADO
  public Waiter createWaiter() {
    String
      new_name = Main.askUserStr("Ingrese el nombre completo del nuevo empleado: ");
    int 
      ID = Main.askUserInt("Ingrese el ID del nuevo empleado: ");
    Date_ex
      fecha_cumple = Date_ex.askUserDate("Ingrese la fecha de nacimiento: "),
      fecha_ingreso = Date_ex.askUserDate("Digite la fecha de ingreso: ");
    double 
      salary = Main.askUserDouble("Ingrese el salario del nuevo empleado");
    String
      login_userName = Main.askUserStr("Ingrese el user name del empleado a crear"),
      login_password = Main.askUserStr("Ingrese el password del empleado a crear");
      
    Waiter waiter1 = new Waiter(ID, new_name, fecha_cumple, fecha_ingreso, salary, 0.0, login_userName, login_password);
    System.out.println("¡Waiter creado exitosamente!");

    return waiter1;
  }

  // METODO PARA MODIFICAR NOMBRE DE EMPLEADO
  public void changeNameWaiter(Waiter waiter) {
    String oldName = waiter.fullName;
    waiter.fullName = Main.askUserStr("\nIngresa el nuevo nombre de "+waiter.fullName+": ");
    System.out.println("¡El cambio de nombre ('"+oldName+"'->'"+waiter.fullName+"') fue exitoso!");
  }

  // METODO PARA MODIFICAR EL SALARIO DE UN EMPLEADO
  public void changeSalaryWaiter(Waiter waiter) {
    double 
      oldSalary = waiter.getSalary(),
      newSalary = Main.askUserDouble("\nIngresa el nuevo salario de "+ waiter.fullName);;
    waiter.setSalary(newSalary);
    System.out.println("¡El ambio de salario del empleado "+waiter.fullName+" fue exitoso! ($"+oldSalary+" -> $"+newSalary+")");
  }
  
  
  // METODO PARA ELIMINAR UN EMPLEADO
  public void deleteWaiter(Waiter wait1) {
    wait1.softDelete();
    System.out.printf("\n¡Empleado %s (%d,%d) eliminado exitosamente!\n", wait1.fullName, wait1.getID(), wait1.getID_ex());
    /* Deprecated: Is no more needed because of the softDelete method.
      wait1.set_login_userName("null");
      wait1.set_login_password("null");
    */
  }
  
  //---- / Other methods
}