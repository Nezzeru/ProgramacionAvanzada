/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maleta;

/**
 * Tipo de Item derivado de la clase Items 
 * @author L carcamo
 */
public class Medicina extends Items {

    private final int healmount = 0;
    /**
     * 
     * @param id id de la Medicina clonada
     * @param name nombre de la Medicina clonada
     * @param healmount cantidad de curacion
     */
    public Medicina(int id, String name, int healmount) {
        super(id, name);
    }
    
    /**
     * Metodo especifico para clonar medicinas
     * @return devuelve la medicina clonada
     */
    @Override
    public Items clonarItems(){
    return new Medicina(healmount, "", healmount);
    }
}
