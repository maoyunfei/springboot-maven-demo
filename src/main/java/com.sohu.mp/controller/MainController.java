package com.sohu.mp.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Mao YunFei on 2017/05/09.
 */
@RestController
public class MainController {

    @ApiOperation(value="测试接口", notes="")
    @ApiImplicitParam()
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "test";
    }
}
