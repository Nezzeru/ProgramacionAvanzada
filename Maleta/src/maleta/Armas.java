/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maleta;

/**
 * Clase para el tipo de Items Armas
 * @author L carcamo
 */
public class Armas extends Items {

    private final int damage = 0;
    /**
     * 
     * @param id  id del arma
     * @param name nombre del arma 
     * @param damage daño del arma
     */
    public Armas(int id, String name, int damage) {
        super(id, name);
    }
    
    /**
     * Metodo especifico para el item arma
     * @return devuelve el arma clonada
     */
    @Override
    public Armas clonarItems() {
    return new Armas(id, "", damage);
    
    }

}
