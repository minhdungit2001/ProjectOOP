package model;

import java.util.Scanner;

public class GianHangCaoCap extends GianHang{
    private int soLuongQuat;
    private int soLuongGhe;
    public int SO_GIAN_HANG_THUE;

    //#Phuong thuc get set
    public int getSoLuongQuat(){
        return soLuongQuat;
    }
    public void setSoLuongQuat(int soLuongQuat){
        this.soLuongQuat = soLuongQuat;
    }

    public int getSoLuongGhe(){
        return soLuongGhe;
    }
    public void setSoLuongGhe(int soLuongGhe){
        this.soLuongGhe = soLuongGhe;
    }

    //#Phuong thuc khoi tao
    public GianHangCaoCap(){
        super();
        soLuongGhe = 0;
        soLuongQuat = 0;
    }
    public GianHangCaoCap(String maGianHang, double dienTich, String viTri, int SO_GIAN_HANG_THUE, int soLuongQuat, int soLuongGhe){
        super(maGianHang, dienTich, viTri);
        this.SO_GIAN_HANG_THUE = SO_GIAN_HANG_THUE;
        this.soLuongGhe = soLuongGhe;
        this.soLuongQuat = soLuongQuat;
    }

    //#In thong tin
    public void inTT(){
        System.out.println("Ma gian Hang la: " + maGianHang);
        System.out.println("Dien tich gian hang la: " + dienTich);
        System.out.println("Vi tri cua gian Hang la: " + viTri);
        System.out.println("So luong quat cua gian Hang la: " + soLuongQuat);
        System.out.println("So luong ghe cua gian Hang la: " + soLuongGhe);
        System.out.println("So gian hang da thue la: " +  SO_GIAN_HANG_THUE);
        System.out.println("Chi phi thue moi ngay la : " + chiPhiThue(1));
    }

    //#Chi phi thue
    @Override
    public double chiPhiThue(int soNgay) {
        return (dienTich * 120000 + soLuongQuat * 50000) * soNgay;
    }

//    public void input(){
//        super.input();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Xin hay nhap so luong gian hang thue: ");
//        SO_GIAN_HANG_THUE = Integer.parseInt(sc.nextLine());
//        System.out.print("Xin hay nhap so luong quat cua gian hang: ");
//        soLuongQuat = Integer.parseInt(sc.nextLine());
//        System.out.print("Xin hay nhap so luong ghe cua gian hang: ");
//        soLuongGhe = Integer.parseInt(sc.nextLine());
//    }
}
