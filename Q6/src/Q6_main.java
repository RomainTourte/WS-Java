
public class Q6_main {

public static void main(String[] args) {
		
		CLpoint2D objPoint1;
		CLpoint2D objPoint2;
		CLdistance parcours;
		
		objPoint1 = new CLpoint2D();
		objPoint2 = new CLpoint2D(1,1);
		parcours = new CLdistance(2);
				
		parcours.m_ajouterPoint(objPoint1);
		parcours.m_ajouterPoint(objPoint2);
		
		parcours.m_afficherPoints();
		parcours.m_calculDistance();
		
		System.out.println(parcours.getDistance());
	}
}
