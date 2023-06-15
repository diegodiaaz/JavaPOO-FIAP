package aulasPOO.aula03;

public class LCI implements Produto {

	@Override
	public double investir(double valor) {
		return valor + (valor * 0.09);
	}

}


