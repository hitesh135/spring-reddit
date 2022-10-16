//package com.reddit.config;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Component;
//
//@Component
//public class CorsFilter implements Filter {
//
//	public static final Map<String, String> FILTER_MAP = new HashMap<>();
//	static {
//		FILTER_MAP.put("Access-Control-Allow-Origin", "*");
//		FILTER_MAP.put("Access-Control-Allow-Methods", "*");
//		FILTER_MAP.put("Access-Control-Max-Age", "3600");
//		FILTER_MAP.put("Access-Control-Allow-Headers",
//				"Accept,Authorization,Referer,Content-Type, Access-Control-Allow-Headers, X-Requested-With");
//		FILTER_MAP.put("X-Frame-Options", "SAMEORIGIN");
//		FILTER_MAP.put("x-xss-protection", "1;mode=block");
//		FILTER_MAP.put("Content-Security-Policy", "frame-ancestors script-src 'self'");
//		FILTER_MAP.put("Strict-Transport-Security", "max-age=63072000; includeSubDomains; preload");
//		FILTER_MAP.put("X-Content-Type-Options", "no sniff");
//		FILTER_MAP.put("Cache-control", "no-store, no-cache");
//		FILTER_MAP.put("Pragma", "no-cache");
//	}
//
//	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
//			throws IOException, ServletException {
//		HttpServletResponse response = (HttpServletResponse) res;
//		HttpServletRequest request = (HttpServletRequest) req;
//		boolean result = setHeader(response, request);
//		if (!result) {
//			chain.doFilter(req, res);
//		}
//	}
//
//	public void init(FilterConfig filterConfig) {
//		// Do nothing because of X and Y.
//	}
//
//	public void destroy() {
//		// Do nothing because of X and Y.
//	}
//
//	public static boolean setHeader(HttpServletResponse response, HttpServletRequest request) {
//		Set<Entry<String, String>> entrySet = FILTER_MAP.entrySet();
//		for (Entry<String, String> entery : entrySet) {
//			response.setHeader(entery.getKey(), entery.getValue());
//		}
//		if ("OPTIONS".equalsIgnoreCase(request.getMethod()) || "TRACE".equalsIgnoreCase(request.getMethod())) {
//			String origin = request.getHeader("origin");
//			if ((origin.contains("http://localhost:") || origin.contains("https://localhost:"))) {
//				response.setStatus(HttpServletResponse.SC_OK);
//			} else {
//				response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
//			}
//			return Boolean.TRUE;
//		}
//		return Boolean.TRUE;
//	}
//
//}

//public class CorsFilter implements Filter {
//
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//
//	}
//
//	@Override
//	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
//			FilterChain filterChain) throws IOException, ServletException {
//		HttpServletResponse response = (HttpServletResponse) servletResponse;
//		HttpServletRequest request = (HttpServletRequest) servletRequest;
//
//		response.setHeader("Access-Control-Allow-Origin", "*");
//		response.setHeader("Access-Control-Allow-Methods", "GET,POST,DELETE,PUT,OPTIONS");
//		response.setHeader("Access-Control-Allow-Headers", "*");
//		response.setHeader("Access-Control-Allow-Credentials", "true");
//		response.setHeader("Access-Control-Max-Age", "180");
//		filterChain.doFilter(servletRequest, servletResponse);
//	}
//
//	@Override
//	public void destroy() {
//
//	}
//}
