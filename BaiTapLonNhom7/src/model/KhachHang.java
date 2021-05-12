package model;

import java.util.Scanner;

public class KhachHang {
    private String ten;
    private String diaChi;
    private String thoiGianBatDau;
    private String thoiGianKetThuc;
    private String maGianHangThue;
    private double tienDatCoc;

    //Phuong thuc set get
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }

    public String getDiaChi(){
        return diaChi;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }

    public String getThoiGianBatDau(){
        return thoiGianBatDau;
    }
    public void setThoiGianBatDau(String thoiGianBatDau){
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public String getThoiGianKetThuc(){
        return thoiGianKetThuc;
    }
    public void setThoiGianKetThuc(String thoiGianKetThuc){
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getMaGianHangThue(){
        return maGianHangThue;
    }
    public void setMaGianHangThue(String maGianHangThue){
        this.maGianHangThue = maGianHangThue;
    }

    public double getTienDatCoc() {
        return tienDatCoc;
    }
    public void setTienDatCoc(double tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    //Phuong thuc khoi tao
    public KhachHang(){}
    public KhachHang(String ten, String diaChi, String thoiGianBatDau, String thoiGianKetThuc, String maGianHangThue, double tienDatCoc){
        this.ten = ten;
        this.diaChi = diaChi;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.thoiGianBatDau = thoiGianBatDau;
        this.maGianHangThue = maGianHangThue;
        this.tienDatCoc = tienDatCoc;
    }

    //Phuong thuc nhap thong tin
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Xin hay nhap ten cua khach hang: ");
        ten = sc.nextLine();
        System.out.print("Xin hay nhap dia chi cua khach hang: ");
        diaChi = sc.nextLine();
        System.out.print("Xin hay nhap thoi gian bat dau: ");
        thoiGianBatDau = sc.nextLine();
        System.out.print("Xin hay nhap thoi gian ket thuc: ");
        thoiGianKetThuc = sc.nextLine();
        System.out.print("Xin hay nhap ma gian hang thue cua khach hang: ");
        maGianHangThue = sc.nextLine();
        System.out.print("Xin hay nhap tien khach hang da dat coc: ");
        tienDatCoc = Double.parseDouble(sc.nextLine());
    }

    //Phuong thuc in ra thong tin cua khach hang
    public void inTT(){

    }
}
