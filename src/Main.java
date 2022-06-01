package src;
import java.util.*;

import src.View.*;

import java.text.DecimalFormat;

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
  
  public static String darFormatoDinero(double dinero) {
    String price = DecimalFormat.getCurrencyInstance(Locale.US).format(Math.round(dinero));
    return price;
  }

  // ----------- ]   DEFAULT COFIG AND OBJECTS   [ ----------- //
  public static void defaultConfig() 
  {
    //Default products
    // Producto(String name, int type, String description, double price, int stock)
new Product("Hamburguesa sencilla", 2, "carne de 90gr, lechuga, tomate, cebolla, queso mozarela, huevo de codorniz y tocino", 9000, 5);
new Product("Hamburguesa especial", 2, "carne de 120gr, lechuga, tomate, cebolla, queso mozarela, huevo de codorniz, carne o pollo desmechado y tocino", 11000, 5);
new Product("Salchipapa",2, "Papa, salchica y chorizo", 6000, 10);
new Product("Salchipapa super",2, "Papa, salchica, chorizo, pollo y carne desmechada", 8500, 10);
new Product("Pizza",2, "Mixta (pollo, carne y champiñón), 5000", 6000, 14);
new Product("Hot Dog",2, "Chorizo, papa fosforito, cebolla, queso y tocino", 4500, 10);
new Product("Arepa rellena",2, "Pollo o carne", 4500, 10);
new Product("Arepa rellena",2, "Mixta", 5000, 10);
new Product("Arepa con chorizo",2, "Arepa y chorizo", 4000, 10);
new Product("Ensalada",2, "Tomate. cebolla, maiz tierno, lechuga y aguacate", 3000, 10);

new Product("Gaseosa 250ml",0, "Refrescante", 3500, 20);
new Product("Gaseosa 1.5L",0, "Refrescante", 4500, 20);
new Product("Gaseosa 3L",0, "Refrescante", 6000, 20);
new Product("Jugo natural",0, "En agua", 2500, 20);
new Product("Jugo natural",0, "En leche", 3000, 20);
new Product("Cerveza",0, "Espumoza", 3800, 20);
new Product("Agua",0, "Natural", 2500, 20);
new Product("Té",0, "De limon o durazno", 3500, 20);

new Product("Cheesecake Maracuya",1, "Cheesecake de textura suave, una base de galletas  y delicada crema de maracuyá.", 4500, 10);
new Product("Tiramissú",1, "Postre al frio humedecido en café, capas suave a base de queso crema y cocoa.", 4500, 10);
new Product("Milhoja",1, "Rellenas de crema pastelera y cubierta de chocolate.", 4500, 10);
new Product("Pastel tres leches",1, "Dulce y suave", 2500, 20);
new Product("Cheesecake",1, "Limon, mora, maracuyá o lulo", 4000, 20);
new Product("Torta de chocolate",1, "Con relleno de arequipe", 12000, 20);
new Product("Fresas con crema",1, "Frescas y deliciosas", 12000, 20);

    //Admins por defecto
new Admin(1, "Benito" , new Date_ex(1990,10,12), new Date_ex(2010,10,12), 4000000, "AdminBen", "1234");
new Admin(2, "Bruce" , new Date_ex(1985,10,12), new Date_ex(2020,11,13), 4000000, "AdminBen", "1234");
new Admin(3, "Claudia" , new Date_ex(1995,10,12), new Date_ex(2019,8,16), 4000000, "AdminBen", "1234");
    
    // Empleados por defecto
new Waiter(4, "Paco", new Date_ex(2000,10,12), new Date_ex(2018,10,12), 1200000, 150,"123", "123");
new Waiter(5, "Juancho", new Date_ex(2000,10,12), new Date_ex(2018,10,12), 1200000, 150,"123", "123"); 
new Waiter(6, "Fico", new Date_ex(1974,9,28), new Date_ex(2022,5,29), 1200000, 150,"123", "123");    
new Waiter(7, "Rodolfo", new Date_ex(1945,3,26), new Date_ex(2022,5,31), 1200000, 150,"123", "123");  
new Waiter(8, "Petro", new Date_ex(1960,4,19), new Date_ex(2022,5,31), 1200000, 150,"123", "123");  
new Waiter(9, "Milton", new Date_ex(1969,9,18), new Date_ex(2022,5,29), 1200000, 150,"1porciento", "1porciento");

  }
}