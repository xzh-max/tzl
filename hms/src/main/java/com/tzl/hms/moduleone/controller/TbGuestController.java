package com.tzl.hms.moduleone.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xzh
 * @since 2020-07-10
 */
@Controller
@RequestMapping("/moduleone/tbGuest")
public class TbGuestController {


    @RequestMapping("/guestAdd")
    public ModelAndView guestQuery(){
        ModelAndView mav = new ModelAndView();

        return mav;
    }


}

