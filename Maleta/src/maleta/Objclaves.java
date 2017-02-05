/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maleta;

/**
 * Clase unica hija de Item para un tipo de Items especial
 * @author L carcamo
 */
public class Objclaves extends Items {

    private final boolean feature = false;

    /**
     * 
     * @param id id del objeto a crear
     * @param name nombre del objeto a crear
     * @param feature posibilidad de tener una caracteristica de mas
     */
    public Objclaves(int id, String name, boolean feature) {
        super(id, name);
    }

    /**
     * 
     * @return  devuelve el objeto clonado
     */
    @Override
        public Objclaves clonarItems() {
        return new Objclaves(id, "", feature);
    }

}
