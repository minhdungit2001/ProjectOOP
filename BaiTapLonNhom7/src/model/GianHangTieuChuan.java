package model;

import java.util.Scanner;

public class GianHangTieuChuan extends GianHang {
	private String chatLieuVachNgan, chatLieuMaiChe;
	public int SO_GIAN_HANG_THUE;	
	
	// Phuong thuc khoi tao.
	public GianHangTieuChuan() {
		super();
	}
	public GianHangTieuChuan(String maGianHang, double dienTich, String viTri, String chatLieuVachNgan, String chatLieuMaiChe, int soLuong) {
		super(maGianHang, dienTich, viTri);
		this.chatLieuVachNgan = chatLieuVachNgan;
		this.chatLieuMaiChe = chatLieuMaiChe;
		SO_GIAN_HANG_THUE = soLuong;
	}
	
	// Cac phuong thuc get, set.
	public void set_chatLieuVachNgan(String chatLieuMoi) {
		chatLieuVachNgan = chatLieuMoi;
	}
	public String get_chatLieuVachNgan() {
		return chatLieuVachNgan;
	}
	
	public void set_chatLieuMaiChe(String chatLieuMoi) {
		chatLieuMaiChe = chatLieuMoi;
	}
	public String get_chatLieuMaiChe() {
		return chatLieuMaiChe;
	}
	
	public void set_SO_GIAN_HANG_THUE(int number) {
		SO_GIAN_HANG_THUE = number;
	}
	public int get_SO_GIAN_HANG_THUE() {
		return SO_GIAN_HANG_THUE;
	}
	
	// Nhap thong tin.
//	public void input() {
//		Scanner sc = new Scanner (System.in);
//		super.input();
//		System.out.println("XIn hay nhap chat lieu vach ngan: ");
//		chatLieuVachNgan = sc.nextLine();
//		System.out.println("XIn hay nhap chat lieu mai che: ");
//		chatLieuMaiChe = sc.nextLine();
//		System.out.println("XIn hay so luong gian hang da duoc thue: ");
//		SO_GIAN_HANG_THUE = sc.nextInt();
//		sc.nextLine();
//	}
	
	// In thong tin.
	public void inTT() {
		System.out.println("Ma gian Hang la: " + maGianHang);
		System.out.println("Dien tich gian hang la: " + dienTich);
		System.out.println("Vi tri cua gian Hang la: " + viTri);
		System.out.println("Chat lieu vach ngan cua gian Hang la: " + chatLieuVachNgan);
		System.out.println("Chat lieu mai che cua gian Hang la: " + chatLieuMaiChe);
		System.out.println("So gian hang da thue la: " +  SO_GIAN_HANG_THUE);
		System.out.println("Chi phi thue moi ngay la : " + (100000*dienTich));
	}
	
	// Tinh chi phi thue(Lam ro phuong thuc abstract).
	public double chiPhiThue(int soNgay) {
		return (100000 * dienTich * soNgay);
	}
}

