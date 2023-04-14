package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo {
      double lado;
    public Quadrado(int posX, int posY , double lado){
        super(posX,posY);
        
        
        this.lado = lado;
        
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
		return "Quadrado na posição ("+this.posX+","+this.posY+") com lado de"+this.lado+"cm (área="
        +this.getArea()+"cm2, perímetro="+this.getPerimetro()+"cm)";
	}
}
