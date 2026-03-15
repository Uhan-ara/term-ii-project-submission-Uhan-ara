package model;

import java.util.Hashmap;

public class Universe {

    private String name;
    private Hashmap<Series> seriesList;

    public Universe(String name) {
        this.name = name;
        seriesList = new Hashmap<>();
    }

    public void addSeries(Series series) {
        seriesList.put(series.getName(), series);
    }

    public Series getSeries(String name) {
        return seriesList.get(name);
    }

    public void displaySeries() {
        System.out.println("Universe: " + name);

        for (Series s : seriesList.values()) {
            System.out.println("- " + s.getName());
        }
    }
    
    public String getName() {
        return name;
    }

    public HashMap<String, Series> getSeriesList() {
        return seriesList;
    }
}
