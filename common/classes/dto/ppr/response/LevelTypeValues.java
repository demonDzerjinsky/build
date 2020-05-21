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

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@ApiModel(description = "Структура ответа возможных значений выбранного типа")
public class LevelTypeValues {
    @ApiModelProperty(name = "payload", value = "полезные данные отчета")
    private Optional<List<LevelTypeValue>> payload;
    @ApiModelProperty(name = "messages", value = "ошибки, полученные в ходе формирования полезных данных")
    private Optional<List<String>> messages;
}
