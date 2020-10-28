package com.kk.pojo;

public class Books {
    private int id;
    private String bookName;
    private int counts;
    private String detail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", counts=" + counts +
                ", detail='" + detail + '\'' +
                '}';
    }
}
