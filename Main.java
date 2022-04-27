/*
Mejorar sistema de propinas del cliente
Que se puedan ingresar las fechas directamente en formato dd/MM/yyyy (ej: 21/10/2021)
'Funcionarlizar' el codigo para brindar mejor estructura y comentar el código restante
Método [validación] para comprobar que el ID de un mesero existe o no.

Para clase empleado (Employee) agregar atributo nombre y contraseña con los cuales se pueda autenticar el usuario
Setear algunos administradores y empleados por defecto



Testeo general
Actualizar el diagrama de clases
*/


import java.util.*;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

class Main 
{  
  // ---------------------- ]   CONFIG    [ ----------------------//
  public static ArrayList<String> firstMenu_Options = new ArrayList<String>(), secondMenu_Options = new ArrayList<String>(), mensajesDefault = new ArrayList<String>();
  public static ArrayList<Integer> primerMenu_exit = new ArrayList<Integer>(), segundoMenu_exit = new ArrayList<Integer>();

  // ---------------------- ]    MAIN    [ ---------------------- //
  public static void main(String[] args) 
  {
    
    // Creación de objetos y configuración de inicio (productos, menus, mensajes, etc.)
    defaultConfig();

    // Obtener nombre del usuario

        
    // Admins por defecto
    
    Admin adm1 = new Admin(12345, "David", new Date_ex(2001,10,12), new Date_ex(2018,10,12), 3000000, "123", "123");
    
    sysout("******************* Bienvenido *******************");
    int opcionMenu_inicio = 0; String name = "", password = "";
    boolean validInput = true; 

    do 
    {
      opcionMenu_inicio = askUserInt("\n\nPor favor ingrese una opción: \n 1) Administrador \n 2) Empleado \n 3) Cliente \n 0) Salir \n");
      if(opcionMenu_inicio == 0) continue; // exit

      if(opcionMenu_inicio == 1 || opcionMenu_inicio == 2) {
        int attempts = 0; 
        do {
          if(!validInput) sysout("Credenciales inválidas, intentalo de nuevo");

          name = askUserStr("Usuario:");
          password = askUserStr("Contraseña");

          attempts++;
          validInput = validateCredentials(name, password, opcionMenu_inicio);
        }
        while (attempts < 3 && !validInput );

        if(attempts >= 3) {
          sysout("Demasiados intentos.");
          return;
        }
        
        if(validInput) sysout("Acceso permitido");
      }
      else name = askUserStr("Ingrese su nombre completo: ");

      switch(opcionMenu_inicio) 
      {
        // Caso administrador

        
        case 1:          
          int optionx = askUserInt("\n1. Productos \n2. Empleados \n0. Salir");
          switch(optionx)
          {
              
            case 1: // Productos
              int option1 = askUserInt("\n1. Modificar producto\n2. Agregar producto\n3. Eliminar producto");
              switch(option1) 
              {
                case 1: // Modificar
                  Product productToModify = Product.getProductElementByInputID("Ingrese el ID del producto a modificar:");
                  int option2 = askUserInt("\n1. Modificar precio\n2. Modificar stock\n3. Modificar descripcion");
                  switch(option2) {
                    case 1:   adm1.changePrice(productToModify);    break;
                    case 2:   adm1.changeStock(productToModify);    break;
                    case 3:   adm1.changeDesc(productToModify);     break;
                    default:  sysout("Opcion invalida");   break;
                  }
                break;

                case 2: // Agregar
                  adm1.createProduct();
                break;
                
                case 3: // Eliminar
                  Product productToDelete = Product.getProductElementByInputID("Ingrese el ID del producto a eliminar:");
                  adm1.deleteProduct(productToDelete);
                  sysout("¡Producto eliminado exitosamente!");
                break;
                  
                default:
                  sysout("Opcion invalida");
                break;
              }
            break;
            case 2:  
              int optionEmp1 = askUserInt("\n1. Modificar empleado \n2. Agregar empleado \n3. Eliminar empleado");
              switch(optionEmp1){
                case 1: 
                  Waiter waiter = Waiter.getWaiterElementByInputID("Ingrese el ID del empleado:");
                  int optionEmp2 =   askUserInt("\n1. Editar sueldo \n2. Editar nombre");
                  
                  switch(optionEmp2){
                    case 1:   adm1.changeSalaryWaiter(waiter);    break;
                    case 2:   adm1.changeNameWaiter(waiter);      break;  
                  }
                break;

                case 2: adm1.createWaiter(); break;
                case 3: 
                    Waiter waiter2 = Waiter.getWaiterElementByInputID("Ingrese el ID del empleado:");
                    adm1.deleteWaiter(waiter2);
                break;
              } 
            break;
          }
          //
        break;

        // Caso empleado
        case 2:
          DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("yyyy/MM/dd");
          
          Waiter waiter1 = Waiter.getWaiterElementByInputID("Id del empleado: ");
          LocalDate fecha_nacimiento = waiter1.getBirthDate().fecha;
          LocalDate fecha_ingreso = waiter1.getJoinDate().fecha;
          
          sysout("******************* DATOS DEL EMPLEADO *******************");
          sysout("Nombre: " + waiter1.fullName);
          sysout("ID: " + waiter1.getID());
          sysout("Fecha de nacimiento: "+fecha_nacimiento.format(fechaFormato));
          sysout("Fecha de ingreso: "+fecha_ingreso.format(fechaFormato));
          sysout("Propina: "+waiter1.getBaksheesh());
          sysout("Salario: "+waiter1.getSalary()); 
          sysout("**********************************************************");
          
        break;
        
          
        // Caso cliente
        case 3:
          executeClientMenu(name);
        break;
      }
    }
    while(opcionMenu_inicio != 0);


    // Imprimir mensaje de despedida
    sysout(mensajesDefault.get(1));
  }


