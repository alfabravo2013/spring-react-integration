package playground.integration;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class DataSource {
    private static final List<DemoData> DATA = List.of(
            new DemoData(1L, "First", "some description..."),
            new DemoData(2L, "Second", "nothing to see here"),
            new DemoData(3L, "Third", "third party information"),
            new DemoData(4L, "Fourth", "May 4th be with you!")
    );

    public Collection<DemoData> getData() {
        return DATA;
    }
}
