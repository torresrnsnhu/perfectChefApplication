package com.recipes.perfectchef.recipeinfo;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Objects;

@Getter
public class AnalyzedInstruction{
    public String name;
    public ArrayList<Step> steps;

    public AnalyzedInstruction(){}
    public AnalyzedInstruction(String name, ArrayList<Step> steps){
        this.name = name;
        this.steps = steps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSteps(ArrayList<Step> steps) {
        this.steps = steps;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        AnalyzedInstruction that = (AnalyzedInstruction) o;
        return Objects.equals(name, that.name) && Objects.equals(steps, that.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, steps);
    }

    @Override
    public String toString() {
        return "AnalyzedInstruction{" +
                "name='" + name + '\'' +
                ", steps=" + steps +
                '}';
    }
}