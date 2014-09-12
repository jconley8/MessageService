/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Josh Conley
 */
public class GuiOutput implements MessageOutput {

    @Override
    public void sendMessage(String message) {
        System.out.println("Outputting message to a GUI...");
        JOptionPane.showMessageDialog(null, message);
    }

}
