package model;

public class TipoCategoria{
	
	private int id_tipo_categoria;
	private String nome_categoria;
	
	
	
	
	public TipoCategoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TipoCategoria(int id_tipo_categoria, String nome_categoria) {
		super();
		this.id_tipo_categoria = id_tipo_categoria;
		this.nome_categoria = nome_categoria;
	}
	
	//get e set
	
	public int getId_tipo_categoria() {
		return id_tipo_categoria;
	}
	public void setId_tipo_categoria(int id_tipo_categoria) {
		this.id_tipo_categoria = id_tipo_categoria;
	}
	public String getNome_categoria() {
		return nome_categoria;
	}
	public void setNome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}
	
	
	
}