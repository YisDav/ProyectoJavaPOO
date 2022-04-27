import java.time.*;

class Employee extends Person {
  //---- Attributes
  private Date_ex birth_date, join_date;
  double salary;
  protected String login_userName, login_password;
  //---- / Attributes
  

  //---- Constructor
  Employee(int ID, String fullName, Date_ex birth_date, Date_ex join_date, double salary, String login_userName, String login_password) {
    super(ID, fullName);
    this.birth_date = birth_date;
    this.join_date = join_date;
    this.salary = salary;
    this.login_userName = login_userName;
    this.login_password = login_password;
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


  //---- Other non-static methods
  // translated from Person class
  public String getAgeString(int[] born) {
    Period edad = this.birth_date.getPeriodTillNow();
    return String.format("%d años, %d meses y %d días",edad.getYears(), edad.getMonths(), edad.getDays());
  }
  //---- / Other non-static methods
  
}