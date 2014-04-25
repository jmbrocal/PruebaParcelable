package com.example.arrayparcelbale;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.util.Date;
import java.util.Random;

public class Perro implements Parcelable {
    
    private Integer peso;
    private Date fechaNacimiento;
    private Dueño dueño;
    
    public Perro() {
        Random r = new Random();
        peso = Integer.valueOf(r.nextInt(60));
        fechaNacimiento = new Date();
        dueño = new Dueño();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        Log.i("Perro", "writeToParcel");
    }

    @Override
    public String toString() {
        return "Perro [peso=" + peso + ", fechaNacimiento=" + fechaNacimiento + ", dueño=" + dueño
                + "]";
    }    
    
}
