/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

/**
 *
 * @author HP
 */

//overriding
class Kerudung {
   
    public void deskripsi() {
        System.out.println("Ini adalah macam-macam kerudung.");
    }
}


class Bergo extends Kerudung {
    @Override
    public void deskripsi() {
        System.out.println("Ini adalah sebuah Bergo.");
    }
}


class SegiEmpat extends Kerudung {
    @Override
    public void deskripsi() {
        System.out.println("Ini adalah sebuah SegiEmpat.");
    }
}


class Pasmina extends Kerudung {
    @Override
    public void deskripsi() {
        System.out.println("Ini adalah sebuah Pasmina.");
    }
}

public class Hijab {
    public static void main(String[] args) {
        Kerudung model1 = new Bergo();
        Kerudung model2 = new SegiEmpat();
        Kerudung model3 = new Pasmina();
        
        model1.deskripsi(); 
        model2.deskripsi();
        model3.deskripsi(); 
    }
}
