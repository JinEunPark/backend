package com.facaieve.backend.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
@Getter
public class FashionPickupDto {



    @Getter
    public static class PostFashionPickupDto{

        String title;
        String body;
    }

    @Getter
    public static class PatchFashionPickupDto{

        long fashionPickupEntityId;
        String title;
        String body;
    }

    @Getter
    public static class GetFashionPickupDto{

        long fashionPickupEntityId;
    }
    @Getter
    public static class DeleteFashionPickupDto{

        long fashionPickupEntityId;
    }
    @Getter
    public static class ResponseFashionPickupDto{

        long fashionPickupEntityId;
        String title;
        String body;
        int views;
    }

}
