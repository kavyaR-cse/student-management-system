public class Student {
  private int ID;
  private String name;
  private int age;

public Student(int ID,String name,int age) {
  this.id=id;
  this.name=name;
  this.age=age;
}
  public int getID() {
    return id;
  }
  public String toString() {
    return "ID:" +id+ "Name:" +name+ "Age:" +age;
  }
}
