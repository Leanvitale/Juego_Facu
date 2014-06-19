/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import vistas.PanelJuego;

/**
 * @author Lean
 */
public class Frutas implements ActionListener{

    int xa = 1;
    int ya = 1;
    private PanelJuego game;
    private int  x = 258, y = 352;
    private Graphics2D g2d;
    private int on;
    private Timer tm;

    public Frutas(PanelJuego game) {
        this.game = game;
    }

    public void paint(Graphics2D g) {
        tm = new Timer(400, this);
        tm.start();
        Toolkit t = Toolkit.getDefaultToolkit();
        Image fruta = t.getImage("sandia.png");
        g.drawImage(fruta, x-15, y-27, game);
        game.repaint();
    }
    
    public void setMouseXY(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public void setAnimationON(int on){
        this.on=on;
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.on==1){
            int deltaX = 258-x;
            int deltaY = 352-y;
            System.out.println("DetaX: "+deltaX);
            System.out.println("DeltaY: "+deltaY);
            int originX = x+deltaX;
            int originY = y+deltaY;
            System.out.println("OrigenX "+originX+", OrigenY "+originY);
            //x2=originX;
            //y2=originY;
            if(x<258){
                    x+=1;
            }
            if(y>352){
                    y-=1;
            }
            if(x>258){
                    x-=1;
            }
            if(y<352){
                    y+=1;
            }
            
            if(y==352 && x==258){
                this.on=0;
                tm.stop();
            }
            
            
            game.repaint();
            
        }
    }

}
