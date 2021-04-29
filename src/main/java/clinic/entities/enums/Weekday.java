package clinic.entities.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Weekday {
    MONDAY ("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота"),
    SUNDAY ("Воскресенье");
    private final String description;
}
