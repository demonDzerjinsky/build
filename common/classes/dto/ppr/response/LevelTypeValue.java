package ru.tomsknipi.cdb.ptdservice.common.classes.dto.ppr.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;
import ru.tomsknipi.cdb.ptdservice.common.types.AggregationType;

import java.util.UUID;

@Value
@ApiModel(description = "Структура ответа перечня возможных данных по запрошенного типа")
public class LevelTypeValue {
    @ApiModelProperty(name = "id", value = "идентификатор значения")
    private final UUID id;
    @ApiModelProperty(name = "id", value = "идентификатор типа значения")
    private final AggregationType idType;
    @ApiModelProperty(name = "id", value = "значение для отображения на клиенте")
    private final String displayValue;

}
