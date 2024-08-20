package HuynhPhatDat_21084761;

import java.util.Scanner;

public class hinhChuNhat {
	
	private double chieuDai;
	private double chieuRong;
	
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double d) {
		if (d>0) {
			this.chieuDai = d;
		} else {
			System.out.println("Error!");
		}
	}
	
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if (r>0) {
			this.chieuRong = r;
		} else {
			System.out.println("Error!");
		}
	}
	
	public hinhChuNhat() {}
	public hinhChuNhat(double d, double r) {
		if (d>0) {
			this.chieuDai = d;
		} else {
			System.out.println("Error!");
		}
		
		if (r>0) {
			this.chieuRong = r;
		} else {
			System.out.println("Error!");
		}
	}
	
	public double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getDienTich() {
		return getChieuDai()*getChieuRong();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public static void main(String[] args) {
		hinhChuNhat h1 = new hinhChuNhat();
		
		h1.setChieuDai(5);
		h1.setChieuRong(3);
		System.out.println("Chieu dai la: "+h1.getChieuDai());
		System.out.println("Chieu rong la: "+h1.getChieuRong());
		System.out.println("Chu vi la: "+h1.getChuVi());
		System.out.println("Dien tich la: "+h1.getDienTich());
		
		hinhChuNhat h2 = new hinhChuNhat(10,8);
		System.out.println("Chieu dai la: "+h2.getChieuDai());
		System.out.println("Chieu rong la: "+h2.getChieuRong());
		System.out.println("Chu vi la: "+h2.getChuVi());
		System.out.println("Dien tich la: "+h2.getDienTich());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu ban phim");
		System.out.println("Nhap chieu dai: ");
		double d=sc.nextDouble();
		h1.setChieuDai(d);
		System.out.println("Nhap chieu rong: ");
		double r=sc.nextDouble();
		h1.setChieuRong(r);
		System.out.println("Ket Qua Nhap Mem");
		System.out.println("Chieu dai la: "+h1.getChieuDai());
		System.out.println("Chieu rong la: "+h1.getChieuRong());
		System.out.println("Chu vi la: "+h1.getChuVi());
		System.out.println("Dien tich la: "+h1.getDienTich());
	}
}
