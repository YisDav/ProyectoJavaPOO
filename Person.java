import java.util.ArrayList;

public abstract class Person {
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
  

  public ArrayList<Person> addToList() throws RuntimeException {
    if(this.active == 0 || this.active == 1) {
      for(Person cPerson : list) {
        if(cPerson.equals(this)) {
          String message = String.format("Cannot add to a list because %s (ID_ex: %d) is alredy added as the same class (or eliminated). Class registrated: %s - Re-trying class: %s", this.fullName, this.ID_ex, cPerson.getClass().getName(), this.getClass().getName());
          throw new RuntimeException(message);
        }
      }
    }
    
    this.active = 1;
    list.add(this);
    return list;
  }

  public Person softDelete() {
    this.active = 0;
    list.remove(this);
    return this;
  }

  public Person revertSoftDelete() {
    this.active = 1;
    list.add(this);
    return this;
  }

  public int setID(int ID) {
    this.ID = ID;
    return this.ID;
  }
  

}