/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronproxy;

/**
 *
 * @author diego
 */
public class PatronProxy {

    public static void main(String[] args) {
         // Crear un objeto ProxyImage
        Image image = new ProxyImage("test.jpg");

        // La imagen real se cargará solo cuando se llame al método display()
        image.display();

        // La imagen real no se volverá a cargar en llamadas posteriores al método display()
        image.display();

    }
}
