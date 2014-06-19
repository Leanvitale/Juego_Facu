/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import modelos.Frutas;
import modelos.Honda;
import vistas.PanelJuego;

/**
 *
 * @author Lean
 */
public class ManejadorRaton implements MouseListener, MouseMotionListener {

    private int x, y;
    private Honda honda;
    private Frutas fruta;
    private Graphics2D g2d;
    private PanelJuego gme;
    
    

    @Override
    public void mouseClicked(MouseEvent e) {
         
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
       honda.setAnimationON(1);
       fruta.setAnimationON(1);
    }
   
    
    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        fruta.setMouseXY(x, y);
        honda.setMouseXY(x, y);
        //System.out.println(""+x+";"+y);
        fruta.setImage("sandia.png");
        fruta.paint(g2d);
        //honda.paint(g2d);
        //fruta.paint(g2d);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        int sx = this.x;
        return sx;
    }

    public int getY() {
        int sy = this.y;
        return sy;
    }

    public void setg2d(Graphics2D g2d, Honda honda, Frutas fruta) {
        this.g2d = g2d;
        this.honda = honda;
        this.fruta = fruta;

    }

    
        

    
    
    
}
