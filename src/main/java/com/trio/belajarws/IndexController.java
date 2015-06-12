package com.trio.belajarws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	
	@Autowired
	private MstInstallDao dao;
	
	@RequestMapping ("/list")
	public @ResponseBody List<MstInstall> getListInstall(){
		return dao.findAll();
	}
	
	
	
}
