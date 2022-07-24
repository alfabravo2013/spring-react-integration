package playground.integration;

public class DemoData {
    private final Long id;
    private final String title;
    private final String description;

    public DemoData(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
