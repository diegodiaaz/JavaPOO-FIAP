package aulasPOO.aula03;

public class CDB implements Produto {

	@Override
	public double investir(double valor) {
		return valor + (valor * 0.1375);
	}

}
