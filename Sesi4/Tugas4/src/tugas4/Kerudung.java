/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author HP
 */

class Kerudung {
   
    public void deskripsi() {
        System.out.println("Ini adalah macam-macam kerudung.");
    }
    
    // Metode overloading
    public void deskripsi(String jenis) {
        System.out.println("Ini adalah sebuah " + jenis + ".");
    }
}

class Hijab {
    public static void main(String[] args) {
        Kerudung model1 = new Kerudung();
        Kerudung model2 = new Kerudung();
        Kerudung model3 = new Kerudung();
       
        model1.deskripsi("Bergo"); 
        model2.deskripsi("SegiEmpat");
        model3.deskripsi("Pasmina");
    }
}
