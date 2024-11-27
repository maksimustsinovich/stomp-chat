package by.ustsinovich.stompchat.dto.sort.impl;

import by.ustsinovich.stompchat.dto.sort.SortCriteria;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;

@RequiredArgsConstructor
public enum UserSortCriteria implements SortCriteria {

    ;

    private final Sort sort;

    @Override
    public Sort asSort() {
        return sort;
    }

}