  // ----------------- ]   MENU FUNCTIONS   [ ----------------- //
  public static void executeClientMenu(String name) 
  {
    // Preguntar al usuario por la primera lista de opciones
    int opcionElegida_primerMenu = mostrarOpciones_primerMenu(name);

    // Opción 2 - pedido a domicilio
    boolean isDelivery = false; String domicilio = ""; long phoneNumber = 0;
    if(opcionElegida_primerMenu == 2){
      isDelivery = true;
      domicilio = askUserStr("Ingresa la dirección del domicilio: ");
      phoneNumber = askUserLong("Ingresa el número de teléfono: ");
    }

    // Creación del objeto cliente y orden
    
    Client userClient = new Client(1, name, domicilio, phoneNumber);
    Order clientOrder = new Order(userClient, isDelivery);
    
    
    while (true) 
    {
      // Romper ciclo si el usuario elige la opción de salirse del menú
      if(isInList(opcionElegida_primerMenu, primerMenu_exit)) {
        sysout(String.format(mensajesDefault.get(0), name));  //Mensaje de salida
        break;
      };
      
      // Preguntar al usuario por el tipo de producto, se le muestra todos los productos existentes de ese tipo
      int opcionElegida_segundoMenu = mostrarOpciones_segundoMenu(name);

      // Si el usuario debe/quiere salirse del menú 2 por cancelación o facturación
      if(isInList(opcionElegida_segundoMenu, segundoMenu_exit)) 
      {
        // Si se trata de cancelar pedido, entonces rompemos el ciclo
        if(opcionElegida_segundoMenu == segundoMenu_exit.get(1)) {
          sysout(String.format(mensajesDefault.get(0), name)); //Mensaje de salida
          break; 
        }
        
        // Sí se debe facturar y finalizar pedido
        if(clientOrder.getListaProductos().size() == 0)
          sysout("Lo sentimos, no has seleccionado ningun producto aún.");
        else {
          if(!isDelivery) {
            int semiBolPropina = askUserInt("¿Desea registrarle propina al mesero?\n1. Si.\nOtro número. No.");
            if(semiBolPropina == 1) {
              double propina_a_dar = askUserDouble("¿Cuánto desea darle al mesero?: ");
              while (propina_a_dar < 1) {
                sysout("Lo sentimos el valor inválido");
                propina_a_dar = askUserDouble("¿Cuánto $ desea darle al mesero?: ");
              }

              Waiter meseroPropina = Waiter.getWaiterElementByInputID("ID del mesero:");
              double propina_total = meseroPropina.getBaksheesh()+propina_a_dar;

              meseroPropina.setBaksheesh(propina_total);
              sysout("Genial!, le has dado $"+propina_a_dar+" al mesero "+meseroPropina.fullName+" por su buen servicio :)");
            }
          }
          imprimirFactura(clientOrder);
          break;
        }
        
      }

      // Si el usuario eligió un tipo de productos
      else {
        // Preguntar al usuario por el producto a elegir
        int opcionElegida_tercerMenu = mostrarOpciones_tercerMenu(opcionElegida_segundoMenu-1);

        // Obtenemos el objeto del producto que el usuario eligió
        Product productoElegido = Product.getProductElementByID(opcionElegida_tercerMenu-1);
        sysout("\n ** Se ha añadido "+productoElegido.name+" a tu carrito. ¡Sigue satisfaciendo tus antojos! ** ");
        clientOrder.addProduct(productoElegido);
        productoElegido.stock -= 1;
      }
      
    }
  }
  
