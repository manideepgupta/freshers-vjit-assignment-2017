package com.project.java;
public class Menu {
    public String items[];
    public double prices[];



    public Menu(String[] items,double[] prices){
        this.items=items;
        this.prices=prices;
    }
    public String[] getItems() {
        return items;
    }

    public double[] getPrices() {
        return prices;
    }


    public void setItems(String[] items) {
        this.items = items;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }
}

