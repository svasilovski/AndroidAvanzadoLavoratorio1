package com.example.androidavanzadolavoratorio1.Datos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.androidavanzadolavoratorio1.R;

import java.util.List;

public class ProductoAdapter extends BaseAdapter {
    List<Producto> lstProductos;

    public ProductoAdapter(List<Producto> lstProductos) {
        this.lstProductos = lstProductos;
    }

    @Override
    public int getCount() {
        return this.lstProductos.size();
    }

    @Override
    public Object getItem(int position) {
        return this.lstProductos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.lstProductos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.producto_celda,parent,false);

        Producto producto = (Producto) getItem(position);
        TextView descripcion = view.findViewById(R.id.description);
        TextView precio = view.findViewById(R.id.price);

        descripcion.setText(producto.getDescription());
        precio.setText(String.format("%.2f", producto.getPrice()));

        return view;
    }
}
