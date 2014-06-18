/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import vistas.PanelJuego;

/**
 *
 * @author Lean
 */
public class Honda {

    private PanelJuego game;
    int  x2 = 258, y2 = 352;
    
    public Honda(PanelJuego game) {
        this.game = game;
    }

    public void paint(Graphics2D g) {
        Toolkit t = Toolkit.getDefaultToolkit();

        /*Defino el ancho de la linea que seria la Goma de la Honda*/
        g.setStroke(new BasicStroke(8));

        /*Dibujo la Linea 1*/
        g.setColor(Color.decode("#2a1409"));
        g.drawLine(270, 353, x2, y2);

        /*Hona 1*/
        Image honda1 = t.getImage("honda1.png");
        g.drawImage(honda1, 255, 333, game);

        /*Dibujo la Linea 2*/
        g.setColor(Color.decode("#3f1e0e"));
        g.drawLine(245, 350, x2, y2);

        /*Dibujo el circulo*/
        g.setColor(Color.BLACK);
        g.fillOval(x2 - 6, y2 - 6, 12, 12);

        /*Honda 2*/
        Image honda2 = t.getImage("honda2.png");
        g.drawImage(honda2, 237, 329, game);
    }
}