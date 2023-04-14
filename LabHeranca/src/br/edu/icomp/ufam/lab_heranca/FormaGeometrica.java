package br.edu.icomp.ufam.lab_heranca;

public abstract class FormaGeometrica{
	public double posX;
	public double posY;
	
	public FormaGeometrica (int posX2, int posY2 ) {
		this.posX = posX2;
		this.posY = posY2;
	}
	public abstract  double getArea();
	public abstract  double getPerimetro();
	
	public   String getPosString() {
		return "(posição ("+ this.posX+","+this.posY+")";
	}
}
