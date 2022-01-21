package dto.CreateApplication.ProfileDraft;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


/**
 * @Author Borisova Daria
 * В данном документе описаны параметры, которые переданые при запросе draft
 * Запрос является - Сохранением черновика
 *
 * @param-smartRepeat - признак был ли произведен Умный повтор
 *
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalDataGetResponse {
    private String comment;
    private String constantId;
    private Boolean smartRepeat;
    private ApplicationDraft application;
}
