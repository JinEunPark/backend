package com.facaieve.backend.dto.etc;

import com.facaieve.backend.entity.post.FashionPickupEntity;
import com.facaieve.backend.entity.post.FundingEntity;
import lombok.*;

public class CategoryDTO {


    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class ResponseCategoryDTO{//응답
        String categoryName;
    }


    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class RequestCategoryDTO{//요청
        Long categoryId;
        String categoryName;
    }

}
