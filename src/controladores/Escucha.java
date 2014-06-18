/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import vistas.Menu;
import vistas.PanelJuego;
import vistas.PanelMenu;
import vistas.PanelOpciones;
import vistas.PanelRanking;

/**
 *
 * @author Lean
 */
public class Escucha implements ActionListener {

    JPanel panel;

    public Escucha() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String tipoBoton = e.getActionCommand();
        JButton b = (JButton) e.getSource();
        Menu framePrincipal = (Menu) SwingUtilities.getAncestorOfClass(Menu.class, b);
        switch (tipoBoton) {
            case "Jugar":
                framePrincipal.getContentPane().setVisible(false);
                framePrincipal.remove(framePrincipal.getContentPane());
                try {
                    panel = new PanelJuego();
                } catch (InterruptedException ex) {
                    System.out.println("Error");
                }

                panel.setLayout(null);
                framePrincipal.setContentPane(panel);
                break;
            case "Opciones":
                framePrincipal.getContentPane().setVisible(false);
                framePrincipal.remove(framePrincipal.getContentPane());
                panel = new PanelOpciones();
                panel.setLayout(null);
                framePrincipal.setContentPane(panel);
                break;
            case "Ranking":
                framePrincipal.getContentPane().setVisible(false);
                framePrincipal.remove(framePrincipal.getContentPane());
                panel = new PanelRanking();
                panel.setLayout(null);
                framePrincipal.setContentPane(panel);
                break;
            case "Volver Menu":
                framePrincipal.getContentPane().setVisible(false);
                framePrincipal.remove(framePrincipal.getContentPane());
                panel = new PanelMenu();
                panel.setLayout(null);
                framePrincipal.setContentPane(panel);
                break;
        }
    }

}
