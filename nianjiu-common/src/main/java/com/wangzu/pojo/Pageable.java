package com.wangzu.pojo;

public interface Pageable {
	/**
	 * @param page
	 * @return {@link #getPage()}
	 */
	Page setPage(Page page);

	Page getPage();
}
