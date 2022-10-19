package com.yash.model;

import java.awt.Image;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mId;
	
	private String mname;
	
	private String mimage;
	
	private double mprice;
	
	private String medicineCategory;

	public String getMedicineCategory() {
		return medicineCategory;
	}

	public void setMedicineCategory(String medicineCategory) {
		this.medicineCategory = medicineCategory;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMimage() {
		return mimage;
	}

	public void setMimage(String mimage) {
		this.mimage = mimage;
	}

	public double getMprice() {
		return mprice;
	}

	public void setMprice(double mprice) {
		this.mprice = mprice;
	}

	@Override
	public String toString() {
		return "Medicine [mId=" + mId + ", mname=" + mname + ", mimage=" + mimage + ", mprice=" + mprice + "]";
	}

	public Medicine(int mId, String mname, String mimage, double mprice) {
		super();
		this.mId = mId;
		this.mname = mname;
		this.mimage = mimage;
		this.mprice = mprice;
	}

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

}
