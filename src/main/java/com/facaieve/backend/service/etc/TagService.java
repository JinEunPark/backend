package com.facaieve.backend.service.etc;

import com.facaieve.backend.entity.etc.TagEntity;
import com.facaieve.backend.repository.etc.TagRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TagService {

    TagRepository tagRepository;


    public TagEntity createTagEntity(TagEntity tagEntity){//중복 생성 방지

        if(tagRepository.existsByTagName(tagEntity.getTagName())){
            throw new RuntimeException("same tag name already exist the tag please check!");
        }else{

            TagEntity savedTagEntity = tagRepository.save(tagEntity);
            return savedTagEntity;

        }
    }

    public TagEntity getTagEntityByTagName(String tagName){

        if(tagRepository.existsByTagName(tagName)){
            TagEntity tagEntity = tagRepository.findByTagName(tagName);
            return tagEntity;
        }else{
            //ex
            throw new RuntimeException("there no kind of tag!");
        }

    }

    public TagEntity deleteTagEntityService(TagEntity tagEntity){// 존재하지 않는 tag 삭제 방지

       if(tagRepository.existsById(tagEntity.getTagId())){
           //delete
           tagRepository.delete(tagEntity);
           return tagEntity;
       }else{
           //ex
           throw new RuntimeException("there no kind of tag!");
       }
    }

}
