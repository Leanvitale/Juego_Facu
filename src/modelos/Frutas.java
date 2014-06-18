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
 * @author Lean
 */
public class Frutas {

    int x = 0;
    int y = 0;
    int xa = 1;
    int ya = 1;
    private PanelJuego game;

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
        Toolkit t = Toolkit.getDefaultToolkit();
        Image fruta = t.getImage("sandia.png");
        g.drawImage(fruta, x, y, game);
    }

}
