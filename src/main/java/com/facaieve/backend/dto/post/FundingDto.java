package com.facaieve.backend.dto.post;


import jakarta.persistence.Column;
import lombok.Getter;

import java.util.Date;

@Getter
public class FundingDto {

    @Getter
    public static class PostFundingDto{

        String title;

        String Body;

        Date dueDate;

        Long targetPrice;//펀딩 목표금액

        Long fundedPrice;//펀딩된 현재 금액

    }
    @Getter
    public static class PatchFundingDto{

        String title;

        String Body;

        Date dueDate;

        Long targetPrice;//펀딩 목표금액

        Long fundedPrice;//펀딩된 현재 금액

    }
    @Getter
    public static class GetFundingDto{
        long fundingEntityId;
    }
    @Getter
    public static class DeleteFundingDto{

        long fundingEntityId;

    }
    @Getter
    public static class ResponseFundingDto{

        String title;

        String Body;

        Date dueDate;

        Long targetPrice;//펀딩 목표금액

        Long fundedPrice;//펀딩된 현재 금액

    }

}
