package com.facaieve.backend.dto;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class PortfolioDto {



    @Getter
    @NoArgsConstructor
    public static class PostPortfolioDtoDto{

        String title;
        String body;
        int views;

    }

    @Getter
    @NoArgsConstructor
    public static class PatchPortfolioDtoDto{

        long portfolioEntityId;
        String title;
        String body;
        int views;
    }

    @Getter
    @NoArgsConstructor
    public static class GetPortfolioDtoDto{

        long portfolioEntityId;
    }

    @Getter
    @NoArgsConstructor
    public static class DeletePortfolioDtoDto{

        long portfolioEntityId;
    }

    @Getter
    @NoArgsConstructor
    public static class ResponsePortfolioDto{

        long portfolioEntityId;
        String title;
        String body;
        int views;
    }

}
