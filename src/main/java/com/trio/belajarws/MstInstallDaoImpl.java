package com.trio.belajarws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MstInstallDaoImpl implements MstInstallDao {

	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Override
	public List<MstInstall> findAll() {
		String sql = "select dinstall, vidversion, vdescription, vidpatch from ahmdsbsc_mstinstall";
		
		List<MstInstall> list = new ArrayList<MstInstall>();
		List<Map<String, Object>> listMap = jdbctemplate.queryForList(sql);
		for (Map<String, Object> map : listMap) {
		Date dinstall = (Date) map.get("dinstall");
		String vidversion = (String) map.get("vidversion");
		String vdescription = (String) map.get("vdescription");
		String vidpatch = (String) map.get("vidpatch");
		MstInstall objectInstall = new MstInstall();
		objectInstall.setDinstall(dinstall);
		objectInstall.setVidversion(vidversion);
		objectInstall.setVdescription(vdescription);
		objectInstall.setVidpatch(vidpatch);
		list.add(objectInstall);
		}
			
		return list;
}
	
	
}

