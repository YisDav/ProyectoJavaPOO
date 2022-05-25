import java.time.*;

class Date_ex {
  //---- Attributes
  private int day, month, year;
  protected LocalDate fecha;
  //---- / Attributes

  
  //---- Constructor
  Date_ex(int year, int month, int day) {    
    this.day = day;
    this.month = month;
    this.year = year;
    this.fecha = LocalDate.of(year, month, day);
  }
  //---- / Constructor
  

  //---- Getter methods
  public int getDay() {
    return this.day;
  }
  
  public int getMonth() {
    return this.month;
  }
  
  public int getYear() {
    return this.year;
  }
  //---- / Getter methods

  
  //---- Setter methods
  public void setDay(int day) {
    this.day = day;
  }
  
  public void setMonth(int month) {
    this.month = month;
  }
  
  public void setYear(int year) {
    this.year = year;
  }
  //---- / Setter methods


  //---- Other non-static methods
  public Period getPeriodTillNow() {
    return Period.between(this.fecha, dateNow());
  }
  //---- / Other non-static methods

  
  //---- Other static methods
  public static Date_ex askUserDate(String message) {

    Utils.sysout(message);
    
    int day = 0, month = 0, year = 0;
    boolean validDate = true;

    do {
      if(!validDate)
        Utils.sysout("Lo sentimos, esta fecha es invalida");
      
      day = Main.askUserInt("Día: ");
      month = Main.askUserInt("Mes: ");
      year = Main.askUserInt("Año: ");

      validDate = validateDate(year, month, day);
    }
    while(!validDate);

    return new Date_ex(year, month, day);
  }
  
  public static boolean validateDate(int year, int month, int day) {
    boolean isValid = true;
    try {
      LocalDate.of(year, month, day);
    }
    catch (Exception e) {
      isValid = false;
    }
    return isValid;
  }

  public static LocalDate dateNow() {
    return LocalDate.now();
  }
  
}