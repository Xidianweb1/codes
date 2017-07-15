package org.zd.filterdemo ;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class EncodingFilter implements Filter {
	private String charSet ;
	public void init(FilterConfig config)
          throws ServletException{
		// ���ճ�ʼ���Ĳ���
		this.charSet = config.getInitParameter("charset") ;	
	}
	public void doFilter(ServletRequest request,
              ServletResponse response,
              FilterChain chain)
              throws IOException,
                     ServletException{
		request.setCharacterEncoding(this.charSet) ;
		chain.doFilter(request,response) ;
	}
	public void destroy(){
	}
}