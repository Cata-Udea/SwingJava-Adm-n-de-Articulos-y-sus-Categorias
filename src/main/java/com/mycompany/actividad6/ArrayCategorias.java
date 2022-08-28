/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad6;

import java.util.ArrayList;

/**
 *
 * @author catax
 */
public class ArrayCategorias 
{
    private ArrayList<Categoria> arregloCategorias;
    
    public ArrayCategorias()
    {
        arregloCategorias = new ArrayList<Categoria>();
        //cargar();
    }
    
    /*Metodo para adicionar categoria*/
    public void adicionar(Categoria c)
    {
        arregloCategorias.add(c);
    }
    
    /*Metodo buscra categoria por nombre*/
    public Categoria buscar(String nombre)
    {
        for(int i=0; i< arregloCategorias.size();i++)
        {
            if(nombre.equals(arregloCategorias.get(i).getNombre()))
                {return arregloCategorias.get(i);}
        }
        return null;
    }
    
    /*Metodo para eliminar categoria*/
    public void eliminar(Categoria c)
    {
        arregloCategorias.remove(c);
    }
    
    
    
    
    
}
