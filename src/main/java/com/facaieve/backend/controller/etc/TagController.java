package com.facaieve.backend.controller.etc;

import com.facaieve.backend.dto.etc.TagDTO;
import com.facaieve.backend.entity.etc.TagEntity;
import com.facaieve.backend.mapper.etc.TagMapper;
import com.facaieve.backend.service.etc.TagService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag")
@AllArgsConstructor
public class TagController {

    private TagService tagService;
    private TagMapper tagMapper;



    @GetMapping("/get/{tagName}")
    public ResponseEntity getTagEntity(@PathVariable("tagName") String tagName){
        tagName = "tag";//todo delete

        TagEntity tagEntity = tagService.getTagEntityByTagName(tagName);
        TagDTO.GetTagDTO getTagDTO = tagMapper.tagEntityToGetTagEntity(tagEntity);
        return new ResponseEntity(getTagDTO, HttpStatus.OK);

    }

    @PostMapping("/post")
    public ResponseEntity postTag(@RequestBody TagDTO.PostTagDTO postTagDTO){

        postTagDTO.setTagName("tagNmae");//설정값
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
