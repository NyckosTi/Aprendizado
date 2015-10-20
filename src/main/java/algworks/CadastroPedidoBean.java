package algworks;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;



@Named
@RequestScoped
public class CadastroPedidoBean {

	private final List<Integer> envolvido;
	
	public CadastroPedidoBean() {
		envolvido = new ArrayList<>();
		envolvido.add(1);
	}
	
	public void salvar() {
		throw new NegocioException("Pedido não pode ser salvo, pois ainda não foi implementado.");
	}

	public List<Integer> getEnvolvido() {
		return envolvido;
	}
	
}