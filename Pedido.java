import java.util.*;

public class Pedido {

  private ArrayList<Producto> ListaProductos = new ArrayList<Producto>();
  private double precio_total=0;
  private boolean isDelivery = false;
  private String deliveryAddress = "";
  private String phoneNumber = "0";
  

  Pedido() {
    super();
  }

  public ArrayList<Producto> getListaProductos() {
    return ListaProductos;
  }
  
  public double get_preciototal(){
    return this.precio_total;
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
  
  public ArrayList<Producto> addProduct (Producto producto){
    ListaProductos.add(producto);
    this.precio_total += producto.price;
    return ListaProductos;  
  }

  public void setDelivery(String address, String phoneNumber) {
    this.isDelivery = true;
    this.deliveryAddress = address;
    this.phoneNumber = phoneNumber;
  }

  public void unsetDelivery() {
    this.isDelivery = false;
    this.deliveryAddress = "";
    this.phoneNumber = "0";
  }
  
  public void Facturar()
  {
    for(int indice = 0;indice<ListaProductos.size();indice++) {
        Producto myProduct = ListaProductos.get(indice);
        System.out.println(" * " + myProduct.name + " - " + Main.darFormatoDinero(myProduct.price));
    }
    if(this.isDelivery) 
    {
      String message = String.format("\tEstamos enviando tu pedido a la dirección: %s\n\tNúmero de teléfono al cual notificaremos: %s", this.deliveryAddress, this.phoneNumber);
      System.out.println(message);
    }
  }
}
