/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import vistas.PanelJuego;

/**
 * @author Lean
 */
public class Frutas {

    private PanelJuego game;
    private int  x = 258, y = 352;
    private Graphics2D g2d;

    public Frutas(PanelJuego game) {
        this.game = game;
    }

    public void paint(Graphics2D g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image fruta = t.getImage("sandia.png");
        g.drawImage(fruta, x-15, y-27, game);
        game.repaint();
    }
    
    public void setMouseXY(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

}
