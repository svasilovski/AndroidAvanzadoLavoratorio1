package com.example.androidavanzadolavoratorio1.Datos;

import android.media.Image;
import android.support.annotation.Nullable;

import java.text.DecimalFormat;

public class Producto {
    private DecimalFormat df = new DecimalFormat("#.00");

    public Producto() { }

    private int id;
    private String description;
    private double price;
    private Image image;

    public Producto(int id, String description, double price, Image image) {
        this.id = id;
        this.description = description;
        setPrice(price);
        this.image = image;
    }

    public Producto(int id, String description, double price) {
        this.id = id;
        this.description = description;
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Double.valueOf(df.format(price));
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Nullable
    @Override
    public String toString() {
        return String.format("%s: %.2f", this.description, this.price);
    }
}
