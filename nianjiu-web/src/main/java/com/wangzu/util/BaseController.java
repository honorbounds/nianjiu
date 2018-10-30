package com.wangzu.util;

import java.io.IOException;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

public class BaseController {
	@Autowired
	protected HttpSession session;

	@Autowired
	protected HttpServletRequest request;

	@Autowired
	protected HttpServletResponse response;

	/**
	 * 将对象转换成JSON字符串，并响应回前台
	 *
	 * @param object
	 * @throws IOException
	 */
	public void writeJson(Object object) {
		try {
			String json = JSON.toJSONStringWithDateFormat(object, "yyyy-MM-dd HH:mm:ss");
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write(json);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
