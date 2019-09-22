public class CLdistance {
	
	private CLpoint2D[] parcours;
	private int taille;
	private int index;
	private double distance;
	
	public CLdistance(int taille)
	{
		this.taille = taille;
		this.index = 0;
		this.parcours = new CLpoint2D[this.taille];
		this.distance=0;
	}
	
	public void m_ajouterPoint(CLpoint2D point)
	{
		this.parcours[this.index]=point;
		this.index++;
	}
	
	public void m_afficherPoints()
	{
		int i;
		
		for(i=0;i<this.taille;i++)
		{
			System.out.println(this.parcours[i].getX()+ " : " + this.parcours[i].getY());
		}
	}
	
	public void m_calculDistance()
	{
		int i;
		
		for(i=0;i<this.taille-1;i++)
		{
			this.distance+=Math.sqrt((Math.pow(this.parcours[i+1].getX() - this.parcours[i].getX(),2.0)) + 
				(Math.pow(this.parcours[i+1].getY() - this.parcours[i].getY(),2.0)));
		}
	}
	
	public double getDistance()
	{
		return this.distance;
	}
	
}