package ru.tomsknipi.cdb.ptdservice.common.classes.dto.ppr.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

import java.util.List;
import java.util.Optional;

/**
 * тип структуры данных, формируемой в запрос на ответ по видам возможных отчетов
 */
@Value
@ApiModel(description = "Структура ответа вариантов получения показателей")
public class NextLevelTypes {
    @ApiModelProperty(name = "payload", value = "полезные данные отчета")
    Optional<List<LevelType>> payload;
    @ApiModelProperty(name = "messages", value = "ошибки, полученные в ходе формирования полезных данных")
    Optional<List<String>> messages;
}
