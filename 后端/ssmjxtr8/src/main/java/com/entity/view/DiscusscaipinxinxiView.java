package com.entity.view;

import com.entity.DiscusscaipinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

@TableName("discusscaipinxinxi")
public class DiscusscaipinxinxiView  extends DiscusscaipinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusscaipinxinxiView(){
	}
 
 	public DiscusscaipinxinxiView(DiscusscaipinxinxiEntity discusscaipinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusscaipinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
