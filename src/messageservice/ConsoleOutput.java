/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author Josh Conley
 */
public class ConsoleOutput implements MessageOutput {

    
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

}
