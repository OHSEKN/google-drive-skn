package google.drive.skn.domain;

import google.drive.skn.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String path;
    private String type;
    private Integer size;
}