package model;

import java.util.Scanner;

public abstract class GianHang {
    public String maGianHang;
    public  double dienTich;
    public String viTri;

    //#Phuong thuc get set
    public String getMaGianHang(){
        return maGianHang;
    }
    public void setMaGianHang(String maGianHang){
        this.maGianHang = maGianHang;
    }

    public double getDienTich(){
        return dienTich;
    }
    public void setDienTich(double dienTich){
        this.dienTich = dienTich;
    }

    public String getViTri(){
        return viTri;
    }
    public void setViTri(String viTri){
        this.viTri = viTri;
    }

    //#Phuong thuc khoi tao
    public GianHang(){
        maGianHang = "empty";
        dienTich = 0;
        viTri = "empty";
    }
    public GianHang(String maGianHang, double dienTich, String viTri){
        this.maGianHang = maGianHang;
        this.dienTich = dienTich;
        this.viTri = viTri;
    }

    //#Nhap thong tin
//    public void input(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Xin hay nhap ma gian hang: ");
//        maGianHang = sc.nextLine();
//        System.out.print("xin hay nhap dien tich cua gian hang: ");
//        dienTich = Double.parseDouble(sc.nextLine());
//        System.out.print("Xin hay nhap vi tri cua gia hang: ");
//        viTri = sc.nextLine();
//    }

    //#Chi phi thue (truu tuong)
    public abstract double chiPhiThue(int soNgay);

}