  public static int mostrarOpciones_primerMenu(String name) 
  {
    int choosenOption;
    // Se obtienen las opciones para el menú 1, opciones almacenadas en ´firstMenu_Options´
    String menuOptions_first = stringArrayList_toMenuString(firstMenu_Options);


    while(true) {
      // Se imprimen las opciones y se le pregunta al usuario cuál ejecutar
      choosenOption = askUserInt("\n"+name+" elige una opción:\n"+menuOptions_first);

      // Se valida si la opción ingresada es una opción valida
      ArrayList<Integer> validOptions = getValidOptions_fromArrayList(firstMenu_Options);
      boolean isValidOption = isInList(choosenOption, validOptions);

      // En caso de no ser válidad, se imprime mensaje y se repite el ciclo
      if(!isValidOption) 
        sysout("Has ingresado un valor inválido, por favor intentalo de nuevo.");

      // Si la opción es válida, se rompe el ciclo. Se pasará al segundo menú
      else break;
    }
    
    return choosenOption;
  }

  public static int mostrarOpciones_segundoMenu(String name)
  {
    int choosenOption;
    // Se obtienen las opciones para el menú 2, opciones almacenadas en ´secondMenu_Options´
    String menuOptions_second = stringArrayList_toMenuString(secondMenu_Options);

    while(true) {
      // Se imprimen las opciones y se le pregunta al usuario cuál ejecutar
      choosenOption = askUserInt("\n"+name+" elige una opción:\n"+menuOptions_second);

      // Se valida si la opción ingresada es una opción valida
      ArrayList<Integer> validOptions = getValidOptions_fromArrayList(secondMenu_Options);
      boolean isValidOption = isInList(choosenOption, validOptions);

      // En caso de no ser válidad, se imprime mensaje y se repite el ciclo
      if(!isValidOption) 
        sysout("Has ingresado un valor inválido, por favor intentalo de nuevo.");

      // Si la opción es válida, se rompe el ciclo. Se pasará al segundo menú
      else break;
    }
    
    return choosenOption;
  }

  public static int mostrarOpciones_tercerMenu(int productType) 
  {
    int choosenOption = 0;
    
    // Menú con los productos según el tipo de producto elegido
    String message = String.format("\n** Menú de %s **\n%s\n¿Cuál producto deseas comprar?: ", secondMenu_Options.get(productType).toLowerCase(), getAllProductsByType_formated(productType));

    // Obtenemos el número correspondiente al producto que el usuario desea comprar
    do {
      choosenOption = askUserInt(message);
      if(!isValidChoosenProduct(productType, choosenOption-1))
        sysout("\n** Producto inválido. Intentalo de nuevo **");
    } while(!isValidChoosenProduct(productType, choosenOption-1));
    
    return choosenOption;
  }

