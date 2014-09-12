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
        MessageInput input = new DatabaseInput();
        MessageOutput output = new GuiOutput();
        
        MessageService msg = new MessageService(input, output);
        
       msg.processMessage();
        
    }
}
