package model;

import util.BookCode;

public class Novel extends Book {
    private String codeBook;
    private String titleBook;
    private String publisher;
    private Integer publicationYear;
    private String writer;


    public Novel(String codeBook, String titleBook, String publisher, Integer publicationYear, String writer) {
        this.codeBook = codeBook;
        this.titleBook = titleBook;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.writer = writer;
    }
    public Novel() {

    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "(Novel = " +
                "Code: " + codeBook +
                ", Title: " + titleBook  +
                ", Publisher: " + publisher  +
                ", Published: " + publicationYear +
                ", Writer: " + writer  +
                ')';
    }
    @Override
    public String getTitle() {
        return titleBook;
    }

    @Override
    public String getId() {
        return codeBook;
    }


}
