package callbacks;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import java.time.LocalDate;
import java.util.Date;

public class ArticleListener {

    @PrePersist
    public void beforePersist(Article a) {
        System.out.println("Before persisting article...");
        a.setDate(new Date());
    }

    @PostPersist
    public void afterPersist(Article a) {
        System.out.println("After persisting article...");
    }

}
