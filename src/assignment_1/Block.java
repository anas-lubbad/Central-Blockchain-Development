/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

import java.util.Date;

/**
 *
 * @author Anas
 */
public class Block {

    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;
    private int nonce;
   
    // Constructor 
    public Block(String data, String previousHash)
    {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

   
    // calculate the hash
    public String calculateHash()
    {
        String calculatedhash = crypt.cryption(previousHash + Long.toString(timeStamp) + data);
        return calculatedhash;
    }
    
    
    // Mine Block
    public String mineBlock(int mine) {
        String mineString = new String(new char[mine]).replace('\0', '0');
        while (!hash.substring(0, mine).equals(mineString)) {
            nonce++;
            hash = calculateHash();
        }
        return hash;
    }
    
    // Getter Block
    public String getBlock() {
        return hash = calculateHash();
    }
    
    // Getter Block
    public void setBlock(String newHash) {
         this.hash = newHash;
    }
        
    Block() {
        //To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet.");
    }
}