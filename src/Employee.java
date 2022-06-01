package src;
import java.time.*;
import java.util.ArrayList;

public class Employee extends Person {
  //---- Attributes
  private Date_ex birth_date, join_date;
  private double salary;
  private String login_userName, login_password;
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

  public String get_login_userName() {
    return this.login_userName;
  }

  public String get_login_password() {
    return this.login_password;
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

  public void set_login_userName(String login_userName) {
    this.login_userName = login_userName;
  }

  public void set_login_password(String login_password) {
    this.login_password = login_password;
  }
  //---- / Setter methods

  public static ArrayList<? extends Employee> getList() {
    ArrayList<Employee> fixedList = new ArrayList<>();
    for (Person cPerson : Person.getList()) {
      if(cPerson instanceof Employee) {
        Employee employee_ = (Employee) cPerson;
        fixedList.add(employee_);
      }
    }
    return fixedList;
  }

  public static Employee attemptToLogin(String user, String password) {
    Employee employee = null;
    int attempts = 0;

    do {
      attempts++;
      for(Employee employee_ : getList()) {
        String 
          login_userName = employee_.get_login_userName(),
          login_password = employee_.get_login_password();        
          if( login_userName.equals(user) && login_password.equals(password) ) return employee_;
      }
    } while ( attempts <= 3 && employee == null );

    return employee; 
  }

  //---- Other non-static methods
  // translated from Person class
  public String getAgeString() {
    Period edad = this.birth_date.getPeriodTillNow();
    return String.format("%d años, %d meses y %d días",edad.getYears(), edad.getMonths(), edad.getDays());
  }
  //---- / Other non-static methods
  
}