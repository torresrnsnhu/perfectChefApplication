package com.recipes.perfectchef.recipeinfo;

import com.recipes.perfectchef.recipeinfo.AnalyzedInstruction;
import com.recipes.perfectchef.recipeinfo.Nutrition;

import java.util.ArrayList;

public class Root{
    public boolean vegetarian;
    public boolean vegan;
    public boolean glutenFree;
    public boolean dairyFree;
    public boolean veryHealthy;
    public boolean cheap;
    public boolean veryPopular;
    public boolean sustainable;
    public boolean lowFodmap;
    public int weightWatcherSmartPoints;
    public String gaps;
    public int preparationMinutes;
    public int cookingMinutes;
    public int aggregateLikes;
    public int healthScore;
    public String creditsText;
    public String sourceName;
    public double pricePerServing;
    public int id;
    public String title;
    public int readyInMinutes;
    public int servings;
    public String sourceUrl;
    public String image;
    public String imageType;
    public Nutrition nutrition;
    public String summary;
    public ArrayList<Object> cuisines;
    public ArrayList<String> dishTypes;
    public ArrayList<String> diets;
    public ArrayList<Object> occasions;
    public ArrayList<AnalyzedInstruction> analyzedInstructions;
    public String spoonacularSourceUrl;
}