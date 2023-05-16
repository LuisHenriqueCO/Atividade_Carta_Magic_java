package atividade_pilha;

import java.util.ArrayList;

public class PilhaMagic {

private ArrayList<Magic> pilha = new ArrayList<Magic>();
	
	public void push(Magic elemento) {
	    pilha.add(elemento);
	}

	public Magic pop() {
	    if (pilha.isEmpty()) {
	        throw new RuntimeException("A pilha está vazia");
	    }
	    return pilha.remove(pilha.size() - 1);
	}

	public Magic top() {
	    if (pilha.isEmpty()) {
	        throw new RuntimeException("A pilha está vazia");
	    }
	    return pilha.get(pilha.size() - 1);
	}

	public boolean isEmpty() {
	    return pilha.isEmpty();
	}

	public int size() {
	    return pilha.size();
	}
	
	public void clear() {
		pilha.clear();
	}

	public Magic get(int index) {
        if (index < 0 || index >= pilha.size()) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        return pilha.get(index);
    }
}
