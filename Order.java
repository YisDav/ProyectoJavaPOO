import java.util.*;

public class Order {

  private ArrayList<Product> ListaProductos = new ArrayList<Product>();
  private double total_price = 0;
  private Client client;
  public boolean isDelivery = false;
  

  Order(Client client, boolean isDelivery) {
    this.client = client;
    this.isDelivery = isDelivery;
  }

  public ArrayList<Product> getListaProductos() {
    return ListaProductos;
  }
  
  public double get_preciototal(){
    return this.total_price;
  }
  
  public ArrayList<Product> addProduct (Product producto){
    ListaProductos.add(producto);
    this.total_price += producto.price;
    return ListaProductos;  
  }
  
  /*public void Facturar()
  {
    for(int indice = 0; indice < ListaProductos.size(); indice++) {
        Product myProduct = ListaProductos.get(indice);
        System.out.println(" * " + myProduct.name + " - " + Main.darFormatoDinero(myProduct.price));
    }
    if(this.isDelivery) 
    {
      String message = String.format("\tEstamos enviando tu pedido a la dirección: %s\n\tNúmero de teléfono al cual notificaremos: %s", client.getAddress(), client.getPhoneNumber());
      System.out.println(message);
    }
  }*/
}
