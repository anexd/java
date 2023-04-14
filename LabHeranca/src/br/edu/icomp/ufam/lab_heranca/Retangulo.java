package br.edu.icomp.ufam.lab_heranca;

public class Retangulo  extends FormaGeometrica{
	public double largura;
	public double altura;
	
	public Retangulo(int posX, int posY,double largura,double altura) {
		super(posX, posY);
		this.largura = largura;
		this.altura = altura;
		this.posX =posX;
		this.posY = posY;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return largura*altura;
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*(largura+altura);
	}
	public String toString() {
		return "Retângulo na posição ("+this.posX+", "+ this.posY+") com largura de " + this.largura+"cm e altura de "+this.altura+"cm (área="+this.getArea()+"cm2, perímetro="
	+this.getPerimetro()+"cm)";
	}
}
