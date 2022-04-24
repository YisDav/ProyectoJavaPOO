class Waiter extends Employee {
  //---- Atributes
  private double baksheesh;
  //---- / Atributes
  

  //---- Constructor
  Waiter(int ID, String fullName, Date_ex birth_date, Date_ex join_date, double salary, double baksheesh) {
    super(ID, fullName, birth_date, join_date, salary);
    this.baksheesh = baksheesh;
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
}