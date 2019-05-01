/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estadias;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

/**
 *
 * @author endfox
 */
public class Estadias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ObjectContainer dbempresa = Db4o.openFile("dbempresa.yap");
        ObjectContainer dbalumno = Db4o.openFile("dbalumno.yap");
        Menu ventana = new Menu(dbempresa,dbalumno);
        ventana.setVisible(true);
    }

}
