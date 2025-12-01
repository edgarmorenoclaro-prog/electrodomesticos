/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.poli.act1.electrodomesticos;

/**
 *
 * @author Acer Nitro 5
 */
public class Televisor {
    
    public class Television extends Electrodomestico {

        // Atributos propios
        private int resolucion;
        private boolean sintonizadorTDT;

        // Valores por defecto
        private static final int RESOLUCION_DEF = 20;
        private static final boolean SINTONIZADOR_DEF = false;

        // Constructor por defecto
        public Television() {
            super();
            this.resolucion = RESOLUCION_DEF;
            this.sintonizadorTDT = SINTONIZADOR_DEF;
        }

        // Constructor con precio y peso, el resto por defecto
        public Television(double precioBase, double peso) {
            super(precioBase, peso);
            this.resolucion = RESOLUCION_DEF;
            this.sintonizadorTDT = SINTONIZADOR_DEF;
        }

        // Constructor con resolución, sintonizador y el resto de atributos heredados
        public Television(double precioBase, String color, char consumoEnergetico, double peso,
                int resolucion, boolean sintonizadorTDT) {
            super(precioBase, color, consumoEnergetico, peso);
            this.resolucion = resolucion;
            this.sintonizadorTDT = sintonizadorTDT;
        }

        // Métodos get
        public int getResolucion() {
            return resolucion;
        }

        public boolean getSintonizadorTDT() {
            return sintonizadorTDT;
        }

        // Método precioFinal
        @Override
        public double precioFinal(){
            double precio = super.precioFinal();

            // Si la resolución es mayor a 40 pulgadas, aumenta 30%
            if (resolucion > 40) {
                precio += precio * 0.3;
            }

            // Si tiene sintonizador TDT, aumenta $50
            if (sintonizadorTDT) {
                precio += 50;
            }

            return precio;
        }
    }

}

