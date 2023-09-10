package com.recipes.perfectchef.recipeinfo;

import java.util.Objects;

public class Equipment{
    public int id;
    public String name;
    public String localizedName;
    public String image;

    public Equipment(int id, String name, String localizedName, String image){
        this.id = id;
        this.name = name;
        this.localizedName = localizedName;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return id == equipment.id && Objects.equals(name, equipment.name) && Objects.equals(localizedName, equipment.localizedName) && Objects.equals(image, equipment.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, localizedName, image);
    }
}