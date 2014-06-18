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
public class PanelMenu extends JPanel{
    
    JButton botonJugar, botonOpciones, botonRanking, botonCreditos;
    
          public PanelMenu(){
              Escucha eventos = new Escucha();
                    
              botonJugar = new JButton("Jugar");
              botonJugar.setBounds(500, 200, 150, 40);
              botonJugar.setFont(new Font("Arial", Font.PLAIN, 25));
              botonJugar.addActionListener(eventos);
              this.add(botonJugar);
              
              botonOpciones = new JButton("Opciones");
              botonOpciones.setBounds(340, 290, 170, 40);
              botonOpciones.setFont(new Font("Arial", Font.PLAIN, 25));
              botonOpciones.addActionListener(eventos);
              this.add(botonOpciones);
              
              botonRanking = new JButton("Ranking");
              botonRanking.setBounds(540, 370, 160, 40);
              botonRanking.setFont(new Font("Arial", Font.PLAIN, 25));
              botonRanking.addActionListener(eventos);
              this.add(botonRanking);
              
              botonCreditos = new JButton("Creditos");
              botonCreditos.setBounds(390, 460, 160, 40);
              botonCreditos.setFont(new Font("Arial", Font.PLAIN, 25));
              botonCreditos.addActionListener(eventos);
              this.add(botonCreditos);
              
          }

          @Override
          public void paintComponent(Graphics g){
              super.paintComponent(g);
              Graphics2D g2d = (Graphics2D) g;
              Toolkit t = Toolkit.getDefaultToolkit();
              
              /*Fondo del Menu*/
              Image fondo = t.getImage("FondoFinal.png");
              g2d.drawImage (fondo, 0, 0, this);
              /*Titulo "Flying Fruit"*/
              Image titulo = t.getImage("flying fruit.png");
              g2d.drawImage (titulo, 300, 40, this);
  
          }

}
