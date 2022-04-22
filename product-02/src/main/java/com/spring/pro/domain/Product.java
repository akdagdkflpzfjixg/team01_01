package com.spring.pro.domain;

public class Product {

	private int no;
	private String name;
	private String writer;
	private int price;
	private int count;
	private String option1;
	private String type;
	private String detail;
	private int delivery;
	private String image;
	private String pass;
	public Product() {}
	
	public Product (int no, String name, String writer, int price, int count, String option1,
			String type, String detail, int delivery, String image, String pass) {
		
	this.no = no;
	this.name = name;
	this.writer = writer;
	this.price = price;
	this.count = count;
	this.option1 = option1;
	this.type = type;
	this.detail = detail;
	this.delivery = delivery;
	this.image = image;
	this.pass = pass;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getDelivery() {
		return delivery;
	}

	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
