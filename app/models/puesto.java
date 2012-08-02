package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class puesto extends Model
{
	public String puesto;
	public String actividad;
	
	public puesto(String p, String a)
	{
		puesto = p;
		actividad = a;
		
	}

}
