package cl.negocios;

public class Alumno {
	private String nombre;
	 private String apellidos;
	 private Double promedio;
	 
	 public Alumno(String nombre, String apellidos,
	 Double promedio){
	 this.nombre = nombre;
	 this.apellidos = apellidos;
	 this.promedio = promedio;
	 }
	 
	 public String getNombre(){
	 return nombre;
	 }
	 
	 public String getApellidos(){
	 return apellidos;
	 }
	 
	 public Double getPromedio(){
	 return promedio;
	 }
	 public String toString(){
	 return (nombre+" "+apellidos+" tiene promedio: "+promedio);
	 }


}
