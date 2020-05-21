package ru.tomsknipi.cdb.ptdservice.common.classes.dto.ptd.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.tomsknipi.cdb.ptdservice.common.types.PtdProjectType;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@ApiModel(description = "Структура полей проекта разработки ПТД")
public class GetPtdProjectResponse {
    private Optional<GetPtdProjectResponsePayload> payload;
    private Optional<List<String>> messages;
}
