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
public class FakeMessageDatabase {
    private String messages[] = {"Welcome!",
                                "Hello World",
                                "Java Rocks!",
                                "Hello Java Class",
                                "Have a good day!",
                                "Good Morning!",
                                "Knock knock..."};

    public String getRandomMessage(int randomNumber) {
        return messages[randomNumber];
    }
    
    
}
