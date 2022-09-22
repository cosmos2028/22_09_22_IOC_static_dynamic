package metier;

import dao.Dao;

public class MetierImpl implements Metier 
{
	Dao dao;

	@Override
	public double calcul() 
	{
		double temperature = dao.getData();
		double resultat = temperature*540/Math.cos(temperature*Math.PI);
		
		return resultat;
	}

	/*
	 * permettre d'injecter dans la variable dao un objet d'une class qui
	 * implement l'interface dao
	 */
	public void setDao(Dao dao) {
		this.dao = dao;
	}

	
}
