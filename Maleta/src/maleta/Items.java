/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maleta;

/**
 * Modelo general de los items del juego
 * @author L carcamo
 * 
 */

public class Items {
    int id;
    private String name;

    /**
     * 
     * @return la id del item
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id id del elemento
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return devuelve el nombre del item
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * @param name Asigna el nombre del item
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @param id id del item que se va a crear
     * @param name nombre del item que se va a crear
     */
    public Items(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
    /**
     * Metodo utilizado para clonar los items
     * @return devuelve la id y el nombre del item clonado
     */
    public Items clonarItems(){
       return new Items(id, name);
   
    
    }
    
  

}
