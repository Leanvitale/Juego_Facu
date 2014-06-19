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
    private String image="sandia.png";
    
    public Frutas(PanelJuego game) {
        this.game = game;
    }

    public void move() {
        if (x + xa < 0) {
            xa = 1;
        }
        if (x + xa > game.getWidth() - 30) {
            xa = -1;
        }
        if (y + ya < 0) {
            ya = 1;
        }
        if (y + ya > game.getHeight() - 30) {
            ya = -1;
        }

        x = x + xa;
        y = y + ya;
    }

    public void paint(Graphics2D g) {
        
        tm = new Timer(500, this);
        tm.start();
        Toolkit t = Toolkit.getDefaultToolkit();
        Image fruta = t.getImage(image);
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
                image="";
                this.on=0;
                tm.stop();
                
            }
            
            game.repaint();
            
        }
    }

    public void setImage(String image) {
        this.image = image;
    }

    
    

}
