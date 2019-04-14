/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Clase Tren "hijo" hereda atributos y metodos de la clase Transporte "abuelo"
 * y de la clase Terrestre "padre".
 * Se denomina clase final
 *
 * @author Darwin Leon, Est.
 */
public final class Tren extends Terrestre {

    private int cantVagones;
    private String tipoLocomotora;

    /**
     * Método abstracto de la clase Terrestre
     */
    @Override
    public void calcularTiempoViaje() {

    }

    /**
     * Método abstrcato de la clase Transporte
     */
    @Override
    public void calcularTamaño() {

    }

    public int getCantVagones() {
        return cantVagones;
    }

    public void setCantVagones(int cantVagones) {
        this.cantVagones = cantVagones;
    }

    public String getTipoLocomotora() {
        return tipoLocomotora;
    }

    public void setTipoLocomotora(String tipoLocomotora) {
        this.tipoLocomotora = tipoLocomotora;
    }

    @Override
    public String toString() {
        return "Tren{" + super.toString() + "cantVagones=" + cantVagones + ", tipoLocomotora=" + tipoLocomotora + '}';
    }

}
