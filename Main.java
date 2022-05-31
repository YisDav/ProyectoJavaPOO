import java.util.*;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

/*
*
* check list:

Cambiar nombre al proyecto!!!!!!!!!!!!!!!


Eliminar empleado: Listo!
Eliminar producto: Listo!
Mostrar fecha en la factura: Listo!

// Ejecutar en la interfaz para no perder tiempo haciendolo en consola y después borrarlo xd
Sistema de agrupar productos iguales en la factura
Adaptar sistema de tal forma que se muestre, al momento de elegir un producto, cuantos productos desea comprar.
(Ejemplo comprar 8 Bueñuelos al tiempo) y que en la factura se muestre 'Bueñuelos (8)' en vez de varias lineas repetidas.




*         --------===========] Características en diseño [===========--------
*      *  Implementación con MySQL para almacenamiento persistente de información
*      *  Panel administrativo: Eliminar empleados y productos.
*      *  Validación de credenciales: Encriptación con Bcrypt de las credenciales
*      *  Diseño de interfaz gráfica.
*      *  Implementar fechas en la facturación.

    --===========] Anotaciones para hacer funcinar la intarfaz con el codigo[===========----

* Todos los datos seran pedidos por consola al igual que las impresiones. 
* En lo posible se implementarán imagenes para los produtos.
* Solicitar cantidad de productos y el numero de mesa 
* 
  
*/

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

    //
    System.out.println("******************* Bienvenido *******************");
    int opcionMenu_inicio = 0;
    do 
    {
      opcionMenu_inicio = askUserInt("\n\nPor favor ingrese una opción: \n 1) Administrador \n 2) Empleado \n 3) Cliente \n 0) Salir \n");
      if(opcionMenu_inicio == 0) continue; // exit

      switch(opcionMenu_inicio) 
      {
        // Caso administrador
        case 1:     
          Admin adm1 = (Admin) Admin.attemptToLogin();
          if(adm1 == null) return;

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
                  switch(option2) 
                  {
                    case 1:   adm1.changePrice(productToModify);    break;
                    case 2:   adm1.changeStock(productToModify);    break;
                    case 3:   adm1.changeDesc(productToModify);     break;
                    default:  System.out.println("Opcion invalida");   break;
                  }
                break;

                case 2: // Agregar
                  adm1.createProduct();
                break;
                
                case 3: // Eliminar
                  int productToDelete = askUserInt("Ingrese el ID del producto a eliminar:");
                  adm1.deleteProduct(productToDelete);
                break;
                  
                default:
                  System.out.println("Opcion invalida");
                break;
              }
            break;
            case 2:  
              int optionEmp1;
              do {
                optionEmp1 = askUserInt("\n1. Agregar empleado \n2. Modificar empleado \n3. Eliminar empleado\n4. Salir");
                //------
                // Crear empleado
                if (optionEmp1 == 1) {
                  adm1.createWaiter();
                }
                else if (optionEmp1 == 2 || optionEmp1 == 3 ) {
                  Waiter waiter = Waiter.getWaiterElementByInputID("Ingrese el ID del empleado:");
                  switch(optionEmp1) {
                    //------
                    // Modificar Empleado
                    case 2: 
                      int optionEmp2 =   askUserInt("\n1. Editar sueldo \n2. Editar nombre");
                      switch(optionEmp2){
                        case 1:   adm1.changeSalaryWaiter(waiter);    break;
                        case 2:   adm1.changeNameWaiter(waiter);      break;  
                      }
                    break;
                    //------
                    // Eliminear Empleado
                    case 3: adm1.deleteWaiter(waiter);
                    break;
                  }
                }
              } while(optionEmp1 != 4);


            break;
          }
          //
        break;

        // Caso empleado
        case 2:
          Waiter waiter1 = (Waiter) Waiter.attemptToLogin();
          if(waiter1 == null) return;

          DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("yyyy/MM/dd");
          LocalDate fecha_nacimiento = waiter1.getBirthDate().fecha;
          LocalDate fecha_ingreso = waiter1.getJoinDate().fecha;
          
          System.out.println("\n\n******************* DATOS DEL EMPLEADO *******************");
          System.out.println("Nombre: " + waiter1.fullName);
          System.out.println("ID: " + waiter1.getID());
          System.out.println("Edad: "+waiter1.getAgeString());
          System.out.println("Fecha de nacimiento: "+fecha_nacimiento.format(fechaFormato));
          System.out.println("Fecha de ingreso: "+fecha_ingreso.format(fechaFormato));
          System.out.println("Propina: "+waiter1.getBaksheesh());
          System.out.println("Salario: "+waiter1.getSalary()); System.out.println("**********************************************************");
        break;
        
        // Caso cliente
        case 3:
          String name = askUserStr("Ingrese su nombre completo: ");
          executeClientMenu(name);
        break;
      }
    }
    while(opcionMenu_inicio != 0);

    // Imprimir mensaje de despedida
    System.out.println(mensajesDefault.get(1));
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
        System.out.println(String.format(mensajesDefault.get(0), name));  //Mensaje de salida
        break;
      };
      
      // Preguntar al usuario por el tipo de producto, se le muestra todos los productos existentes de ese tipo
      int opcionElegida_segundoMenu = mostrarOpciones_segundoMenu(name);

      // Si el usuario debe/quiere salirse del menú 2 por cancelación o facturación
      if(isInList(opcionElegida_segundoMenu, segundoMenu_exit)) 
      {
        // Si se trata de cancelar pedido, entonces rompemos el ciclo
        if(opcionElegida_segundoMenu == segundoMenu_exit.get(1)) {
          System.out.println(String.format(mensajesDefault.get(0), name)); //Mensaje de salida
          break; 
        }
        
        // Sí se debe facturar y finalizar pedido
        if(clientOrder.getListaProductos().size() == 0)
          System.out.println("Lo sentimos, no has seleccionado ningun producto aún.");
        else {
          if(!isDelivery) {
            int semiBolPropina = askUserInt("¿Desea registrarle propina al mesero?\n1. Si.\nOtro número. No.");
            if(semiBolPropina == 1) {
              double propina_a_dar = askUserDouble("¿Cuánto desea darle al mesero?: ");
              while (propina_a_dar < 1) {
                System.out.println("Lo sentimos el valor inválido");
                propina_a_dar = askUserDouble("¿Cuánto $ desea darle al mesero?: ");
              }

              Waiter meseroPropina = Waiter.getWaiterElementByInputID("ID del mesero:");
              double propina_total = meseroPropina.getBaksheesh()+propina_a_dar;

              meseroPropina.setBaksheesh(propina_total);
              System.out.println("Genial!, le has dado $"+propina_a_dar+" al mesero "+meseroPropina.fullName+" por su buen servicio :)");
            }
          }
          imprimirFactura(clientOrder);
          break;
        }
        
      }

      // Si el usuario eligió un tipo de productos
      else {
        // Preguntar al usuario por el producto a elegir
        int opcionElegida_tercerMenu = mostrarOpciones_tercerMenu(opcionElegida_segundoMenu);

        // Obtenemos el objeto del producto que el usuario eligió
        Product productoElegido = Product.getProductElementByID(opcionElegida_tercerMenu-1);
        System.out.println("\n ** Se ha añadido "+productoElegido.name+" a tu carrito. ¡Sigue satisfaciendo tus antojos! ** ");
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
        System.out.println("Has ingresado un valor inválido, por favor intentalo de nuevo.");

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
        System.out.println("Has ingresado un valor inválido, por favor intentalo de nuevo.");

      // Si la opción es válida, se rompe el ciclo. Se pasará al segundo menú
      else break;
    }
    
    return choosenOption;
  }

  public static int mostrarOpciones_tercerMenu(int productType) 
  {
    int choosenOption = 0, productType_fixed = productType-1;
    
    // Menú con los productos según el tipo de producto elegido
    String message = String.format("\n** Menú de %s **\n%s\n¿Cuál producto deseas comprar?: ", secondMenu_Options.get(productType_fixed).toLowerCase(), getAllProductsByType_formated(productType_fixed));

    // Obtenemos el número correspondiente al producto que el usuario desea comprar
    do {
      choosenOption = askUserInt(message);
      if(!isValidChoosenProduct(productType_fixed, choosenOption-1))
        System.out.println("\n** Producto inválido. Intentalo de nuevo **");
    } while(!isValidChoosenProduct(productType_fixed, choosenOption-1));
    
    return choosenOption;
  }

  public static void imprimirFactura(Order clientOrder) {
    System.out.println(mensajesDefault.get(2)); // Mensaje de facturando...
    System.out.println("\n\n|---------------------------------------------------------------------|");
    System.out.println("|----------------------------- FACTURA -------------------------------|");
    System.out.println("|  Fecha: " + Date_ex.getTodayDateTime());
    System.out.println("|---------------------------------------------------------------------|");
    System.out.println("|---------------------------------------------------------------------|");
    clientOrder.Facturar();
    System.out.println("|---------------------------------------------------------------------|");
    System.out.println("| Precio total: "+ darFormatoDinero(clientOrder.get_preciototal()));
    System.out.println("|---------------------------------------------------------------------|");
  }

  // Esta función retorna un string con la lista la lista de productos, a cada producto se le incluye el ID, nombre, precio, stock
  public static String getAllProductsByType_formated(int productType) 
  {
    String message = "";
    for(Product product : Product.getList(productType)) {
      int Stock = product.stock;
      String price = darFormatoDinero(product.price);
      message = String.format("%sNo. %d - %s ( %s - %d unidades disponibles )\n", message, product.getID()+1, product.name, price, Stock);
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

  // ---------------------- ]   UTILS   [ ---------------------- //  
  
  public static int askUserInt(String message) 
  {
    Scanner scanner_ = new Scanner(System.in);
    int answer = 0; boolean valid = false;
    
    try {
      System.out.println(message);
      answer = scanner_.nextInt();
      valid = true;
    }
    catch(Exception e) {
      System.out.println("Lo sentimos, el valor ingresado es inválido, intetelo de nuevo");
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
      System.out.println(message);
      answer = scanner_.nextDouble();
      valid = true;
    }
    catch (Exception e) {
      System.out.println("Lo sentimos, el valor ingresado es inválido, intetelo de nuevo");
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
      System.out.println(message);
      answer = scanner_.nextLong();
      valid = true;
    }
    catch (Exception e) {
      System.out.println("Lo sentimos, el valor ingresado es inválido, intetelo de nuevo");
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
      System.out.println(message);
      answer = scanner_.nextLine(); 
      valid = true;
    }
    catch (Exception e) {
      System.out.println("Lo sentimos, el valor ingresado es inválido, intetelo de nuevo");
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
    mensajesDefault.add("Que luego no te arrepientas. Vuelve pronto a por tus antojos");
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


    
    //Admins por defecto
    new Admin(1, "Benito" , new Date_ex(1990,10,12), new Date_ex(2010,10,12), 4000000, "AdminBen", "1234");
    // Empleados por defecto
    new Waiter(2, "Paco", new Date_ex(2000,10,12), new Date_ex(2018,10,12), 1200000, 150,"123", "123");
    new Waiter(3, "Juancho", new Date_ex(2000,10,12), new Date_ex(2018,10,12), 1200000, 150,"321", "123");
    
  }
}