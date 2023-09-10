package com.recipes.perfectchef.recipeinfo;

import java.util.Objects;

public class CaloricBreakdown{
    public double percentProtein;
    public double percentFat;
    public double percentCarbs;

    public CaloricBreakdown(double percentProtein, double percentFat, double percentCarbs){
        this.percentProtein = percentProtein;
        this.percentFat = percentFat;
        this.percentCarbs = percentCarbs;
    }

    public double getPercentProtein() {
        return percentProtein;
    }

    public void setPercentProtein(double percentProtein) {
        this.percentProtein = percentProtein;
    }

    public double getPercentFat() {
        return percentFat;
    }

    public void setPercentFat(double percentFat) {
        this.percentFat = percentFat;
    }

    public double getPercentCarbs() {
        return percentCarbs;
    }

    public void setPercentCarbs(double percentCarbs) {
        this.percentCarbs = percentCarbs;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        CaloricBreakdown that = (CaloricBreakdown) o;
        return Double.compare(percentProtein, that.percentProtein) == 0 && Double.compare(percentFat, that.percentFat) == 0 && Double.compare(percentCarbs, that.percentCarbs) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(percentProtein, percentFat, percentCarbs);
    }

}