  public static void imprimirFactura(Order clientOrder) {
    sysout(mensajesDefault.get(2)); // Mensaje de facturando...
    sysout("\n\n|---------------------------------------------------------------------|");
    sysout("|----------------------------- FACTURA -------------------------------|");
    sysout("|---------------------------------------------------------------------|");
    clientOrder.Facturar();
    sysout("|---------------------------------------------------------------------|");
    sysout("| Precio total: "+ darFormatoDinero(clientOrder.get_preciototal()));
    sysout("|---------------------------------------------------------------------|");
  }

  // Esta función retorna un string con la lista la lista de productos, a cada producto se le incluye el ID, nombre, precio, stock
  public static String getAllProductsByType_formated(int productType) 
  {
    String message = "";
    
    for(int i = 0; i < Product.getProductsCount(); i++) {
      Product product = Product.getProductElementByID(i);
      if(product.type == productType) {
        int Stock = product.stock;
        String price = darFormatoDinero(product.price);
        message = String.format("%sNo. %d - %s ( %s - %d unidades disponibles )\n", message, product.getID()+1, product.name, price, Stock);
      }
    }
    return message;
  }

  public static String darFormatoDinero(double dinero) {
    String price = DecimalFormat.getCurrencyInstance(Locale.US).format(Math.round(dinero));
    return price;
  }
  
  public static boolean isValidChoosenProduct(int type, int ID) 
  {
    Product choosedElement = Product.getProductElementByID(ID);
    if(choosedElement.type != type)
      return false;
    else return true;
  }

  public static boolean validateCredentials(String name, String password, int userType) {
    boolean valid_credential = true;
    
    if( !(name.equals("123")) || !(password.equals("123")) ) valid_credential = false;
    else valid_credential = true;
    
    return valid_credential;
  }

  // ---------------------- ]   UTILS   [ ---------------------- //  
  
  public static int askUserInt(String message) 
  {
    Scanner scanner_ = new Scanner(System.in);
    int answer = 0; boolean valid = false;
    
    try {
      sysout(message);
      answer = scanner_.nextInt();
      valid = true;
    }
    catch(Exception e) {
      sysout("Lo sentimos, el valor ingresado es inválido, intetelo de nuevo");
      valid = false;
    }

    if(!valid) return askUserInt(message);    
    return answer;
  }
  
  public static double askUserDouble(String message) 
  {
    Scanner scanner_ = new Scanner(System.in);
    double answer = 0; boolean valid = false;
    try {
      sysout(message);
      answer = scanner_.nextDouble();
      valid = true;
    }
    catch (Exception e) {
      sysout("Lo sentimos, el valor ingresado es inválido, intetelo de nuevo");
      valid = false;
    }
    if(!valid) return askUserDouble(message);    
    return answer;
  }
  
  public static long askUserLong(String message) 
  {
    Scanner scanner_ = new Scanner(System.in);
    long answer = 0; boolean valid = false;
    try {
      sysout(message);
      answer = scanner_.nextLong();
    }
    catch (Exception e) {
      sysout("Lo sentimos, el valor ingresado es inválido, intetelo de nuevo");
      valid = false;
    }
    if(!valid) return askUserLong(message);    
    return answer;
  }
  
  public static String askUserStr(String message) 
  {
    Scanner scanner_ = new Scanner(System.in);
    String answer = ""; boolean valid = false;

    try {
      sysout(message);
      answer = scanner_.nextLine(); 
      valid = true;
    }
    catch (Exception e) {
      sysout("Lo sentimos, el valor ingresado es inválido, intetelo de nuevo");
      valid = false;
    }
    if(!valid) return askUserStr(message);    
    return answer;
  }

