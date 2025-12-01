/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.poli.electrodomesticos;

/**
 *
 * @author SALON206
 */
public class Electrodomestico {

    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    protected static final double PRECIO_BASE_DEF = 100;
    protected static final String COLOR_DEF = "blanco";
    protected static final char CONSUMO_ENERGETICO_DEF = 'F';
    protected static final double PESO_DEF = 5;

    private static final String[] COLORES_VALIDOS
            = {"blanco", "negro", "rojo", "azul", "gris"};

    public Electrodomestico() {
        this.precioBase = PRECIO_BASE_DEF;
        this.color = COLOR_DEF;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
        this.peso = PESO_DEF;

    }
    //Constructor con el precio y peso. El resto por defecto

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_DEF;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;

    }
    //constructor con todos los atributos

    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
        this.color = color;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra > 'A' && letra <= 'F') {
            return letra;
        } else {
            return CONSUMO_ENERGETICO_DEF;
        }
    }

    private String comprobarColor(String color) {
        for (String col : COLORES_VALIDOS) {
            if (col.equalsIgnoreCase(color)) {
                return col.toLowerCase();

            }
        }
        return COLOR_DEF;
    }

    public double precioFinal() {
        double precioFinal = precioBase;

        //consumo energetico
        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;

        }
        //peso
        if (peso <= 19)   precioFinal += 10;
         else if (peso < 49) precioFinal += 50;
         else if(peso <=79)precioFinal +=80;
         else precioFinal += 100;
        
        return precioFinal;
    
        }
    }

