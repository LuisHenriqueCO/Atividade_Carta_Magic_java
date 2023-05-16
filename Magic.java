package atividade_pilha;

public class Magic {
	
	private String name;
	private String type;
	private int cost;
	private String effect;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	
	public String toString() {
        return "Nome: " + name + "\n" +
                "Tipo: " + type + "\n" +
                "Custo: " + cost + "\n" +
                "Efeito: " + effect;
    }

}
