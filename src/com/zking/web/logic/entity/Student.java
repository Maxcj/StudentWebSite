package com.zking.web.logic.entity;

public class Student {
	private Integer stuId;
	private String  stuName;
	private String  stuBirthday;
	private String  stuSex;
	private String  stuIntr;
    private String  stuMobile;
    private String  stuArea;
    
    public Student()
    {
    	
    }
    
    
    
	public Student(String stuName, String stuBirthday, String stuSex, String stuIntr, String stuMobile,
			String stuArea) {
		super();
		this.stuName = stuName;
		this.stuBirthday = stuBirthday;
		this.stuSex = stuSex;
		this.stuIntr = stuIntr;
		this.stuMobile = stuMobile;
		this.stuArea = stuArea;
	}



	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuBirthday() {
		return stuBirthday;
	}
	public void setStuBirthday(String stuBirthday) {
		this.stuBirthday = stuBirthday;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public String getStuIntr() {
		return stuIntr;
	}
	public void setStuIntr(String stuIntr) {
		this.stuIntr = stuIntr;
	}
	public String getStuMobile() {
		return stuMobile;
	}
	public void setStuMobile(String stuMobile) {
		this.stuMobile = stuMobile;
	}
	public String getStuArea() {
		return stuArea;
	}
	public void setStuArea(String stuArea) {
		this.stuArea = stuArea;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuBirthday=" + stuBirthday + ", stuSex="
				+ stuSex + ", stuIntr=" + stuIntr + ", stuMobile=" + stuMobile + ", stuArea=" + stuArea
				+ ", getStuId()=" + getStuId() + ", getStuName()=" + getStuName() + ", getStuBirthday()="
				+ getStuBirthday() + ", getStuSex()=" + getStuSex() + ", getStuIntr()=" + getStuIntr()
				+ ", getStuMobile()=" + getStuMobile() + ", getStuArea()=" + getStuArea() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
    
    
}
