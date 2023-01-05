package com.facaieve.backend.dto.etc;

import lombok.*;


public class TagDTO {//수정
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor

    public static class ResponseTagDTO {

        String tagName;

        String description;

    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PostTagDTO {//생성
        String tagName;

        String description;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class GetTagDTO {//뭔가 필요할 거 같아서 만듬
        Long tagId;

        String tagName;

        String description;

    }



    @Getter
    @NoArgsConstructor
    public static class deleteTagDTO{//삭제할때도 태그 이름으로 삭제함

        Long tagId;

        String tagName;

        String description;

    }



}
