package com.entity.view;

import com.entity.CaipinfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

@TableName("caipinfenlei")
public class CaipinfenleiView  extends CaipinfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaipinfenleiView(){
	}
 
 	public CaipinfenleiView(CaipinfenleiEntity caipinfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, caipinfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
