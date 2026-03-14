package model;

import java.util.ArrayList;

public class Universe {

    private String name;
    private ArrayList<Series> seriesList;

    public Universe(String name) {
        this.name = name;
        this.seriesList = new ArrayList<>();
    }

    public void addSeries(Series series) {
        seriesList.add(series);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Series> getSeriesList() {
        return seriesList;
    }

    public void displaySeries() {
        System.out.println("Universe: " + name);

        for (Series s : seriesList) {
            System.out.println("- " + s.getName());
        }
    }
}