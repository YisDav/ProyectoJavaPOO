class Person {
  private int ID;
  public String fullName;
  
  Person(int ID, String fullName) {
    this.ID = ID;
    this.fullName = fullName;
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