package cn.kgc.controller;

import cn.kgc.pojo.Bookinfo;
import cn.kgc.service.Bookservice;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Bookcontroller {
    @Autowired
    Bookservice bookservice;
    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> demo(Integer page,Integer rows) throws ParseException {
        PageInfo<Bookinfo> bookinfoPageInfo = bookservice.selectByBook(page, rows);
        List<Bookinfo> list = bookinfoPageInfo.getList();
        for (Bookinfo bookinfo : list) {
            Date publishDate = bookinfo.getPublishDate();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String format = simpleDateFormat.format(publishDate);
            Date parse = simpleDateFormat.parse(format);
            bookinfo.setPublishDate(parse);
        }
        Map<String,Object> map=new HashMap<>();
        map.put("total",bookinfoPageInfo.getTotal());
        //因为是分页，所以每次点击分页的时候，都会去查询。
        map.put("rows",bookinfoPageInfo.getList());
        return map;
    }

    @RequestMapping("index")
    public ModelAndView demo1(ModelAndView modelAndView){
        modelAndView.setViewName("main");
        return modelAndView;
    }


}
