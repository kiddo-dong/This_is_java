package gpt.Lambda.exam11;

public class User {
    private String name;
    private int age;
    private boolean isActive;

   public User(String name, int age, boolean isActive) {
	   this.name = name;
	   this.age = age;
	   this.isActive = isActive;
   }
   
   public String getName() {return name;}
   public int getAge() {return age;}
   public boolean getIsActive() {return isActive;}
}
