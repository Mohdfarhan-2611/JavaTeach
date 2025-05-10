package org.example.OOPs.Encapsulation;

public class Encap {

    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
          if(username.equals("admin")) {
              this.username = username;
          }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        Encap obj = new Encap();
        obj.setUsername("Farhan@gmai.com");
        System.out.println(obj.getUsername());





    }

}
