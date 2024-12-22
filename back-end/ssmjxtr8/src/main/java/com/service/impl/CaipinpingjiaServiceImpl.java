package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CaipinpingjiaDao;
import com.entity.CaipinpingjiaEntity;
import com.service.CaipinpingjiaService;
import com.entity.view.CaipinpingjiaView;

@Service("caipinpingjiaService")
public class CaipinpingjiaServiceImpl extends ServiceImpl<CaipinpingjiaDao, CaipinpingjiaEntity> implements CaipinpingjiaService {


    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaipinpingjiaEntity> wrapper) {
		  Page<CaipinpingjiaView> page =new Query<CaipinpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    @Override
	public List<CaipinpingjiaView> selectListView(Wrapper<CaipinpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaipinpingjiaView selectView(Wrapper<CaipinpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
