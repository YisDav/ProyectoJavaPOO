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
  public Product createProduct(String name, int type, String description, double price, int stock)
  {
    return new Product(name, type+1, description, price, stock);
  }
  
  // METODO PARA ELIMINAR UN PRODUCTO
  public void deleteProduct(int ID) {
    ID = ID-1;
    Product product = Product.getProductElementByID(ID);
    product.softDelete();
  }
  
  // METODO PARA CAMBIAR EL PRECIO UN PRODUCTO
  public void changePrice(Product product, double price_ex) {
    product.price = price_ex;
  }

  // METODO PARA CAMBIAR EL STOCK UN PRODUCTO
  public void changeStock(Product product, int stock) {
    product.stock = stock;
  }

  // METODO PARA CAMBIAR EL STOCK UN PRODUCTO
  public void changeDesc(Product product, String desc) {
    product.description = desc;
  }

  // METODO PARA CREAR UN EMPLEADO
  public Waiter createWaiter(String new_name, int ID, Date_ex fecha_cumple, Date_ex fecha_ingreso, double salary, String userName, String password) {
    Waiter waiter1 = new Waiter(ID, new_name, fecha_cumple, fecha_ingreso, salary, 0.0, userName, password);
    return waiter1;
  }

  // METODO PARA MODIFICAR NOMBRE DE EMPLEADO
  public void changeNameWaiter(Waiter waiter, String name) {
    waiter.fullName = name;
  }

  // METODO PARA MODIFICAR EL SALARIO DE UN EMPLEADO
  public void changeSalaryWaiter(Waiter waiter, double salary) {
    waiter.setSalary(salary);
  }
  
  
  // METODO PARA ELIMINAR UN EMPLEADO
  public void deleteWaiter(Waiter wait1) {
    wait1.softDelete();
  }
  
  //---- / Other methods
}