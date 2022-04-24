class Employee extends Person {
  //---- Attributes
  private Date_ex birth_date, join_date;
  double salary;
  //---- / Attributes
  

  //---- Constructor
  Employee(int ID, String fullName, Date_ex birth_date, Date_ex join_date, double salary) {
    super(ID, fullName);
    this.birth_date = birth_date;
    this.join_date = join_date;
    this.salary = salary;
  }
  //---- / Constructor

  
  //---- Getter methods
  public Date_ex getBirthDate() {
    return this.birth_date;
  }
  
  public Date_ex getJoinDate() {
    return this.join_date;
  }

  public double getSalary() {
    return this.salary;
  }
  //---- / Getter methods

  
  //---- Setter methods
  public void setBirthDate(Date_ex birth_date) {
    this.birth_date = birth_date;
  }
  
  public void setJoinDate(Date_ex join_date) {
    this.join_date = join_date;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
  //---- / Setter methods
  
}