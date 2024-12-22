package com.entity.view;

import com.entity.DingdanpeisongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

@TableName("dingdanpeisong")
public class DingdanpeisongView  extends DingdanpeisongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdanpeisongView(){
	}
 
 	public DingdanpeisongView(DingdanpeisongEntity dingdanpeisongEntity){
 	try {
			BeanUtils.copyProperties(this, dingdanpeisongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
