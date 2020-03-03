package com.example.demo.blog.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.blog.config.FtpConfig;
import com.example.demo.blog.entity.User;
import com.example.demo.blog.service.IUserService;
import com.example.demo.util.FtpUtil;
import com.example.demo.util.ResponseData;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ldx
 * @since 2020-02-26
 */
@RestController
@RequestMapping("/blog/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @Autowired
    private FtpConfig ftpConfig;

    /*
    查询所有用户信息
     */
    @RequestMapping("/getUserList")
    public ResponseData<List<User>> getUserList(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("id");
        ResponseData responseData = new ResponseData(iUserService.list(queryWrapper));
        return responseData;
    }

    /*
    查询指定用户信息
     */
    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET)
    public ResponseData getUserById(@PathVariable Long id){
        User user = iUserService.getById(id);
        ResponseData responseData = new ResponseData(user);
        return responseData;
    }

    /*
    插入用户信息
     */
    @RequestMapping(value = "/insertUser",method = RequestMethod.POST)
    public ResponseData insertUser(@RequestBody User user){
            iUserService.save(user);
            return ResponseData.SUCCESS;
    }

    /*
    修改用户信息
     */
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public ResponseData updateUser(@PathVariable Long id,@RequestBody User user){
        user.setId(id);
        iUserService.updateById(user);
        return ResponseData.SUCCESS;
    }

    /*
    删除用户信息
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    public ResponseData deleteUser(@PathVariable Long id){
        iUserService.removeById(id);
        return ResponseData.SUCCESS;
    }

    /*
    上传图片
     */
    @RequestMapping(value = "/updatefile" ,method = RequestMethod.POST)
    public ResponseData updateFile(@RequestParam("file") MultipartFile[] files) throws IOException {
        for(MultipartFile file : files){
            String oldName = file.getOriginalFilename();
            Calendar calendar = Calendar.getInstance();
            long time = calendar.getTimeInMillis();
            String ext = oldName.substring(oldName.lastIndexOf("."));
            oldName = time+ext;
            String savePath = FtpUtil.getDir(calendar);
            FtpUtil.pictureUploadByConfig(ftpConfig,oldName,savePath,file.getInputStream());
        }
        return ResponseData.SUCCESS;
    }

}
