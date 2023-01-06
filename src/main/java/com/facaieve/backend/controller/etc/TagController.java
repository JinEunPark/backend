package com.facaieve.backend.controller.etc;

import com.facaieve.backend.dto.etc.TagDTO;
import com.facaieve.backend.entity.etc.TagEntity;
import com.facaieve.backend.mapper.etc.TagMapper;
import com.facaieve.backend.service.etc.TagService;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag")
@AllArgsConstructor
@Slf4j
public class TagController {

    private TagService tagService;
    private TagMapper tagMapper;



    @GetMapping("/get/{tagName}")//test pass
    public ResponseEntity getTagEntity(@PathVariable("tagName") String tagName){
        tagName = "tagName";//todo delete

        TagEntity tagEntity = tagService.getTagEntityByTagName(tagName);
        TagDTO.GetTagDTO getTagDTO = tagMapper.tagEntityToGetTagEntity(tagEntity);
        System.out.println(getTagDTO.getTagName());
        return new ResponseEntity(getTagDTO, HttpStatus.OK);

    }

    @PatchMapping("/patch")//tes
    public ResponseEntity patchTag(@RequestBody TagDTO.GetTagDTO getTagDTO){
        getTagDTO.setTagId(Long.valueOf(2));
        getTagDTO.setTagName("tagName");
        getTagDTO.setDescription("안녕하세요 박진은 입니다 수정했습니다");
        TagEntity  tagEntityChanged = tagService.modifyTagEntity(tagMapper.getTagDtoToTagEntity(getTagDTO));
        return new ResponseEntity(tagEntityChanged, HttpStatus.OK);

//        tagService todo 수정 메소드 추가해야함...
    }


    @PostMapping("/post")//test pass
    public ResponseEntity postTag(@RequestBody TagDTO.PostTagDTO postTagDTO){

        postTagDTO.setTagName("tagName");//설정값
        postTagDTO.setDescription("tagdescription");//설정값

        TagEntity tagEntity = tagMapper.postTagDtoToTagEntity(postTagDTO);
        TagDTO.ResponseTagDTO responseTagDTO = tagMapper.tagEntityToResponseTagDTO(tagService.createTagEntity(tagEntity));


        return new ResponseEntity(responseTagDTO,HttpStatus.CREATED);

    }


    @DeleteMapping("/delete")
    public ResponseEntity deleteTag(@RequestBody TagDTO.deleteTagDTO deleteTagDTO){

        tagService.deleteTagEntityService(tagService.getTagEntityByTagName(deleteTagDTO.getTagName()));
        return new ResponseEntity(HttpStatus.OK);
    }

}
