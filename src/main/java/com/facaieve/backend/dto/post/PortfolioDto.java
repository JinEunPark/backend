package com.facaieve.backend.dto.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class PortfolioDto {



    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PostPortfolioDtoDto{

        String title;
        String body;
        int views;

    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PatchPortfolioDtoDto{

        long portfolioEntityId;
        String title;
        String body;
        int views;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class GetPortfolioDtoDto{

        long portfolioEntityId;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DeletePortfolioDtoDto{

        long portfolioEntityId;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResponsePortfolioDto{

        long portfolioEntityId;
        String title;
        String body;
        int views;
    }

}
