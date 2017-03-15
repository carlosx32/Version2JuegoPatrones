/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Builder.CreadordePersonajes;
import Builder.ImplementacionPjs;
import Builder.Personajes;
import Fabrica.Brujo.Brujo;
import Fabrica.Cazador.Cazador;
import Fabrica.Guerrero.Guerrero;
import Fabrica.Sacerdote.Sacerdote;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author carandy
 */
public class CrearPersonaje extends HttpServlet {
    
    private CreadordePersonajes creador;
        
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        creador=new CreadordePersonajes();
        creador.setConstructor(new ImplementacionPjs());   
        this.metodoFabrica( request.getParameter("comboBox") );
//aplicamos el prototype
        
        
        /*       
        request.getSession().setAttribute("Arma", personaje.crearArma().getImagenSrc());
        request.getSession().setAttribute("Escudo", personaje.crearEscudo().getImagenSrc());
        request.getSession().setAttribute("Botas", personaje.crearBotas().getImagenSrc());
        request.getSession().setAttribute("Casco", personaje.crearCasco().getImagenSrc());
        request.getSession().setAttribute("Traje", personaje.crearTraje().getImagenSrc());
        */
        
        request.getSession().setAttribute("Script",  this.envScript());
        response.sendRedirect("Vistapersonaje.jsp");
    }
    
    
    
    public void metodoFabrica(String comboBox){
            switch(comboBox){
            case "Guerrero":   
                 creador.ConstruirPj(Guerrero.getSingleton(),50,50);
                break;
            case "Cazador":
                creador.ConstruirPj(Cazador.getSingleton(),50,50 );
                break;
            case "Sacerdote":
                creador.ConstruirPj(Sacerdote.getSingleton(),50,50 );
                break;
            case "Brujo":
                 creador.ConstruirPj(Brujo.getSingleton(),50,50 );
                break;
        }
    }
    public String envScript(){
        String script="";
        
        String inicializacion=  "        var arma = [];\n" +
                                "        var escudo     = [];\n" +
                                "        var botas      = [];\n" +
                                "        var traje      = [];\n" +
                                "        var casco      = [];\n" +
                                "        var x=[],y=[];\n"+
                                "        var ancho=50; var alto=50\n";
             
       script= script+(inicializacion);
        
      
        script= script+("function dibujarCanvas(){\n");
        
        
        script=script+( "var canvas = document.getElementById('miCanvas');"+
                        " var ctx = canvas.getContext('2d');\n");
        
        Personajes mispjs=creador.getPersonajes();
        
        for(int i = 0;i<mispjs.getPjsArmas().size();i++){
            
        inicializacion=         "        arma["+i+"] =   new Image();\n" +
                                "        escudo["+i+"]   =   new Image();\n" +
                                "        botas["+i+"]   =   new Image();\n" +
                                "        traje["+i+"]    =   new Image();\n" +
                                "        casco["+i+"]   =   new Image();\n";
        script= script+(inicializacion);
            
            
            
            
            script=script+"x["+i+"]="+mispjs.getCordenadax().get(i) +";";
            script=script+"y["+i+"]="+mispjs.getCordenaday().get(i) +";";
            
            script=script+"arma["+i+"].src='"+ mispjs.getPjsArmas().get(i).getImagenSrc()+"';\n";
            script=script+"escudo["+i+"].src='"+ mispjs.getPjsEscudos().get(i).getImagenSrc()+"';\n";
            script=script+"botas["+i+"].src='"+ mispjs.getPjsBotas().get(i).getImagenSrc()+"';\n";
            script=script+"traje["+i+"].src='"+ mispjs.getPjsTrajes().get(i).getImagenSrc()+"';\n";
            script=script+"casco["+i+"].src='"+ mispjs.getPjsCascos().get(i).getImagenSrc()+"';\n";        
            
            script=script+                    
            "            traje["+i+"].onload = function(){\n" +
            "                    ctx.drawImage(traje["+i+"],x["+i+"],y["+i+"],ancho,alto);  // imagen completa en la posición (0,0) \n" +
            "            };\n" +
                    
            "            casco["+i+"].onload = function(){\n" +
            "                    ctx.drawImage(casco["+i+"],x["+i+"],y["+i+"]-alto,ancho,alto);  // imagen completa en la posición (0,0) \n" +
            "            };\n" +
            "            arma["+i+"].onload = function(){\n" +
            "                    ctx.drawImage(arma["+i+"],x["+i+"]-ancho,y["+i+"],ancho,alto);  // imagen completa en la posición (0,0) \n" +
            "            };\n" +
            "            escudo["+i+"].onload = function(){\n" +
            "                    ctx.drawImage(escudo["+i+"],x["+i+"]+ancho,y["+i+"],ancho,alto);  // imagen completa en la posición (0,0) \n" +
            "            };\n" +
            "            botas["+i+"].onload = function(){\n" +
            "                    ctx.drawImage(botas["+i+"],x["+i+"],y["+i+"]+alto,ancho,alto);  // imagen completa en la posición (0,0) \n" +
            "            };";       
        }
        script= script+"ctx.strokeRect(0,0,900, 900); }";
        return  script;
    }        
}
