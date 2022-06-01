import java.util.*;
import java.text.DecimalFormat;
import View.*;

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
  // ---------------------- ]    MAIN    [ ---------------------- //
  public static void main(String[] args) 
  {
    // Creación de objetos y configuración de inicio (productos, menus, mensajes, etc.)
    defaultConfig();
    
    iniWindow ventana = new iniWindow();
    ventana.show();
  }


  // ----------------- ]   MENU FUNCTIONS   [ ----------------- //

  /*public static void imprimirFactura(Order clientOrder) {
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
  }*/
  
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


  // ----------- ]   DEFAULT COFIG AND OBJECTS   [ ----------- //
  public static void defaultConfig() 
  {
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