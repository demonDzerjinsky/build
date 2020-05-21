package ru.tomsknipi.cdb.ptdservice.common.classes.dto.ptd.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Optional;

/**
 * Реестр проектных документов
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@ApiModel(description = "Структура полей ответа с реестром проектов")
public class GetAllPtdProjectsResponse {
    @ApiModelProperty(name = "enties", value = "перечень проектов")
    private List<GetPtdProjectResponse> payload;
    @ApiModelProperty(name = "id", value = "статус формирования данных")
    private Optional<List<String>> messages;
}
