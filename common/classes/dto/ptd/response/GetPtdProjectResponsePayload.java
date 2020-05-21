package ru.tomsknipi.cdb.ptdservice.common.classes.dto.ptd.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.tomsknipi.cdb.ptdservice.common.types.PtdProjectType;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetPtdProjectResponsePayload {
    @ApiModelProperty(name = "id", value = "идентификатор проекта в БД")
    private UUID id;
    @ApiModelProperty(name = "projectName", value = "наименование проекта разработки")
    private String projectName;
    @ApiModelProperty(name = "startDatePlan", value = "плановая дата начала работ")
    private Date startDatePlan;
    @ApiModelProperty(name = "finishDatePlan", value = "плановая дата окончания работ")
    private Date finishDatePlan;
    @ApiModelProperty(name = "projectType", value = "тип проекта")
    private PtdProjectType projectType;
}
