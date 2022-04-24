import java.time.LocalDate;
import java.time.Period;

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

    //---- Other methods

  public String calculateAge(int[] born){
    
    LocalDate fechaNow = LocalDate.now();

    int 
    day = born[0],
    month = born[1],
    year = born[2];
    
    Period edad = Period.between(LocalDate.of(year, month, day), fechaNow);

    return String.format("%d años, %d meses y %d días",edad.getYears(), edad.getMonths(), edad.getDays());
  }

  //---- / Other methods

}