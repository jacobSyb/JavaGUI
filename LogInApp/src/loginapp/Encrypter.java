/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import javax.crypto.Cipher;
import javax.crypto.spec.*;

/**
 *
 * @author jakub
 */
public class Encrypter {
    private byte[] input;
    
    private byte[] keyBytes;
    private byte[] ivBytes;
    
    public Encrypter(String input){
        this.input = input.getBytes();
        
        SecretKeySpec key = new SecretKeySpec(keyBytes,"DES");
        IvParameterSpec ivSpec = new IvParameterSpec(ivBytes);
        
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
    }
    
    
}
