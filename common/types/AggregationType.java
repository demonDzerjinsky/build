package ru.tomsknipi.cdb.ptdservice.common.types;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * типы виды агрегирования проектных показателей
 */
public enum AggregationType {
    // дополняем по мере реалзиации
    OPER_COMPANY("OPER_COMPANY", "Оператор"), /*оператор*/
    RES("RES", "Категория запасов"), /*тип категории запасов*/
    LIC("LIC", "Лицензия"), /*лицензионный участок*/
    LIC_OWNER("LIC_OWNER", "Недропользователь"); /*владелец лицензии (недропользователь)*/

    private String abbreviation;
    private String displayName;

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getDisplayName() {
        return displayName;
    }

    private static final Map<String, AggregationType> lookup = new HashMap<>();
    private static final Map<String, String> lookupDisplayName = new HashMap<>();

    static {
        for (AggregationType t : AggregationType.values()) {
            lookup.put(t.getAbbreviation(), t);
            lookupDisplayName.put(t.getAbbreviation(), t.getDisplayName());
        }
    }

    private AggregationType(String abbreviation, String displayName) {
        this.abbreviation = abbreviation;
        this.displayName = displayName;
    }

    /**
     * получаем тип по заданному короткому наименованию
     * @param abbreviation
     * @return
     */
    public static Optional<AggregationType> get(String abbreviation) {
        if (abbreviation == null && abbreviation.isEmpty()) {
            return Optional.empty();
        }
        if (lookup.keySet().contains(abbreviation)) {
            return Optional.of(lookup.get(abbreviation));
        }
        return Optional.empty();
    }

    /**
     * получаем наименование для визуализации по заданному корткому наименованию
     * @param abbreviation
     * @return
     */
    public static Optional<String> getDisplayName(String abbreviation) {
        if (abbreviation == null && abbreviation.isEmpty()) {
            return Optional.empty();
        }
        if (lookupDisplayName.keySet().contains(abbreviation)) {
            return Optional.of(lookupDisplayName.get(abbreviation));
        }
        return Optional.empty();
    }
}
