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
public interface MessageInput {
    
    public abstract String obtainMessage();
    public abstract String getMessage();
    public abstract void setMessage(String message);
}
