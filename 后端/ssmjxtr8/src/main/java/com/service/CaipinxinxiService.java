package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaipinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaipinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipinxinxiView;


public interface CaipinxinxiService extends IService<CaipinxinxiEntity> {

    List<CaipinxinxiView> selectListView(Wrapper<CaipinxinxiEntity> wrapper);
   	
   	CaipinxinxiView selectView(@Param("ew") Wrapper<CaipinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaipinxinxiEntity> wrapper);
   	
}

