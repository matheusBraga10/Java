package encapsulamento.violacao.pilhaEncapsulada;

import java.util.Arrays;

public class Pilha {

	private Object[] elementos;
	private int topo = 0;
	
	public Pilha(int maximo) {
		elementos = new Object[maximo];
	}

	public void empilhar(Object elemento) {
		elementos[topo] = elemento;
		topo++;
	}
	
	public Object desembpilhar() {
		topo--;
		return elementos[topo];
	}
	
	public Object topo() {
		return elementos[topo-1];
	}
	
	public int tamanho() {
		return topo;
	}

	public Object[] getElementos() {
		Object[] paraRetorno = Arrays.copyOf(elementos, tamanho());
		return paraRetorno;
	}

	public void setElementos(Object[] elementos) {
		this.elementos = elementos;
	}

//	public void setTopo(int topo) {
//		this.topo = topo;
//	}
	
	
}
