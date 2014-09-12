/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author Josh
 */
public class StartUp {
    public static void main(String[] args) {
        
        MessageService msg = new MessageService();
        msg.setInput(KeyboardInput);
    }
}
