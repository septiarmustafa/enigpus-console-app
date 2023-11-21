package model;

import util.BookCode;

public class Magazine extends Book {
    private String codeMagazine;
    private String titleMagazine;
    private String period;
    private Integer publicationYear;
    public Magazine(String codeMagazine, String titleMagazine, String period, Integer publicationYear) {
        this.codeMagazine = codeMagazine;
        this.titleMagazine = titleMagazine;
        this.period = period;
        this.publicationYear = publicationYear;
    }
    public Magazine() {

    }
    public String getCodeMagazine() {
        return codeMagazine;
    }

    public void setCodeMagazine(String codeMagazine) {
        this.codeMagazine = codeMagazine;
    }

    public String getTitleMagazine() {
        return titleMagazine;
    }

    public void setTitle(String titleMagazine) {
        this.titleMagazine = titleMagazine;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "(Magazine = " +
                "Code: " + codeMagazine +
                ", Title: " + titleMagazine  +
                ", Period: " + period  +
                ", Published: " + publicationYear +
                ')';
    }
    @Override
    public String getTitle() {
        return titleMagazine;
    }

    @Override
    public String getId() {
        return codeMagazine;
    }
}
