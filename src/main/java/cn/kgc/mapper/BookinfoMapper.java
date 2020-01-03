package cn.kgc.mapper;

import cn.kgc.pojo.Bookinfo;
import cn.kgc.pojo.BookinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookinfoMapper {
    long countByExample(BookinfoExample example);

    int deleteByExample(BookinfoExample example);

    int deleteByPrimaryKey(Integer bookId);

    int insert(Bookinfo record);

    int insertSelective(Bookinfo record);

    List<Bookinfo> selectByExample(BookinfoExample example);

    Bookinfo selectByPrimaryKey(Integer bookId);

    int updateByExampleSelective(@Param("record") Bookinfo record, @Param("example") BookinfoExample example);

    int updateByExample(@Param("record") Bookinfo record, @Param("example") BookinfoExample example);

    int updateByPrimaryKeySelective(Bookinfo record);

    int updateByPrimaryKey(Bookinfo record);
}