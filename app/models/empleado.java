package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class empleado extends Model
{
	public String nombre;
	public String a_paterno;
	public String a_materno;
	
	public empleado(String n,String ap, String am)
	{
		this.nombre = n;
		this.a_paterno = ap;
		this.a_materno = am;
	}

}
