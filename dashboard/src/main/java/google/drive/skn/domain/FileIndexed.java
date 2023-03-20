package google.drive.skn.domain;

import google.drive.skn.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileid;
    private List<String> keywords;
}
