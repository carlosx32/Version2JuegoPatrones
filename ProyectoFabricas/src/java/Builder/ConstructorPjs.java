/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author carandy
 */
public abstract class ConstructorPjs {
    protected Personajes pjs;

    public Personajes getPj() {
        return pjs;
    }  
    public abstract void ConstruirPj(Fabrica.FabricaPjAbs pja, int x, int y );
 }        
