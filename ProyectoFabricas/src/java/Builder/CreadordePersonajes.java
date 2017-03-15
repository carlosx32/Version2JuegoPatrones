/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Fabrica.FabricaPjAbs;

/**
 *
 * @author carandy
 */
public class CreadordePersonajes {
    private ConstructorPjs constructor;

    public void setConstructor(ConstructorPjs constructor) {
        this.constructor = constructor;
    }
    public Personajes getPersonajes(){
        return constructor.getPj();
    }
    public void ConstruirPj(FabricaPjAbs pj, int x, int y){
        constructor.ConstruirPj(pj, x, y);
    }    
}
