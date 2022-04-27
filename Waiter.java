
import java.util.ArrayList;


class Waiter extends Employee {
  //---- Attributes
  private double baksheesh;
  static ArrayList<Waiter> waiterList = new ArrayList<Waiter>();
  //---- / Attributes
  

  //---- Constructor
  Waiter(int ID, String fullName, Date_ex birth_date, Date_ex join_date, double salary, double baksheesh, String login_userName, String login_password) {
    super(ID, fullName, birth_date, join_date, salary, login_userName,login_password);
    this.baksheesh = baksheesh;

    waiterList.add(this);
  }
  //---- / Constructor

  
  //---- Getter methods
  public double getBaksheesh() {
    return this.baksheesh;
  }
  //---- / Getter methods

  
  //---- Setter methods
  public void setBaksheesh(double baksheesh) {
    this.baksheesh = baksheesh;
  }
  //---- / Setter methods


  public static Waiter getWaiterElementByID(int ID) {
    Waiter actual;
    for(int i = 0; i < waiterList.size(); i++) {
      actual = waiterList.get(i);
      if(actual.getID() == ID) {
        return actual;
      }
    }
    return null;
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
        Main.sysout("Lo sentimos, el empleado con el ID "+waiterID+" no pudo ser encontrado");
      }

    } while(!validID);

    return waiterElement;
  }
}