/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan;

/**
 *
 * @author AdeSug
 */
public class Anjing extends Hewan{
    boolean statusSuntikRabies;
    
    public Anjing(boolean statusSuntikRabies){
        this.statusSuntikRabies = statusSuntikRabies;
    }
    
    @Override
    boolean status(boolean statusPenitipan){
        this.statusPenitipan = statusPenitipan;
        return true;
    }
    
}
