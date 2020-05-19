package ru.tomsknipi.cdb.ptdservice.common.classes.dto.ptd.response;

import lombok.Value;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Value
public class ExistPtdProjectResponse {
    private Optional<List<UUID>> ids;
}
