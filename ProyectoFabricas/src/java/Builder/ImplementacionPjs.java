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
public class ImplementacionPjs extends ConstructorPjs{
    
   
    @Override
    public void ConstruirPj(FabricaPjAbs pja, int x, int y  ) {
            if(this.pjs==null){
                this.pjs=new Personajes();
            }
        this.pjs.addPjsArmas(pja.crearArma());
        this.pjs.addPjsBotas(pja.crearBotas());
        this.pjs.addPjsCascos(pja.crearCasco());
        this.pjs.addPjsEscudos(pja.crearEscudo());        
        this.pjs.addPjsTrajes(pja.crearTraje());
        this.pjs.addCordenadas(x, y);        
    }        
}