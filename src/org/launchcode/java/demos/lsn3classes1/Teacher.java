package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
  private String firstName;
  private String lastName;
  private String subject;
  private int yearsTeaching;

  public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.subject = subject;
    this.yearsTeaching = yearsTeaching;
  }

  private String getFirstName(){
    return firstName;
  }
  protected void setFirstName(String aFirstName){
    this.firstName = aFirstName;
  }
  private String getLastName(){
    return lastName;
  }
  protected void setLastName(String aLastName){
    this.lastName = aLastName;
  }
  private String getSubject(){
    return subject;
  }
  protected void setSubject(String aSubject){
    this.subject = aSubject;
  }
  private int getYearsTeaching(){
    return yearsTeaching;
  }
  protected void setYearsTeaching(int aYearsTeaching){
    this.yearsTeaching = aYearsTeaching;
  }
}
