package main;

public class Labyrinthe {
	
	private int TailleX;
	private int TailleY;
	private ArrayList<Case> grille;
	
	
	public Labyrinthe(int nb_cases_x, int nb_cases_y, Interaction interaction)
    {
		// Cree un labyrinthe de longueur et de hauteur passees en parametre avec une sortie graphique interaction.
		this.TailleX=nb_cases_x;
		this.TailleY=nb_cases_y;	
    }
	
	
	public int getTailleX()
	{// Retourne la longueur du labyrinthe en nombre de cases.
		return TailleX;
	}
	
	public int getTailleY()
	{// Retourne la largeur du labyrinthe en nombre de cases.
		return TailleY;	
	}
	public int setTailleX(int x)
	{// Modifie la longueur du labyrinthe en nombre de cases.
		this.TailleX=x;
	}
	
	public int setTailleY(int y)
	{// Modifie la largeur du labyrinthe en nombre de cases.
		this.TailleY=y;	
	}
	public boolean	existe_t_il (Case coordonnees)
	{
	//Indique si la case passee en parametre est libre ou pas
	}
	
	public float getDepatureX()
	{
    // Retourne l'abscisse de la case de sortie dans le labyrinthe
	}
	
	public float getDepatureY()
	{
    // Retourne l'ordonnee de la case de sortie dans le labyrinthe
	}
	
}
