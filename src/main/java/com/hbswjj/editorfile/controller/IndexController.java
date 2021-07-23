package com.hbswjj.editorfile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wzh
 * @Date 2021/7/23 11:14 下午
 * @Description
 */
@RestController
public class IndexController {

    @GetMapping("/editor/index")
    @ResponseBody
    public String index(){
        return "富文本图片上传程序";
    }
}
