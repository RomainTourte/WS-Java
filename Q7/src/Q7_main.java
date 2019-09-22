
public class Q7_main {

public static void main(String[] args) {
		
		CLpoint2D objPoint1;
		CLpoint2D objPoint2;
		CLpoint2D objPoint3;
		CLpoint2D objPoint4;
		CLdistance parcours1;
		CLdistance parcours2;
		
		objPoint1 = new CLpoint2D();
		objPoint2 = new CLpoint2D(1,1,0);
		objPoint3 = new CLpoint3D();
		objPoint4 = new CLpoint3D(1,1,1);
		parcours1 = new CLdistance(2);
		parcours2 = new CLdistance(2);
				
		parcours1.m_ajouterPoint(objPoint1);
		parcours1.m_ajouterPoint(objPoint2);
		parcours2.m_ajouterPoint(objPoint3);
		parcours2.m_ajouterPoint(objPoint4);
		
		objPoint1.m_afficherCoordo();
		System.out.println("---------------");
		objPoint2.m_afficherCoordo();
		System.out.println("---------------");
		objPoint3.m_afficherCoordo();
		System.out.println("---------------");
		objPoint4.m_afficherCoordo();
		System.out.println("---------------");
		
		parcours1.m_calculDistance();
		parcours2.m_calculDistance();
		
		System.out.println(parcours1.getDistance());
		System.out.println(parcours2.getDistance());
	}
}
