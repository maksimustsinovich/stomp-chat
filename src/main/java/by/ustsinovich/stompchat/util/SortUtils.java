package by.ustsinovich.stompchat.util;

import by.ustsinovich.stompchat.dto.sort.SortCriteria;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Utility class for sorting operations.
 */
public class SortUtils {

    /**
     * Converts a list of {@link SortCriteria} into a {@link Sort} object.
     *
     * This method takes a list of sorting criteria, transforms each criterion into a
     * corresponding {@link Sort} object, and combines them into a single {@link Sort}
     * instance. If no criteria are provided, it returns an unsorted {@link Sort} instance.
     *
     * @param sortCriteria a list of {@link SortCriteria} to be converted into a {@link Sort} object
     * @return a {@link Sort} object representing the combined sorting criteria, or
     *         an unsorted {@link Sort} if the input list is empty
     */
    public static Sort toSort(List<SortCriteria> sortCriteria) {
        return sortCriteria
                .stream()
                .map(SortCriteria::asSort)
                .reduce(Sort.unsorted(), Sort::and);
    }

}
