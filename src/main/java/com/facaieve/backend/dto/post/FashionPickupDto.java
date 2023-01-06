package com.facaieve.backend.dto.post;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
public class FashionPickupDto {



    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PostFashionPickupDto{

        String title;
        String body;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PatchFashionPickupDto{

        long fashionPickupEntityId;
        String title;
        String body;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class GetFashionPickupDto{

        long fashionPickupEntityId;
    }
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DeleteFashionPickupDto{

        long fashionPickupEntityId;
    }
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResponseFashionPickupDto{

        long fashionPickupEntityId;
        String title;
        String body;
        int views;
    }

}
