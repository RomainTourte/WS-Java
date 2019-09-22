public class CLpoint2D {
	
	private double x;
	private double y;
	
	public CLpoint2D()
	{
		this.ini_obj(0, 0);
	}
	
	public CLpoint2D(double x, double y)
	{
		this.ini_obj(x, y);
	}
	
	private void ini_obj(double x, double y)
	{
		this.setX(x);
		this.setY(y);
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
	public double getX()
	{
		return this.x;
	}
	public double getY()
	{
		return this.y;
	}

}