package UTSPBO.PersegiPanjang;

import UTSPBO.BangunDatar.BangunDatar;

public class PersegiPanjang implements BangunDatar{
    double panjang;
    double lebar;
    double luasPersegiPanjang;

    public PersegiPanjang(double panjang,double lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }

    @Override
    public void luas() {
        luasPersegiPanjang=this.panjang*this.lebar;
    }

    @Override
    public double getLuas() {
        return luasPersegiPanjang;
    }
}
