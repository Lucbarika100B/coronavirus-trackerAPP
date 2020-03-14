package io.javacore.coronavirustracker.models;

public class LocationStats {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    private String country;
    private int latestTotalCases;
    private int diffFromPreviousDay;

    public int getDiffFromPreviousDay(){
        return diffFromPreviousDay;
    }
    public void setDiffFromPreviousDay(int diffFromPreviousDay){
        this.diffFromPreviousDay = diffFromPreviousDay;

    }




    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
