package my.projetc.soccer_news_projetc.domain;

public class News {
    private String title;

    private String desription;

    public News(String title, String desription) {
        this.title = title;
        this.desription = desription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

}
