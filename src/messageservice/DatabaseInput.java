/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import java.util.Random;

/**
 *
 * @author Josh
 */
public class DatabaseInput implements MessageInput {

    FakeMessageDatabase db = new FakeMessageDatabase();
    private String message;

    @Override
    public String obtainMessage() {
        Random rand = new Random();
        int num = rand.nextInt(6);
        message = db.getRandomMessage(num);
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
