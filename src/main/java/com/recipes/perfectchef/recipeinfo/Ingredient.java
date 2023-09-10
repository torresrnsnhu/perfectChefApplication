package com.recipes.perfectchef.recipeinfo;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Objects;

@Getter
public class Ingredient{
    public int id;
    public String name;
    public double amount;
    public String unit;
    public ArrayList<Nutrient> nutrients;
    public String localizedName;
    public String image;

    public Ingredient(int id, String name, double amount, String unit, ArrayList<Nutrient> nutrients, String localizedName, String image){
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.nutrients = nutrients;
        this.localizedName = localizedName;
        this.image = image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setNutrients(ArrayList<Nutrient> nutrients) {
        this.nutrients = nutrients;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return id == that.id && Double.compare(amount, that.amount) == 0 && Objects.equals(name, that.name) && Objects.equals(unit, that.unit) && Objects.equals(nutrients, that.nutrients) && Objects.equals(localizedName, that.localizedName) && Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, amount, unit, nutrients, localizedName, image);
    }
}