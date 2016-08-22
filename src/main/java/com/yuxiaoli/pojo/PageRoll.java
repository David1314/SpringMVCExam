package com.yuxiaoli.pojo;

public class PageRoll {
	private int currPage=1;//当前页面
	private int pageSize=10;//每页的记录数
	private int pageCount;//总页数
	private int totalCount;//总记录数
	
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageCount() {
		if(totalCount%pageSize==0){
			pageCount=totalCount/pageSize;
		}else{
			pageCount=totalCount/pageSize+1;
		}
		return pageCount;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
}
