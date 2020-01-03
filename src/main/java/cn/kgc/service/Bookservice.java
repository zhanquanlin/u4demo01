package cn.kgc.service;

import cn.kgc.pojo.Bookinfo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface Bookservice {
    PageInfo<Bookinfo> selectByBook(Integer page,Integer pagesize);
}
