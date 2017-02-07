/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Emerson
 */
public interface ICarModelFactory {
    
    IRoda createRoda();
    
    ISom createSom();
    
    ITeto createTeto();
    
    ICarro createCarro();
    
    String toString();
}
