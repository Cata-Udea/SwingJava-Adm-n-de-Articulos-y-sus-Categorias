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
public class ArrayArticulo 
{
    private ArrayList<Articulo> arregloArticulos;
    
    public ArrayArticulo()
    {
        arregloArticulos = new ArrayList<Articulo>();
        //cargar();
    }
    
    /*Metodo ara obtener una posicion*/
    public Articulo obtener(int i)
    {
        return arregloArticulos.get(i);
    }
    
    /*Metodo para adicionar categoria*/
    public void adicionar(Articulo a)
    {
        arregloArticulos.add(a);
    }
    
    /*Metodo buscra categoria por nombre*/
    public Articulo buscar(String nombre)
    {
        for(int i=0; i< arregloArticulos.size();i++)
        {
            if(nombre.equals(arregloArticulos.get(i).getNombre()))
                {return arregloArticulos.get(i);}
        }
        return null;
    }
    
    /*Metodo para eliminar categoria*/
    public void eliminar(Articulo a)
    {
        arregloArticulos.remove(a);
    }
    
    /*Metodo para obtener el tamanio del arreglo*/
    public int getTamanio()
    {
        return arregloArticulos.size();
    }
    
    
}
