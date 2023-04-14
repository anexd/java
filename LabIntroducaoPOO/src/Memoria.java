
public class Memoria {
	String marca;
	String tipo;
	double tamanho;
	double velocidade;
	int numPentes;
	public  Memoria(String marca, String tipo,double tamanho, double velocidade,int numPentes) {
		this.marca = marca;
		this.tipo =tipo;
		this.tamanho = tamanho;
		this.numPentes=numPentes;
		//http://www.universidadejava.com.br/java/java-construtor/
	}
	public  Memoria() {}
	
	 double getTamanhoTotal() {
		return tamanho*numPentes;
	 }

	 double getVelocidadeParalela() {
		 return velocidade*numPentes;
	 }
	 /*String getDescricao() {
		 
	 }*/
	 
	
	
	
}
