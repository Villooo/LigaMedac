/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package atleticomedac.ligamedacclase;

import java.sql.SQLException;
import utilidades.Conexion;

/**
 *
 * @author Víctor
 */
public class LigaMedacClase {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Conexion LigaMedac = new Conexion();
        LigaMedac.conectar();

    }
    
}
