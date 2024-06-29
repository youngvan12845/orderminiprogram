package com.entity.view;

import com.entity.CaipinpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

@TableName("caipinpingjia")
public class CaipinpingjiaView  extends CaipinpingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaipinpingjiaView(){
	}
 
 	public CaipinpingjiaView(CaipinpingjiaEntity caipinpingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, caipinpingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
