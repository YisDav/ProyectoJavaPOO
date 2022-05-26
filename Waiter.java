
import java.util.ArrayList;

import javax.management.RuntimeErrorException;


class Waiter extends Employee {
  //---- Attributes
  private double baksheesh;
  //---- / Attributes
  

  //---- Constructor
  Waiter(int ID, String fullName, Date_ex birth_date, Date_ex join_date, double salary, double baksheesh, String login_userName, String login_password) {
    super(ID, fullName, birth_date, join_date, salary, login_userName,login_password);
    this.baksheesh = baksheesh;
  }
  //---- / Constructor

  
  //---- Getter methods
  public double getBaksheesh() {
    return this.baksheesh;
  }
  
  public static ArrayList<Waiter> getList() {
    ArrayList<Waiter> fixedList = new ArrayList<>();
    for (Person cPerson : Person.getList()) {
      if(cPerson instanceof Waiter) {
        Waiter cAdmin = (Waiter) cPerson;
        fixedList.add(cAdmin);
      }
    }
    return fixedList;
  }
  //---- / Getter methods

  
  //---- Setter methods
  public void setBaksheesh(double baksheesh) {
    this.baksheesh = baksheesh;
  }
  //---- / Setter methods


  public static Waiter getWaiterElementByID(int ID) {
    for (Waiter waiter : getList()) {
      if(waiter.getID() == ID) {
        return waiter;
      }
    }
    String message = String.format("No Waiter with ID: %d was found", ID);
    throw new RuntimeException(message);
  }

  public static Waiter getWaiterElementByInputID(String message) {
    int waiterID; Waiter waiterElement = null; boolean validID = true;
    
    do {
      waiterID = Main.askUserInt(message);
      try {
        waiterElement = getWaiterElementByID(waiterID);
        String name = waiterElement.fullName; // only for test
        validID = true;
      }
      catch(Exception e) {
        validID = false;
        System.out.println("Lo sentimos, el empleado con el ID "+waiterID+" no pudo ser encontrado");
      }

    } while(!validID);

    return waiterElement;
  }
}