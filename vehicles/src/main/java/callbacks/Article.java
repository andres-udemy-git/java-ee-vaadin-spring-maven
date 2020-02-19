package callbacks;

import javax.persistence.*;
import java.util.Date;

@Entity
@EntityListeners(ArticleListener.class)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    private String name;

    private Date date;

    public Article() {}

    public Article(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

//    @PrePersist
//    public void beforePersist() {
//        System.out.println("Before persisting article...");
//        date = LocalDate.now();
//        System.out.println(date);
//    }
//
//    @PostPersist
//    public void afterPersist() {
//        System.out.println("After persisting article...");
//        System.out.println(date);
//        System.out.println(LocalDate.now());
//    }
}
