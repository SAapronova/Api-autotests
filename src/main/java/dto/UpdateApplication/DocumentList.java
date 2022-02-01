package dto.UpdateApplication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class DocumentList {
    public String docType;
    public String docName;
    public String groupType;
    public String groupName;
    public boolean selected;
    public boolean mandatory;
}
