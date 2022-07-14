package vn.com.phamtan.chatservice.dto.base;

import lombok.Getter;
import lombok.Setter;

/**
 * Base paging request for chat service
 *
 * @since 13/07/2022
 * @author minhtan
 */
@Getter
@Setter
public class PagingReq {

    private int pageSize;
    private int pageNumber;

}
