package by.ustsinovich.stompchat.util;

import by.ustsinovich.stompchat.dto.pagination.PaginationCriteria;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

/**
 * Utility class for pagination operations.
 */
public class PaginationUtils {

    /**
     * Converts a {@link PaginationCriteria} object into a {@link Pageable} object.
     *
     * This method takes pagination criteria, such as the page number and page size,
     * and creates a {@link Pageable} instance using the provided values. The resulting
     * {@link Pageable} can be used for querying paginated data from a data source.
     *
     * @param paginationCriteria the criteria containing pagination information, such as page number and size
     * @return a {@link Pageable} object representing the pagination information
     */
    public static Pageable toPageable(PaginationCriteria paginationCriteria) {
        return PageRequest.of(paginationCriteria.getPageNumber(), paginationCriteria.getPageSize());
    }

}
