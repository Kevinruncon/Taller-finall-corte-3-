/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class DtoHistorial implements Serializable {
    private ArrayList<DtoConsultaBase> consultasYvacunas;

    public DtoHistorial() {
        this.consultasYvacunas = new ArrayList<>();
    }

    public void agregarConsulta(DtoConsultaBase consultaYvacunas) {
        if (consultaYvacunas != null) {
            consultasYvacunas.add(consultaYvacunas);
        }
    }

    /*public void mostrarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("Sin consultas registradas.");
        } else {
            for (Consulta c : consultas) {
                c.mostrarConsulta();
                System.out.println("--------------------------");
            }
        }
    }*/

    public ArrayList<DtoConsultaBase> getConsultas() {
        return new ArrayList<>(consultasYvacunas);
    }
}

