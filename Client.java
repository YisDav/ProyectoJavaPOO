class Client extends Person {
  //---- Atributes
  private String address;
  private long phoneNumber;
  //---- / Atributes
  

  //---- Constructor
  Client(int ID, String name, String lastName, String address, long phoneNumber) {
    super(ID, name, lastName);
    this.address = address;
    this.phoneNumber = phoneNumber;    
  }
  //---- / Constructor

  
  //---- Getter methods
  public String getAddress() {
    return this.address;
  }
  
  public long getPhoneNumber() {
    return this.phoneNumber;
  }
  //---- / Getter methods

  
  //---- Setter methods
  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  //---- / Setter methods
}