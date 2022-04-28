import java.util.ArrayList;

class Admin extends Employee {
  //---- Attributes
  //---- / Attributes
  

  //---- Constructor
  Admin(int ID, String fullName, Date_ex birth_date, Date_ex join_date, double salary, String login_userName, String login_password) {
    super(ID, fullName, birth_date, join_date, salary, login_userName, login_password);
    adminList.add(this);
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
      type = Main.askUserInt("Tipo de producto:\n1. Bebidas\n2. Postres\n3. Platos"),
      stock = Main.askUserInt("Stock:"),
      fixed_type = type-1;
    
    double 
      price = Main.askUserDouble("Precio:");

    Product createdProduct = new Product(name, fixed_type, description, price, stock);  
    Main.sysout("¡Producto '"+createdProduct.name+"' ($"+createdProduct.price+") creado exitosamente!");    
    return createdProduct;
  }
  
  // METODO PARA ELIMINAR UN PRODUCTO
  public void deleteProduct(Product product) {
    product = null;
  }
  
  // METODO PARA CAMBIAR EL PRECIO UN PRODUCTO
  public void changePrice(Product product) {
    double oldPrice = product.price;
    product.price = Main.askUserDouble("Ingresa el nuevo precio del plato '"+product.name+"':");
    Main.sysout("¡El cambio de precio del producto '"+product.name+"' fue exitoso! ("+oldPrice+"->"+product.price+")");
  }

  // METODO PARA CAMBIAR EL STOCK UN PRODUCTO
  public void changeStock(Product product) {
    int oldStock = product.stock;
    product.stock = Main.askUserInt("\nIngresa la disponibilidad del plato '"+product.name+"': ");
    Main.sysout("¡El cambio de stock del producto '"+product.name+"' ("+oldStock+"->"+product.stock+") fue exitoso!");
    }

  // METODO PARA CAMBIAR EL STOCK UN PRODUCTO
  public void changeDesc(Product product) {
    product.description = Main.askUserStr("\nIngresa la nueva descripcion del plato '"+product.name+"': ");
    Main.sysout("¡El cambio de descripcion del producto '"+product.name+"' fue exitoso!");
  }

  // METODO PARA CREAR UN EMPLEADO
  public Waiter createWaiter() {
    String
      new_name = Main.askUserStr("Ingrese el nombre completo del nuevo empleado: ");
    int 
      ID = Main.askUserInt("Ingrese el ID del nuevo empleado: ");
    Date_ex
      fecha_cumple = Date_ex.askUserDate_ex("Ingrese la fecha de nacimiento: "),
      fecha_ingreso = Date_ex.askUserDate_ex("Digite la fecha de ingreso: ");
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
    String oldName = waiter.fullName;
    waiter.fullName = Main.askUserStr("\nIngresa el nuevo nombre de "+waiter.fullName+": ");
    Main.sysout("¡El cambio de nombre ('"+oldName+"'->'"+waiter.fullName+"') fue exitoso!");
  }

  // METODO PARA MODIFICAR EL SALARIO DE UN EMPLEADO
  public void changeSalaryWaiter(Waiter waiter) {
    double 
      oldSalary = waiter.getSalary(),
      newSalary = Main.askUserDouble("\nIngresa el nuevo salario de "+ waiter.fullName);;
    waiter.setSalary(newSalary);
    Main.sysout("¡El ambio de salario del empleado "+waiter.fullName+" fue exitoso! ($"+oldSalary+" -> $"+newSalary+")");
  }
  
  
  // METODO PARA ELIMINAR UN EMPLEADO
  public void deleteWaiter(Waiter waiter) {
    waiter = null;
    Main.sysout("¡Empleado eliminado exitosamente!");
  }

  
  private static ArrayList<Admin> adminList = new ArrayList<Admin>();
  public static Admin getAdminByNameAndPassword(String username, String password) {
    Admin currentAdmin = null, findedAdmin = null;
    for(int i = 0; i < adminList.size(); i++) {
      currentAdmin = adminList.get(i);

      String 
        login_userName = currentAdmin.get_login_userName(),
        login_password = currentAdmin.get_login_password();

      if( username.equals(login_userName) && password.equals(login_password) ) findedAdmin = currentAdmin;
    }
    return findedAdmin;
  }

  public static Admin askUserCredentials(){
    Admin adm1 = null;
    int attempts = 0;
    do {
      attempts++;
      String 
        name = Main.askUserStr("Usuario:"),
        password = Main.askUserStr("Contraseña:");

      adm1 = Admin.getAdminByNameAndPassword(name, password);

      if(adm1 == null) Main.sysout("Credenciales inválidas, intentalo de nuevo");
    }
    while (attempts < 3 && adm1 == null );

    if(attempts >= 3) {
      Main.sysout("Demasiados intentos.");
      return null;
    }
    else Main.sysout("Acceso permitido"); 
    return adm1; 
  }
  
  //---- / Other methods
}