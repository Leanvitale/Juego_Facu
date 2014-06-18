/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas;

import controladores.Escucha;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Lean
 */
public class PanelOpciones extends JPanel{
    JButton botonVolver;
        /*Constructor*/
        public PanelOpciones(){
            botonVolver = new JButton("Volver Menu");
            botonVolver.setBounds(20, 530, 120, 30);
            botonVolver.setFont(new Font("Arial", Font.PLAIN, 15));
            botonVolver.addActionListener(new Escucha());
            this.add(botonVolver);
        }
    
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            Toolkit t = Toolkit.getDefaultToolkit();
            
            Image fondo = t.getImage("fondoOpciones.png");
            g2d.drawImage(fondo, 0, 0, this);
        }
        
    }
