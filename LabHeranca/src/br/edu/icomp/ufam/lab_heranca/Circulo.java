package br.edu.icomp.ufam.lab_heranca;

public  class Circulo extends FormaGeometrica{
	
	public double raio;
	
	public Circulo(int posX, int posY, double raio) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
		this.posX = posX;
		this.posY =posY;
		this.raio = raio;
	}
	
	public double getArea() {
		return Math.PI*(raio*raio);
	}
	public double getPerimetro() {
		return 2*(Math.PI*raio);
	}
	
	
	public String toString() {
		return "Círculo na posição ("+this.posX+","+this.posY
				+") com raio de"+this.raio+"cm (área="+this.getArea()+"cm2, perímetro="+this.getPerimetro()+"cm)";
	}
}
