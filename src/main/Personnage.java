package main;
public class Personnage {

	private int pointsVie;
	private Case position;
	
	public Personnage(int pointsVie, Case position) {
		this.pointsVie = pointsVie;
		this.position = position;
	}

	public int getPointsVie() {
		return pointsVie;
	}

	public void setPointsVie(int pointsVie) {
		this.pointsVie = pointsVie;
	}

	public Case getPosition() {
		return position;
	}

	public void setPosition(Case position) {
		this.position = position;
	}
	//setPosition peut nous aider a la fonction de teleport
	//qlq setters et getters doivent etre reajoutés au diagram
	
	public void deplacerHaut(){
		position.setPositionY(position.getPositionY()-1);
	}
	public void deplacerBas(){
		position.setPositionY(position.getPositionY()+1);
	}
	public void deplacerGauche(){
		position.setPositionX(position.getPositionX()-1);
	}
	public void deplacerDroite(){
		position.setPositionX(position.getPositionX()+1);
	}
	//setter a ajouter dans la classe case

	public void attaquer() {
		//*******
	}
	//nom à changer
	
	public boolean perdreVie() {
		if (pointsVie == 0)
			return true;
		return false;
	}
	//nom a changer
	
	public void gagner() {
		//*********
	}
	
	public void subirDegat(int degat) {
		pointsVie-=degat;
	}
	//nom à changer
	
	public void testCase() {
		if (position instanceof(/*****/));
		//*****
	}
	
	
}
