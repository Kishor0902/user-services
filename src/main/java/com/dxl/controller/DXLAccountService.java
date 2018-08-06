package com.dxl.controller;

import com.dxl.bean.DXLAccountVO;

public interface DXLAccountService {
	
	public void saveAccount(DXLAccountVO dxlAccountVO);
	public String getAccountType(String account)

}
