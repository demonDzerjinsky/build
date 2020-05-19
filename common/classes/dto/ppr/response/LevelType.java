package ru.tomsknipi.cdb.ptdservice.common.classes.dto.ppr.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;
import ru.tomsknipi.cdb.ptdservice.common.types.AggregationType;

/**
 * варианты формирования отчета
 */
@Value
@ApiModel(description = "Структура ответа вариантов получения показателей")
public class LevelType {
    @ApiModelProperty(name = "id", value = "идентификатор типа")
    private final AggregationType id;
    @ApiModelProperty(name = "abbrebiation", value = "аббревиатура")
    private final String abbrebiation;
    @ApiModelProperty(name = "payload", value = "название для визуализации на клиенте")
    private final String displayName;
}
