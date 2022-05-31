package com.Aswath;

class Userdata{
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }
    public void setUsername (String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (password != " "){
            this.password = password;
        }
    }
}


public class encapsulation {
    public static void main(String[] args) {
    Userdata obj = new Userdata();
    obj.setUsername ("Aswath");
    obj.setPassword ("Aswath@123");
System.out.println(obj.getUsername());
System.out.println(obj.getPassword());
    }
}
