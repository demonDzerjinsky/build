package ru.tomsknipi.cdb.ptdservice.common.classes.dto.ppr.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import ru.tomsknipi.cdb.ptdservice.common.types.AggregationType;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Структура ответа перечня возможных данных по запрошенного типа")
public class LevelTypeValue {
    @ApiModelProperty(name = "id", value = "идентификатор значения")
    private UUID id;
    @ApiModelProperty(name = "id", value = "идентификатор типа значения")
    private AggregationType idType;
    @ApiModelProperty(name = "id", value = "значение для отображения на клиенте")
    private String displayValue;

}
