package ru.tomsknipi.cdb.ptdservice.common.classes.dto.ppr.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import ru.tomsknipi.cdb.ptdservice.common.types.AggregationType;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * варианты формирования отчета
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Структура ответа вариантов получения показателей")
public class LevelType {
    @ApiModelProperty(name = "id", value = "идентификатор типа")
    private AggregationType id;
    @ApiModelProperty(name = "abbrebiation", value = "аббревиатура")
    private String abbrebiation;
    @ApiModelProperty(name = "payload", value = "название для визуализации на клиенте")
    private String displayName;
}
