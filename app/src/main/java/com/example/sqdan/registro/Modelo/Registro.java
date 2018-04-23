package com.example.sqdan.registro.Modelo;

import java.util.ArrayList;

/**
 * Created by sqdan on 02-Apr-18.
 */

public class Registro {
    ArrayList<Estudiante> listaEstudiantes;

    public Registro(){
        listaEstudiantes = new ArrayList<Estudiante>();
    }

    public String agregarEstudiante(Estudiante estudiante)
    {
        if(estudiante != null)
        {
            listaEstudiantes.add(estudiante);
            return "El estudiante fue agregado correctamente.";
        }
        return "Error al agregar el estudiante.";
    }

    public int buscarEstudiante(String carnet)
    {
        if(carnet != null)
        {
            for(int i=0;i<listaEstudiantes.size();i++)
            {
                if(listaEstudiantes.get(i).getCarnet().equalsIgnoreCase(carnet))
                {
                    return i;
                }
            }
        }
        return -1;
    }

    public String modificarEstudiante(Estudiante estudiante, int posicion)
    {
        if(estudiante != null && posicion != -1)
        {
            listaEstudiantes.get(posicion).setNombre(estudiante.getNombre());
            listaEstudiantes.get(posicion).setCarnet(estudiante.getCarnet());
            listaEstudiantes.get(posicion).setCarrera(estudiante.getCarrera());
            listaEstudiantes.get(posicion).setImgUser(estudiante.getImgUser());

            return "Estudiante modificado correctamente";
        }

        return "Error al modificar estudiante";
    }

    public String eliminarEstudiante(int posicion)
    {
        if(posicion!=-1)
        {
            listaEstudiantes.remove(posicion);
            return "Eliminado correctamente";
        }
        return "Error al eliminar";
    }

    public String getInfoEstudiante(int posicion)
    {
        return listaEstudiantes.get(posicion).toString();
    }

    public Estudiante getEstudiante(int posicion)
    {
        return listaEstudiantes.get(posicion);
    }

    public ArrayList<Estudiante> devolverLista()
    {
        return listaEstudiantes;
    }
}
