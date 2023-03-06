package com.company;

public class Kota<E> {
    private E elemen;

    public Kota (E kota){
        elemen = kota;
    }

    public E getElement(){
        return elemen;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota <String>("Malang");
        System.out.println("Jumlah Kota di Jawa Timur :"+ jumlahKota.getElement() + "kota");
        System.out.println("Salah Satu Kota di Jawa Timur : Kota " + namaKota.getElement());
    }

}
