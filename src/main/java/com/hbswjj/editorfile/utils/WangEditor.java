package com.hbswjj.editorfile.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author wzh
 * @Date 2021/2/26 11:55 下午
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WangEditor {
    private Integer errno; //错误代码，0 表示没有错误。
    private String[] data; //已上传的图片路径

    public WangEditor(String[] data) {
        super();
        this.errno = 0;
        this.data = data;
    }
}
