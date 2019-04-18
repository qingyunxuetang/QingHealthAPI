package com.qingyunxuetang.qinghealth.bean;

public class NewsItemBean {
    int id;
    String title;
    long newsDate;
    String brief;
    String author;
    String imageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(long newsDate) {
        this.newsDate = newsDate;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "NewsItemBean{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", newsDate=" + newsDate +
                ", brief='" + brief + '\'' +
                ", author='" + author + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
