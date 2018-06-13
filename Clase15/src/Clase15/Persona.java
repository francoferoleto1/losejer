package Clase15;

//Clase Persona
public class Persona {

  private String nombre;
  private int edad;
  private static int contadorPersonas;

  public Persona() {
  }

  public Persona(String nombre, int edad) {
      this.nombre = nombre;
      this.edad = edad;
  }

  public void setNombre(String nom) {
      nombre = nom;
  }

  public String getNombre() {
      return nombre;
  }

  public void setEdad(int ed) {
      edad = ed;
  }

  public int getEdad() {
      return edad;
  }

  public static int getContadorPersonas() {
          return contadorPersonas;
  }

  public static void setContadorPersonas(int contadorPersonas) {
          Persona.contadorPersonas = contadorPersonas;
  }

  public static void incrementarContador() {
      contadorPersonas++;
  }
}