/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Fabrica.ArmaAbs;
import Fabrica.BotasAbs;
import Fabrica.CascoAbs;
import Fabrica.EscudoAbs;
import Fabrica.TrajeAbs;
import java.util.ArrayList;


/**
 *
 * @author carandy
 */
public class Personajes   {
    private ArrayList<ArmaAbs> pjsArmas=new ArrayList<ArmaAbs>();
    private ArrayList<BotasAbs> pjsBotas=new ArrayList<BotasAbs>();
    private ArrayList<CascoAbs> pjsCascos=new ArrayList<CascoAbs>();
    private ArrayList<EscudoAbs> pjsEscudos=new ArrayList<EscudoAbs>();
    private ArrayList<TrajeAbs> pjsTrajes=new ArrayList<TrajeAbs>();
    private ArrayList<Integer> Cordenadax=new ArrayList<Integer>(); ;
    private ArrayList<Integer> Cordenaday=new ArrayList<Integer>(); ;
    
    public void addPjsArmas(ArmaAbs pjsArmas){
        this.pjsArmas.add(pjsArmas);
    };
    public void addPjsBotas(BotasAbs pjsBotas){
        this.pjsBotas.add(pjsBotas);
    };
    public void addPjsCascos(CascoAbs pjsCascos){
        this.pjsCascos.add(pjsCascos);
    };
    public void addPjsEscudos(EscudoAbs pjsEscudos){
        this.pjsEscudos.add(pjsEscudos);
    };
    public void addPjsTrajes(TrajeAbs pjsTrajes){
        this.pjsTrajes.add(pjsTrajes);
    };
    public void addCordenadas(int x, int y){
        this.Cordenadax.add(x);
        this.Cordenaday.add(y);
    };
    public ArrayList<ArmaAbs> getPjsArmas() {
        return pjsArmas;
    }

    public ArrayList<BotasAbs> getPjsBotas() {
        return pjsBotas;
    }

    public ArrayList<CascoAbs> getPjsCascos() {
        return pjsCascos;
    }

    public ArrayList<EscudoAbs> getPjsEscudos() {
        return pjsEscudos;
    }

    public ArrayList<TrajeAbs> getPjsTrajes() {
        return pjsTrajes;
    }

    public ArrayList<Integer> getCordenadax() {
        return Cordenadax;
    }

    public ArrayList<Integer> getCordenaday() {
        return Cordenaday;
    }
    
    
}
