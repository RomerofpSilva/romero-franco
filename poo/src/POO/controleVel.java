package POO;

public class controleVel {

	private int velocidade;
	

	public controleVel(int velocidade) {
		setVelocidade(velocidade);
	}
	
	public void acelerar(int aumento) {
		if(aumento < 0 || aumento >= 20) {
			throw new IllegalArgumentException("Aceleração invalida");
		}
		this.velocidade += aumento;
	}
	public void reduzir(int reducao) {
		if(reducao < 0 || reducao >= 30) {
			throw new IllegalArgumentException("redução invalida");
		}
		setVelocidade(velocidade - reducao);
	}

	@Override
	public String toString() {
		return "controleVel [velocidade=" + velocidade + "]";
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		
		if(velocidade < 0) {
			throw new IllegalArgumentException("velocidade fora do exigido");
			
		}else if (velocidade >= 0 || velocidade < 30) {
			throw new IllegalArgumentException("velocidade fora do limite");
			
		}else {
			this.velocidade = velocidade;
		}
		
	}	
	
}
