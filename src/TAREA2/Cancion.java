package TAREA2;

public class Cancion {
	public String titulo, autor;
	public int anio;
	public Cancion(String titulo, String autor, int anio) {
		this.titulo=titulo;
		this.autor=autor;
		this.anio=anio;
	}
	public Cancion() {
		anio=1990;
	}
	public Cancion(String titulo, String autor) {
		anio=1990;
		this.titulo=titulo;
		this.autor=autor;
	}
	public String titulo() {
		return titulo;
	}
	public String autor() {
		return autor;
	}
	public void mostrarTitulo() {
		System.out.println("Titulo: " + titulo());
		System.out.println("Autor: " + autor());
	}
	
}
