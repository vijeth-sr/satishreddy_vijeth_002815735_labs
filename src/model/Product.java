/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Vijeth S
 */
public class Product {
    private String name;
    private String descr;
    private String availNum;
    private String price;

    public Product(String name, String descr, String availNum, String price) {
        this.name = name;
        this.descr = descr;
        this.availNum = availNum;
        this.price = price;
    }

    public Product() {
    }

    
    public String getName() {
        return name;
    }

    public String getDescr() {
        return descr;
    }

    public String getAvailNum() {
        return availNum;
    }

    public String getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }

    public void setPrice(String price) {
        this.price = price;
    }
  
    
}
