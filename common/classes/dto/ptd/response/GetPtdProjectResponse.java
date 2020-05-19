package ru.tomsknipi.cdb.ptdservice.common.classes.dto.ptd.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import ru.tomsknipi.cdb.ptdservice.common.types.PtdProjectType;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Data
@ApiModel(description = "Структура полей проекта разработки ПТД")
public class GetPtdProjectResponse {
    @ApiModelProperty(name = "id", value = "идентификатор проекта в БД")
    UUID id;
    String projectName;
    Date startDatePlan;
    Date finishDatePlan;
    PtdProjectType projectType;
    Optional<List<String>> messages;
}
