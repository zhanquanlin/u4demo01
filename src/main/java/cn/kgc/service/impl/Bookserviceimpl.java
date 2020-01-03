package cn.kgc.service.impl;
import cn.kgc.mapper.BookinfoMapper;
import cn.kgc.pojo.Bookinfo;
import cn.kgc.pojo.BookinfoExample;
import cn.kgc.service.Bookservice;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Bookserviceimpl implements Bookservice {
    @Autowired
    BookinfoMapper bookinfoMapper;
    @Override
    public PageInfo<Bookinfo> selectByBook(Integer page, Integer pagesize) {
        PageHelper.startPage(page,pagesize);
        BookinfoExample bookinfoExample=new BookinfoExample();
        List<Bookinfo> bookinfos = bookinfoMapper.selectByExample(bookinfoExample);
        PageInfo<Bookinfo> pageInfo=new PageInfo(bookinfos);
        if(bookinfos instanceof Page){
            System.out.println("等于");
        }else{
            System.out.println("不等于");
        }
        return pageInfo;
    }
}
