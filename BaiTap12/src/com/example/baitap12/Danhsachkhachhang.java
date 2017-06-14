package com.example.baitap12;

import java.util.ArrayList;

public class Danhsachkhachhang {
 
ArrayList<Khachhang>listKH=new ArrayList<Khachhang>();
 
public void addKhachHang(Khachhang kh)
 
{
 
listKH.add(kh);
 
}
 
public double tongDoanhThu()
 
{
 
	double tien=0.0;
	 
	for(Khachhang kh:listKH)
	 
	{
	 
	tien+=kh.tinhThanhTien();
	 
	}
	 
	return tien;
	 
	}
	 
	public int tongKhachHang()
	 
	{
	 
	return listKH.size();
	 
	}
	 
	public int tongKhachHangVip()
	 
	{
	 
	int s=0;
	 
	for(Khachhang kh:listKH)
	 
	{
	 
	if(kh.isVip())
	 
	s++;
	 
	}
	 
	return s;
	 
	}
	 
	}
