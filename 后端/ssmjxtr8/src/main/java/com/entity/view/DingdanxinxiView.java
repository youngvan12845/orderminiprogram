package com.entity.view;

import com.entity.DingdanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

@TableName("dingdanxinxi")
public class DingdanxinxiView  extends DingdanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdanxinxiView(){
	}
 
 	public DingdanxinxiView(DingdanxinxiEntity dingdanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, dingdanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
