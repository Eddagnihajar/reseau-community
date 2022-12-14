package Entites;

public class Fichier extends Publication{
    private int idfichier;
    private String urlf;
    private String type;
    
	public Fichier() {
		super();
		
	}
	
	public Fichier( int idfichier, String urlf, String datepub, String contenupub) {
		
		this.idfichier =idfichier;
		this.urlf = urlf;
	}
	
	public Fichier(String urlf, String datepub, String contenupub) {
		
		this.urlf = urlf;
	}
	
	public int getIdfichier() {
		return idfichier;
	}
	
	public void setIdfichier(int idfichier) {
		this.idfichier = idfichier;
	}
	
	public String getUrlf() {
		return urlf;
	}
	
	public void setUrlf(String urlf) {
		this.urlf = urlf;
	}
	
	@Override
	public String toString() {
		return "Fichier [idfichier=" + idfichier + ", urlf=" + urlf + "]";
	}
    
    
    
}
