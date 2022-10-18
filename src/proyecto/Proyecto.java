/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.io.File;

/**
 *
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String path = "\\src\\proyecto\\data.csv";
        String raiz = new File("").getAbsolutePath();
        System.out.println(raiz + path);

        MainForm productos = new MainForm();
        productos.setVisible(true);
    }

}
