package com.facaieve.backend.dto.post;

import jakarta.persistence.Column;
import lombok.Getter;

public class PortfolioDto {



    @Getter
    public static class PostPortfolioDtoDto{

        String title;
        String body;
        int views;

    }

    @Getter
    public static class PatchPortfolioDtoDto{

        long portfolioEntityId;
        String title;
        String body;
        int views;
    }

    @Getter
    public static class GetPortfolioDtoDto{

        long portfolioEntityId;
    }

    @Getter
    public static class DeletePortfolioDtoDto{

        long portfolioEntityId;
    }

    @Getter
    public static class ResponsePortfolioDto{

        long portfolioEntityId;
        String title;
        String body;
        int views;
    }

}
