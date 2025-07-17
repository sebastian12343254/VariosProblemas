/**
 * Marvin Sebastian Diaz Patiño
 * Internship 
 * 16/07/2025  
 */

package com.internship;

import javax.swing.SwingUtilities;

public class App {
    public static void main( String[] args ){
          SwingUtilities.invokeLater(() -> {
            UI ventana = new UI();
            ventana.setVisible(true);
        });
    }
}
