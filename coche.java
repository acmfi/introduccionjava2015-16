public class Coche {
  int gasolina;
  
  public Coche(int gasolina) {
    this.gasolina = gasolina;
    System.out.println("Tenemos " + gasolina + " litros de gasolina");
  }
  
  public void arrancar() {
    if (this.gasolina > 0)
      System.out.println("Arranca");
    else
      System.out.println("No arranca");
  }
  
  public void conducir() {
    if (this.gasolina > 0) {
      this.gasolina -= 1;
      System.out.println("Quedan " + this.gasolina + " litros");
    } else {
      System.out.println("No se mueve");
    }
  }

  public static void main (String [] args) {
    // Ejercicio:

    // Crear un nuevo coche con 10 litros de gasolina
    // Arrancar el coche
    
    // Bucle que se ejecute 10 veces y que conduzca el coche.
    
    // Intentar volver a arrancar el coche.
  }
}
