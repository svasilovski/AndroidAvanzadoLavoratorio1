package com.example.androidavanzadolavoratorio1.Datos;

import android.media.Image;

import java.util.ArrayList;
import java.util.List;

public class Productos {
    private List<Producto> productos = new ArrayList<Producto>();

    private Producto crearNuevo(int id, String description, double price, Image image) {
        Producto prod = new Producto();
        return  prod;
    }

    public Productos() {
        productos.add(crearNuevo(productos.size(), "Tuerca", 15.2587, null));
        productos.add(crearNuevo(productos.size(), "Tornillo", 18.00, null));
        productos.add(crearNuevo(productos.size(), "Arandela", 10.2798, null));
        productos.add(crearNuevo(productos.size(), "Bulón", 45.8549, null));
        productos.add(crearNuevo(productos.size(), "Clavo", 8.25137, null));
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
