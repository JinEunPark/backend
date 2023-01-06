package com.facaieve.backend.dto.etc;

import com.facaieve.backend.entity.post.FashionPickupEntity;
import com.facaieve.backend.entity.post.FundingEntity;
import javax.persistence.*;
import lombok.*;

public class CategoryDTO {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResponseCategoryDTO{//응답
        String categoryName;
    }


    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class RequestCategoryDTO{//요청
        String categoryName;
    }

}
