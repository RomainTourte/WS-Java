public class CLpoint3D extends CLpoint2D {

	public CLpoint3D()
	{
		super();
	}
	public CLpoint3D(double x, double y, double z)
	{
		super(x,y,z);
		super.setZ(z);
	}
	
	public  void m_afficherCoordo()
	{
	   super.m_afficherCoordo();
	   System.out.println(super.getZ());
	}
}