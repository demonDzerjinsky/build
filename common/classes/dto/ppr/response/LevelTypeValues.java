package ru.tomsknipi.cdb.ptdservice.common.classes.dto.ppr.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

import java.util.List;
import java.util.Optional;

@Value
@ApiModel(description = "Структура ответа возможных значений выбранного типа")
public class LevelTypeValues {
    @ApiModelProperty(name = "payload", value = "полезные данные отчета")
    Optional<List<LevelTypeValue>> payload;
    @ApiModelProperty(name = "messages", value = "ошибки, полученные в ходе формирования полезных данных")
    Optional<List<String>> messages;
}
