package aulasPOO.aula03;

public class LCI implements Produto {

	@Override
	public double investir(double valor) {
		return valor * 0.09;
	}

}
