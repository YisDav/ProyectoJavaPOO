import java.util.*;

public class Order {

  private ArrayList<Product> ListaProductos = new ArrayList<Product>();
  private double total_price = 0;
  private boolean isDelivery = false;
  private String deliveryAddress = "";
  private String phoneNumber = "0";
  

  Order() {
    super();
  }

  public ArrayList<Product> getListaProductos() {
    return ListaProductos;
  }
  
  public double get_preciototal(){
    return this.total_price;
  }

  public boolean isDelivery() {
    return this.isDelivery;
  }

  public String getDeliveryAddress() {
    if(this.isDelivery) return this.deliveryAddress;
    else return null;
  }

  public String getPhoneNumber() {
    if(this.isDelivery) return this.phoneNumber;
    else return null;
  }
  
  public ArrayList<Product> addProduct (Product producto){
    ListaProductos.add(producto);
    this.total_price += producto.price;
    return ListaProductos;  
  }
  
  public void Facturar()
  {
    for(int indice = 0;indice<ListaProductos.size();indice++) {
        Product myProduct = ListaProductos.get(indice);
        System.out.println(" * " + myProduct.name + " - " + Main.darFormatoDinero(myProduct.price));
    }
    if(this.isDelivery) 
    {
      String message = String.format("\tEstamos enviando tu pedido a la dirección: %s\n\tNúmero de teléfono al cual notificaremos: %s", this.deliveryAddress, this.phoneNumber);
      System.out.println(message);
    }
  }
}
