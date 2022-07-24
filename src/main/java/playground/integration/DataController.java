package playground.integration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(path = "/api/data")
public class DataController {
    private final DataSource source;

    public DataController(DataSource source) {
        this.source = source;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<DemoData> getData() {
        return source.getData();
    }
}
