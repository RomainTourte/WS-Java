public class main_WS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLbonjour objBjr;
		CLaddition clAdd = new CLaddition();
		
		CLpoint2D objPoint1;
		CLpoint2D objPoint2;
		
		objPoint1 = new CLpoint2D();
		objPoint2 = new CLpoint2D(-1,1);
		
		System.out.println(objPoint1.getX());
		System.out.println(objPoint1.getY());
		System.out.println(objPoint2.getX());
		System.out.println(objPoint2.getY());
				
		objBjr = new CLbonjour();
		objBjr.m_bonjour();
		
		System.out.println(objBjr.m_bonjour1());
		System.out.println(clAdd.m_add(2,3));
		
	}

}
