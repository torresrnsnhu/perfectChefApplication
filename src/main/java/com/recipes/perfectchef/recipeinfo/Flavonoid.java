package com.recipes.perfectchef.recipeinfo;

import java.util.Objects;

public class Flavonoid{
    public String name;
    public double amount;
    public String unit;

    public Flavonoid(String name, double amount, String unit){
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Flavonoid flavonoid = (Flavonoid) o;
        return Double.compare(amount, flavonoid.amount) == 0 && Objects.equals(name, flavonoid.name) && Objects.equals(unit, flavonoid.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, unit);
    }
}