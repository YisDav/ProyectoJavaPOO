package src;
import java.util.ArrayList;

public abstract class Person implements Listable {
  private int ID, ID_ex;
  public String fullName;
  private int active = -1; // 0 : false ; 1 : true ; Others (-1) : undefined 

  private static int lastID = -1;
  private static ArrayList<Person> list = new ArrayList<>();
  
  Person(int ID, String fullName) {
    this.ID = ID;
    this.fullName = fullName;
    this.addToList();
    //
    lastID++;
    this.ID_ex = lastID;
  }

  //---- Getters
  public int getID() {
    return this.ID;
  }

  public int getID_ex() {
    return this.ID_ex;
  }

  public static ArrayList<? extends Person> getList() {
    ArrayList<Person> fixed_list = new ArrayList<>();
    for(Person person : list) {
      if(person.active == 1) fixed_list.add(person);
    }
    return fixed_list;
  }
  

  //---- / Getters
  
  //---- Setters
  
  @Override
  public void addToList() {
    if(this.active == 0 || this.active == 1) {
      for(Person cPerson : list) {
        if(cPerson.equals(this)) {
          if(cPerson.active == 1) {
            String message = String.format("Cannot add to a list because %s (ID_ex: %d) is alredy added as the same class (or eliminated). Class registrated: %s - Re-trying class: %s", this.fullName, this.ID_ex, cPerson.getClass().getName(), this.getClass().getName());
            throw new RuntimeException(message);
          }
          else if(cPerson.active == 0) {
            throw new RuntimeException("You first have to revert the soft delete.");
          }
        }
      }
    }
    
    this.active = 1;
    list.add(this);
  }

  @Override
  public Person softDelete() {
    this.active = 0;
    return this;
  }

  @Override
  public Person revertSoftDelete() {
    this.active = 1;
    return this;
  }

  public int setID(int ID) {
    this.ID = ID;
    return this.ID;
  }
  

}