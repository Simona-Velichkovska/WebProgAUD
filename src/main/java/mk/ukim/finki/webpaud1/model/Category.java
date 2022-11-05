package mk.ukim.finki.webpaud1.model;

import lombok.Data;

@Data
public class Category {

    private Long id;
    private String name;
    private String description;

    public Category(String name, String description) {
        this.id = (long) (Math.random()*1000);
        this.name = name;
        this.description = description;
    }
/*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
*/
}
