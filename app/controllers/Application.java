package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void alta(String nom, String am, String ap) 
    {
        empleado e = null ;
        
        if(nom != null && !nom.equals(""))
        {
        e = new empleado(nom, ap, am).save();
        }
        
        render(e);
    }
    
    public static void alta_puesto(String pu, String a) 
    {
        puesto p = null ;
        
        if(pu != null && !pu.equals(""))
        {
        p = new puesto(pu, a).save();
        }
        
        render(p);
    }
    
    public static void cambio(String nom1, String nom2) 
    {
        empleado e = null ;
        
        if(nom1 != null && !nom1.equals(""))
        {
        e = empleado.find("byNombre", nom1).first();
        
        	if(e != null)
        	{
        		e.nombre = nom2;
        		e.save();
        	}
        }
        
        render(e);
    }
    public static void cambio_puesto(String pu1, String pu2) 
    {
        puesto p = null ;
        
        if(pu1 != null && !pu1.equals(""))
        {
        p = puesto.find("byPuesto", pu1).first();
        
        	if(p != null)
        	{
        		p.puesto = pu2;
        		p.save();
        	}
        }
        
        render(p);
    }
    
    public static void borra(String nom) 
    {
        empleado e = null ;
        
        if(nom != null && !nom.equals(""))
        {
        e = empleado.find("byNombre", nom).first();
        
        	if(e != null)
        	{
        		e.delete();
        		
        	}
        }
        
        render(e);
    }
    public static void borra_puesto(String pu) 
    {
        puesto p = null ;
        
        if(pu != null && !pu.equals(""))
        {
        p = empleado.find("byPuesto", pu).first();
        
        	if(p != null)
        	{
        		p.delete();
        		
        	}
        }
        
        render(p);
    }

}
