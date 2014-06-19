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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import vistas.PanelJuego;

/**
 *
 * @author Lean
 */
public class Honda implements ActionListener{

    private PanelJuego game;
    private int  x2 = 258, y2 = 352;
    private Graphics2D g2d;
    private Timer tm;
    private int on;
    
    public Honda(PanelJuego game) {
        this.game = game;
    }

    public void paint(Graphics2D g) {
        //nuevas posiciones onRelease del mouse
        tm = new Timer(500, this);
        tm.start();
        
        //System.out.println(""+x2+","+y2);
        
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
        
        game.repaint();
        
    }
    
    public void pain1 (Graphics2D g){
        Toolkit t = Toolkit.getDefaultToolkit();

        /*Defino el ancho de la linea que seria la Goma de la Honda*/
        g.setStroke(new BasicStroke(8));

        /*Dibujo la Linea 1*/
        g.setColor(Color.decode("#2a1409"));
        g.drawLine(270, 353, x2, y2);

        /*Hona 1*/
        Image honda1 = t.getImage("honda1.png");
        g.drawImage(honda1, 255, 333, game);
        
        game.repaint();
    }
    
    public void setMouseXY(int newX, int newY){
        this.x2 = newX;
        this.y2 = newY;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.on==1){
            int deltaX = 258-x2;
            int deltaY = 352-y2;
            System.out.println("DeltaX: "+deltaX);
            System.out.println("DeltaY: "+deltaY);
            int originX = x2+deltaX;
            int originY = y2+deltaY;
            System.out.println("OrigenX "+originX+", OrigenY "+originY);
            //x2=originX;
            //y2=originY;
            if(x2<258){
                    x2+=1;
                    
            }
            if(y2>352){
                    y2-=1;
            }
            if(x2>258){
                    x2-=1;
            }
            if(y2<352){
                    y2+=1;
            }
            
            if(y2==352 && x2==258){
                this.on=0;
                tm.stop();
            }
            
            
            game.repaint();
            
        }
    }
    
    public void setAnimationON(int on){
        this.on=on;
    }

    

   

}
