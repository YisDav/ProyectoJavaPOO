import java.util.*;
import java.text.DecimalFormat;

class Main 
{
  // ---------------------- ]     READERS     [ ---------------------- //
  public static Scanner stringReader = new Scanner(System.in);
  public static Scanner numbsReader = new Scanner(System.in);

  
  // ---------------------- ]   CONFIG    [ ----------------------//
  public static ArrayList<String> firstMenu_Options = new ArrayList<String>(), secondMenu_Options = new ArrayList<String>(), mensajesDefault = new ArrayList<String>();
  public static ArrayList<Integer> primerMenu_exit = new ArrayList<Integer>(), segundoMenu_exit = new ArrayList<Integer>();
  public static Order pedidoUsuario = new Order();

  // ---------------------- ]    MAIN    [ ---------------------- //
  public static void main(String[] args) 
  {
    // Creación de objetos y configuración de inicio (productos, menus, mensajes, etc.)
    defaultConfig();

    // Obtener nombre del usuario
    String name = askUserStr("¿Cómo te llamas?");

    // Ejecutar menús
    executeMenus(name);

    // Imprimir mensaje de despedida
    sysout(mensajesDefault.get(1));
  }


  // ----------------- ]   MENU FUNCTIONS   [ ----------------- //
  public static void executeMenus(String name) 
  {
    // Preguntar al usuario por la primera lista de opciones
    int opcionElegida_primerMenu = mostrarOpciones_primerMenu(name);

    // Opción 2 - pedido a domicilio
    if(opcionElegida_primerMenu == 2){
      String domicilio = askUserStr("Ingresa la dirección del domicilio: ");
      String phoneNumber = askUserStr("Ingresa el número de teléfono: ");
      pedidoUsuario.setDelivery(domicilio, phoneNumber);
    }
    else pedidoUsuario.unsetDelivery();
    
    // Ejecutar ciclo (repetir menú) hasta que se rompa manualmente
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
        if(pedidoUsuario.getListaProductos().size() == 0)
          sysout("Lo sentimos, no has seleccionado ningun producto aún.");
        else {
          imprimirFactura();
          break;
        }
        
      }

      // Si el usuario eligió un tipo de productos
      else {
        // Preguntar al usuario por el producto a elegir
        int opcionElegida_tercerMenu = mostrarOpciones_tercerMenu(opcionElegida_segundoMenu-1);

        // Obtenemos el objeto del producto que el usuario eligió
        Product productoElegido = getProductByID(opcionElegida_tercerMenu-1);
        sysout("\n ** Se ha añadido "+productoElegido.name+" a tu carrito. ¡Sigue satisfaciendo tus antojos! ** ");
        pedidoUsuario.addProduct(productoElegido);
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

  public static void imprimirFactura() {
    sysout(mensajesDefault.get(2)); // Mensaje de facturando...
    sysout("\n\n|---------------------------------------------------------------------|");
    sysout("|----------------------------- FACTURA -------------------------------|");
    sysout("|---------------------------------------------------------------------|");
    pedidoUsuario.Facturar();
    sysout("|---------------------------------------------------------------------|");
    sysout("| Precio total: "+ darFormatoDinero(pedidoUsuario.get_preciototal()));
    sysout("|---------------------------------------------------------------------|");
  }

  // Esta función retorna un string con la lista la lista de productos, a cada producto se le incluye el ID, nombre, precio, stock
  public static String getAllProductsByType_formated(int productType) 
  {
    String message = "";
    
    for(int i = 0; i < Product.getProductsCount(); i++) {
      Product product = getProductByID(i);
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


  // ---------------------- ]   UTILS   [ ---------------------- //  
  public static int askUserInt(String message) 
  {
    sysout(message);
    return numbsReader.nextInt();
  }
  
  public static double askUserDouble(String message) 
  {
    sysout(message);
    return numbsReader.nextDouble();
  }
  
  public static String askUserStr(String message) 
  {
    sysout(message);
    return stringReader.nextLine();
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

  public static Product getProductByID(int ID)  
  {
    return Product.getProductElementByID(ID);
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
  }
  
}