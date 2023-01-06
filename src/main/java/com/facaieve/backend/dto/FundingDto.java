package com.facaieve.backend.dto;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
public class FundingDto {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PostFundingDto{

        String title;

        String Body;

        Date dueDate;

        Long targetPrice;//펀딩 목표금액

        Long fundedPrice;//펀딩된 현재 금액

    }
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PatchFundingDto{

        String title;

        String Body;

        Date dueDate;

        Long targetPrice;//펀딩 목표금액

        Long fundedPrice;//펀딩된 현재 금액

    }
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class GetFundingDto{
        long fundingEntityId;
    }
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DeleteFundingDto{

        long fundingEntityId;

    }
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResponseFundingDto{

        String title;

        String Body;

        Date dueDate;

        Long targetPrice;//펀딩 목표금액

        Long fundedPrice;//펀딩된 현재 금액

    }

}
