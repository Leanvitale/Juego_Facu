/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.Escucha;
import controladores.ManejadorRaton;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelos.Frutas;
import modelos.Hipopotamos;
import modelos.Honda;

/**
 *
 * @author Lean
 */
public final class PanelJuego extends JPanel {

    JButton botonVolver, botonEmpezar;
    Frutas fruta = new Frutas(this);
    Honda honda = new Honda(this);
    Hipopotamos hipo = new Hipopotamos(this);
    int x, y, xa = 1, ya = 1;
    /*Constructor de la clase PanelJuego*/
    private ManejadorRaton manejar;

    public PanelJuego() throws InterruptedException {

        manejar = new ManejadorRaton();
        this.addMouseListener(manejar);
        this.addMouseMotionListener(manejar);

        botonVolver = new JButton("Volver Menu");
        botonVolver.setBounds(20, 530, 120, 30);
        botonVolver.setFont(new Font("Arial", Font.PLAIN, 15));
        botonVolver.addActionListener(new Escucha());
        this.add(botonVolver);
 
    }

    public void move() {
        fruta.move();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Toolkit t = Toolkit.getDefaultToolkit();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Image imagen = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics cosa = imagen.getGraphics();
        Image fondo = t.getImage("fondo.png");
        cosa.drawImage(fondo, 0, 0, this);
        g2d.drawImage(imagen, 0, 0, this);
       
        //honda.paint(g2d);
       
            manejar.setg2d(g2d,honda, fruta);
            honda.pain1(g2d);
            fruta.paint(g2d);
            honda.paint(g2d);
            hipo.paint(g2d);
            
        
    }
    
    

}
