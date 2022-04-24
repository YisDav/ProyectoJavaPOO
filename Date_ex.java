import java.time.*;
import java.time.LocalDate;
import java.time.format.*;

class Date_ex {
  //---- Atributes
  private int day, month, year;
  protected LocalDate fecha;
  //---- / Atributes

  
  //---- Constructor
  Date_ex(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;

    try{
      fecha = LocalDate.of(this.getYear(), this.getMonth(), this.getDay());
    }catch (DateTimeParseException e){ 
      System.out.println("ERROR | FECHA INCORRECTA");
    }
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
}