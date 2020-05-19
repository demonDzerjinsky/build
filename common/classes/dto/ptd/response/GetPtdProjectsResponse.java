package ru.tomsknipi.cdb.ptdservice.common.classes.dto.ptd.response;

import lombok.Data;

import java.util.List;
import java.util.Optional;

/**
 * Реестр проектных документов
 */
@Data
public class GetPtdProjectsResponse {
    List<GetPtdProjectResponse> enties;
    Optional<List<String>> messages;
}
