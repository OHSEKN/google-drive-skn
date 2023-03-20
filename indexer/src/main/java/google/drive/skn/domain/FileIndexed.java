package google.drive.skn.domain;

import google.drive.skn.domain.*;
import google.drive.skn.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileid;
    private List<String> keywords;

    public FileIndexed(Index aggregate) {
        super(aggregate);
    }

    public FileIndexed() {
        super();
    }
}
