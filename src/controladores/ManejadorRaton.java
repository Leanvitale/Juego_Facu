/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import modelos.Honda;
import vistas.PanelJuego;

/**
 *
 * @author Lean
 */
public class ManejadorRaton implements MouseListener, MouseMotionListener {

    private int x, y;
    private Honda honda;
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
        x = 258; 
        y = 352;
        honda.setMouseXY(x, y);
        honda.paint(g2d);
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
        honda.setMouseXY(x, y);
        honda.paint(g2d);
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

    public void setg2d(Graphics2D g2d, Honda honda) {
        this.g2d = g2d;
        this.honda = honda;

    }

}
