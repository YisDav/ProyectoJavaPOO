package src;
import java.text.*;
import java.time.*;
import java.util.*;

public class Date_ex {
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

  public String toString () {
    return String.format("%d/%d/%d", this.day, this.month, this.year);
  }


  //---- Other non-static methods
  public Period getPeriodTillNow() {
    return Period.between(this.fecha, dateNow());
  }
  //---- / Other non-static methods

  public static LocalDate dateNow() {
    return LocalDate.now();
  }

  public static String getTodayDateTime() {
    LocalDateTime now = LocalDateTime.now();

    SimpleDateFormat date = new SimpleDateFormat("dd/MMMM/yyyy ");
    SimpleDateFormat datetime = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
    String unfomattedDate = date.format(Calendar.getInstance().getTime());
    String time_unf = datetime.format(Calendar.getInstance().getTime());
    String[] date_f = unfomattedDate.split("/");
    
    String response = String.format("%s del de mes %s de %s - %s", date_f[0], date_f[1], date_f[2], time_unf);
    return response;
  }
  
}