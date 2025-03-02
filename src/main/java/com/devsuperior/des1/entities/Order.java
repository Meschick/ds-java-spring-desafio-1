package com.devsuperior.des1.entities;

public class Order {
    private int code;
    private double valueBasic;
    private double discout;


    public Order(int code, double valueBasic, double discout) {
        this.code = code;
        this.valueBasic = valueBasic;
        this.discout = discout;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getValueBasic() {
        return valueBasic;
    }

    public void setValueBasic(double valueBasic) {
        this.valueBasic = valueBasic;
    }

    public double getDiscout() {
        return discout;
    }

    public void setDiscout(double discout) {
        this.discout = discout;
    }
}
