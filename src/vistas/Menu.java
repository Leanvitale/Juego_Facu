/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas;

import javax.swing.JFrame;

/**
 *
 * @author Lean
 */
public class Menu extends JFrame{
          public Menu(){
              
              setContentPane(new PanelMenu());
              
              setSize(1100, 600);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setTitle("Fliying Fruit");
              setResizable(false);
              setLocationRelativeTo(null);
              setLayout(null);
              setVisible(true);  
          }

}