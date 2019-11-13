package com.byzx.model;
/**@文件名: PageBean.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月20日下午9:13:23
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月20日下午9:13:23</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class PageBean {

	private int page; 
	private int rows; 
	@SuppressWarnings("unused")
	private int start;  
	
	
	public PageBean(int page, int rows) {
		super();
		this.page = page;
		this.rows = rows;
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getStart() {
		return (page-1)*rows;
	}
}
