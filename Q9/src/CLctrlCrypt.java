import java.io.IOException;

public class CLctrlCrypt {
	
	public void ecrireFichierSimple(String path, String texte) throws IOException
	{
		CLfichier fichier;
		
		fichier = new CLfichier();
		fichier.ecrireFichier(path, texte);
	}
	
	public String lireFichierSimple(String path) throws Exception
	{
		CLfichier fichier;
		String reponse;
		
		fichier = new CLfichier();
		reponse = fichier.lireFicher(path);
		
		return reponse;
	}
	
	public String crypter(String texte, String key)
	{
		String reponse;
		CLcrypt oCrypt;
			
		oCrypt = new CLcrypt();
		reponse = oCrypt.m_crypt(texte, key);
		
		return reponse;
	}
}
