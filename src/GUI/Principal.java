/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.HeadlessException;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.MouseInputListener;

/**
 *
 * @author crist
 */
public class Principal extends JFrame{
    JTabbedPane tabs;
    PanelUsuario panel1;
    PanelOpciones panel2;
    
    public Principal() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Veterinaria MIA Pets");
        this.setResizable(false);
        addTabs();
        this.pack();
    }

    private void addTabs(){
        tabs=new JTabbedPane();
        PanelUsuario panel1=new PanelUsuario();
        panel2=new PanelOpciones();
        tabs.addTab("Agregar usuario nuevo", new PanelUsuario());
        tabs.addTab("Solicitar Servicio/Hacer una compra", new PanelOpciones());
        this.add(tabs);
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
}
