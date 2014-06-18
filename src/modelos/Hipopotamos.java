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
import vistas.PanelJuego;

/**
 *
 * @author Lean
 */
public class Hipopotamos {
    
    private PanelJuego game;

    public Hipopotamos(PanelJuego game) {
        this.game = game;
    }
    
    public void paint(Graphics2D g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        
         /*hipopotamoAzul*/
        Image hipopotamoAzul = t.getImage("hipopotamoAzul.png");
        g.drawImage(hipopotamoAzul, 670, 406, game);

        /*hipopotamoVerde*/
        Image hipopotamoVerde = t.getImage("hipopotamoVerde.png");
        g.drawImage(hipopotamoVerde, 815, 319, game);
    }
    
}
