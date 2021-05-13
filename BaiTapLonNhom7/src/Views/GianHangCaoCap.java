package Views;

public class GianHangCaoCap{
    private int soLuongGhe;
    private int soLuongQuat;
    private double dienTich;
    private String maGianHang;
    private String viTri;

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public String getMaGianHang() {
        return maGianHang;
    }

    public void setMaGianHang(String maGianHang) {
        this.maGianHang = maGianHang;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getSoLuongGhe() {
        return soLuongGhe;
    }

    public void setSoLuongGhe(int soLuongGhe) {
        this.soLuongGhe = soLuongGhe;
    }

    public int getSoLuongQuat() {
        return soLuongQuat;
    }

    public void setSoLuongQuat(int soLuongQuat) {
        this.soLuongQuat = soLuongQuat;
    }

    public GianHangCaoCap(int soLuongGhe, int soLuongQuat, int dienTich, String maGianHang, String viTri) {
        this.soLuongGhe = soLuongGhe;
        this.soLuongQuat = soLuongQuat;
        this.dienTich = dienTich;
        this.maGianHang = maGianHang;
        this.viTri = viTri;
    }

    public GianHangCaoCap() {
        maGianHang = "2";
        viTri = "DM";
    }

    public double chiPhiThue(int soNgay) {
        return 0;
    }
}
