package com.facaieve.backend.dto.comment;

import javax.persistence.*;

public class PortfolioCommentDTO {

    public static class ResponsePortfolioCommentDTO{
        String commentBody;
        String postType;
        Long postId;
    }

    public static class RequestPortfolioCommentDTO{
        Long fashionPickupCommentEntityId;
        String commentBody;
        String postType;
        Long postId;

    }
}
