package ru.tomsknipi.cdb.ptdservice.common.classes.dto.ppr.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Optional;

/**
 * тип структуры данных, формируемой в запрос на ответ по видам возможных отчетов
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@ApiModel(description = "Структура ответа вариантов получения показателей")
public class NextLevelTypes {
    @ApiModelProperty(name = "payload", value = "полезные данные отчета")
    private Optional<List<LevelType>> payload;
    @ApiModelProperty(name = "messages", value = "ошибки, полученные в ходе формирования полезных данных")
    private Optional<List<String>> messages;
}
