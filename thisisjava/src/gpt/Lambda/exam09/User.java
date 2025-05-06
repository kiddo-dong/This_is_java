package gpt.Lambda.exam09;

public class User {
    private String name;
    private String email;
    private int age;
    private String city;

    public User(String name, String email, int age, String city) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.city = city;
    }

    public String getName() {
    	return name;
    }
    
    public String getEmail() {
    	return email;
    }
    
    public int getAge() {
    	return age;
    }
    
    public String getCity() {
    	return city;
    }
}