  public static boolean isInList(int value, ArrayList<Integer> list) 
  {
    for(int count = 0; count < list.size(); count++) {
      if(value == list.get(count) )
        return true;
    }
    return false;
  }
  
  public static String stringArrayList_toMenuString(ArrayList<String> list) 
  {
    String createdStr = "";
    for(int count = 0; count < list.size(); count++) {
      createdStr = String.format("%s%d. %s\n", createdStr, count+1, list.get(count));
    }
    return createdStr;
  }

  public static ArrayList<Integer> getValidOptions_fromArrayList(ArrayList<String> list) 
  {
    ArrayList<Integer> validOptions = new ArrayList<Integer>();
    for(int count = 0; count < list.size(); count++) {
      validOptions.add(count+1);
    }
    return validOptions;
  }
  
  public static void sysout(String message) 
  {
    System.out.println(message);
  }


  // ----------- ]   DEFAULT COFIG AND OBJECTS   [ ----------- //
  public static void defaultConfig() 
  {
    //Opciones primer menú
    firstMenu_Options.add("Pedido en mesa");
    firstMenu_Options.add("Domicilio");
    firstMenu_Options.add("Salir");

    // Opciones segundo menú
    secondMenu_Options.add("Bebidas");
    secondMenu_Options.add("Postres");
    secondMenu_Options.add("Platos");
    secondMenu_Options.add("Finalizar pedido");
    secondMenu_Options.add("Cancelar pedido");

    // Numero de opción que me saca del menú
    primerMenu_exit.add(3);   // Menu 1  : Opcion 2 me saca del menú 1
    segundoMenu_exit.add(4);  // Menu 2  : Opcion 4 finaliza el pedido en el menú 2
    segundoMenu_exit.add(5);  // Menu 2  : Opcion 5 cancela el pedido en el menú 2

    // Mensajes de vuelve pronto y despedida
    mensajesDefault.add("%s, que luego no te arrepientas. Vuelve pronto a por tus antojos");
    mensajesDefault.add("\nMuchas gracias por utilizar nuestros servicios. \nEstaremos aquí siempre que nececites realizar tu pedido.");
    mensajesDefault.add("Gracias por comprar con nostros, ahora, ¡Satisface tus antojos!\nFinalizando pedido...");
    
    //Default products
    // Producto(String name, int type, String description, double price, int stock)
    new Product("Hamburguesa sencilla", 2, "carne de 90gr, lechuga, tomate, cebolla, queso mozarela, huevo de codorniz y tocino", 10000, 5);
    new Product("Hamburguesa especial", 2, "carne de 120gr, lechuga, tomate, cebolla, queso mozarela, huevo de codorniz, carne o pollo desmechado y tocino", 15000, 5);
    new Product("Salchipapa",2, "Papa, salchica y chorizo", 6000, 10);
    new Product("Pizza",2, "Mixta (pollo, carne y champiñón), 5000", 6000, 14);
    new Product("Hot Dog",2, "Chorizo, papa fosforito, cebolla, queso y tocino", 4500, 10);
    new Product("Gaseosa",0, "Refrescante", 3500, 20);
    new Product("Jugo natural",0, "En leche o agua", 3000, 20);
    new Product("Cerveza",0, "Espumoza", 3800, 20);
    new Product("Agua",0, "Natural", 2500, 20);
    new Product("Té",0, "De limon o durazno", 3500, 20);
    new Product("Pastel tres leches",1, "Dulce y suave", 2500, 20);
    new Product("Cheesecake",1, "Limon, mora, maracuyá o lulo", 4000, 20);
    new Product("Torta de chocolate",1, "Con relleno de arequipe", 12000, 20);
    new Product("Fresas con crema",1, "Frescas y deliciosas", 12000, 20);

  
          // Empleados por defecto
    Waiter waiter1 = new Waiter(4848, "Paco",new Date_ex(2000,10,12), new Date_ex(2018,10,12), 1200000, 150,"123", "123");
  }
}