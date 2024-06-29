package com.entity.view;

import com.entity.CaipinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

@TableName("caipinxinxi")
public class CaipinxinxiView  extends CaipinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaipinxinxiView(){
	}
 
 	public CaipinxinxiView(CaipinxinxiEntity caipinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, caipinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
