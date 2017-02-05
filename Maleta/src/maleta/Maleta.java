/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maleta;

/**
 * Maleta de almacenamiento
 *
 * @author L carcamo
 */
public class Maleta {

    /**
     * Clase donde se genera la logica del almacenamiento del juego
     *
     */
//
//    public static void main(String[] args) {
//        Maleta maleta = new Maleta();
//        Items scroll = new Items(254, "Scroll");
//        Items cuchillo = new Items(244, "fcroll");
//
//        try {
//            maleta.añadir(cuchillo);
//            maleta.añadir(scroll);
//        } catch (Exception ex) {
//            System.err.println("No hay espacio en la maleta");
//        }
//
//        maleta.consultar();
//        try {
//            maleta.eliminar(244);
//            maleta.eliminar(254);
//
//        } catch (Exception ex) {
//            System.err.println(ex.getMessage());
//        }
//        
//        System.out.println("__________________________________________________");
//        maleta.consultar();
//
//    }
//    
//    

    /**
     * Tamaño del almacen
     */
    private final Items[] elementos = new Items[20];

    /**
     * Consulta los items en el almacen
     *
     * @return devuelve los items
     */
    public Items[] consultar() {
        for (int i = 0; i < elementos.length; i++) {
            elementos.clone();
            System.out.println("El elemento en la posicion es " + elementos[i]);
        }
        return elementos;

    }

    /**
     *
     * @param usrItems item que el usuario desea añadir
     * @throws Exception lanza una exepcion si no hay espacio disponible
     */
    public void añadir(Items usrItems) throws Exception {
        boolean flag = false;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == null) {
                elementos[i] = usrItems;
                flag = true;
                break;

            }
        }
//        System.out.println("____________________________________________");
//        consultar();
        if (!flag) {
            throw new Exception("No hay espacio");
        }

    }

    /**
     * Elimina un item del juego por id
     *
     * @param id id del item que desea eliminar
     */
    public void eliminar(int id) {
        for (int i = 0; i < elementos.length; i++) {
            try {
                if (elementos[i].getId() == id) {
                    elementos[i] = null;

                    break;
                }
            } catch (Exception e) {
//                System.err.println("No existe el archivo en la maleta");
            }

        }
//        System.out.println("____________________________________________");
//        consultar();

    }

    public Maleta() {
        /**
         * Constuye un baul donde guarda los items
         */
    }

}
