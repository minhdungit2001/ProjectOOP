package model;

import java.lang.String;
import java.util.Scanner;

public abstract class GianHang {
    public String maGianHang;
    public double dienTich;
    public String viTri;

    public String getMaGianHang() {
        return maGianHang;
    }

    public void setMaGianHang(String maGianHang) {
        this.maGianHang = maGianHang;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    //#Phuong thuc khoi tao
    public GianHang(){
    }

    public GianHang(String maGianHang, double dienTich, String viTri){
        this.maGianHang = maGianHang;
        this.dienTich = dienTich;
        this.viTri = viTri;
    }

    //#Chi phi thue
    public abstract double chiPhiThue(int soNgay);

}
