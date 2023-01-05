package com.facaieve.backend.mapper.etc;

import com.facaieve.backend.dto.etc.TagDTO;
import com.facaieve.backend.entity.etc.TagEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TagMapper {

    TagEntity postTagDtoToTagEntity(TagDTO.PostTagDTO postTagDTO);
    TagEntity getTagDtoToTagEntity(TagDTO.GetTagDTO getTagDTO);
    TagDTO.GetTagDTO tagEntityToGetTagEntity(TagEntity tagEntity);
    TagDTO.ResponseTagDTO tagEntityToResponseTagDTO(TagEntity tagEntity);


}
