/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import java.util.Scanner;

/**
 *
 * @author Josh Conley
 */
public class KeyboardInput implements MessageInput {

    Scanner keyboard = new Scanner(System.in);
    private String message;

    @Override
    public String obtainMessage() {
        System.out.println("Please enter a message from the keyboard: ");
        setMessage(keyboard.nextLine());
        return message;
    }


    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

}
