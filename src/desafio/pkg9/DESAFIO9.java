/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio.pkg9;

import Entidades.Estudiante;
import Pantallas.PantallaListarEstudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class DESAFIO9 {

    public static List<Estudiante> estudiantesGlobal = new ArrayList<>();

    public static void main(String[] args) {

        PantallaListarEstudiante pantalla = new PantallaListarEstudiante();
        pantalla.setVisible(true);
    }

}
