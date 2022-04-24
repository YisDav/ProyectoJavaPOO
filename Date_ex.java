import java.time.*;
import java.time.LocalDate;
import java.time.format.*;

class Date_ex {
  //---- Atributes
  private int day, month, year;
  protected LocalDate fecha;
  //---- / Atributes

  
  //---- Constructor
  Date_ex(int year, int month, int day) {
    boolean isValidDate = validateDate(year, month, day);
    if(!isValidDate) {
      int[] validDate = askUserDate("Lo sentimos, fecha inválida");
      day = validDate[0];
      month = validDate[1];
      year = validDate[2];
    }
    
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

  
  //---- Other methods
  public static int[] askUserDate(String message) {

    Main.sysout(message);
    
    int day = 0, month = 0, year = 0;
    boolean validDate = true;

    do {
      if(!validDate)
        Main.sysout("Lo sentimos, esta fecha es invalida");
      
      day = Main.askUserInt("Día: ");
      month = Main.askUserInt("Mes: ");
      year = Main.askUserInt("Año: ");
    }
    while(!validDate);

    return new int[]{ day, month, year };
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
  
}