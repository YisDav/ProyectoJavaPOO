class Person {
  private int ID;
  public String name, lastName;
  
  Person(int ID, String name, String lastName) {
    this.ID = ID;
    this.name = name;
    this.lastName = lastName;
  }

  //---- Getters
  public int getID() {
    return this.ID;
  }
  //---- / Getters
  
  //---- Setters
  public int setID(int ID) {
    this.ID = ID;
    return this.ID;
  }
  //---- / Setters
}