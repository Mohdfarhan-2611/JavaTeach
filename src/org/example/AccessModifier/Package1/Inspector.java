package org.example.AccessModifier.Package1;

public class Inspector {

      int gun;
      void useGun(){
         System.out.println("Inspector can use the gun");
     }

    public static void main(String[] args) {
        Inspector inspector = new Inspector();
        inspector.gun=20;
        inspector.useGun();



    }
}
