public class CLpoint2D {
	
	private double x;
	private double y;
	private double z;
	
	public CLpoint2D()
	{
		this.ini_obj(0, 0, 0);
	}
	
	public CLpoint2D(double x, double y, double z)
	{

		this.ini_obj(x, y, 0);
	}
	
	private void ini_obj(double x, double y, double z)
	{
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}
	
	public void m_afficherCoordo()
	{
	    System.out.println(this.getX()+ " : " + this.getY());
	}
	
	public void setX(double x)
	{
		if(x<0)
		{
			this.x=0;
		}
		else
		{
			this.x=x;
		}
	}
	public void setY(double y)
	{
		if(y<0)
		{
			this.y=0;
		}
		else
		{
			this.y=y;
		}
	}
	public void setZ(double z)
	{
		if(z<0)
		{
			this.z=0;
		}
		else
		{
			this.z=z;
		}
	}
	public double getX()
	{
		return this.x;
	}
	public double getY()
	{
		return this.y;
	}
	public double getZ()
	{
		return this.z;
	}

}