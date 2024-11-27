package by.ustsinovich.stompchat.dto.pagination;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import lombok.Data;

/**
 * Pagination Criteria POJO.
 */
@Data
public class PaginationCriteria {

    @Min(1)
    @JsonProperty("pageNumber")
    private Integer pageNumber = 1;

    @Min(1)
    @JsonProperty("pageSize")
    private Integer pageSize = 1;

}
