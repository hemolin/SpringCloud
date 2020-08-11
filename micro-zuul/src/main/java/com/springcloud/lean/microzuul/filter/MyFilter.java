package com.springcloud.lean.microzuul.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class MyFilter extends ZuulFilter {
    @Override
    /*
    -pre：路由之前
    -routing：路由之时
    -post： 路由之后
    -error：发送错误调用
    * */
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
//        通过网关获取请求对象
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("requestUrl：%s", request.getRequestURL()));
//        获取请求中的token
        String token = request.getHeader("micro-token");
        if (token == null) {
            log.warn("token is null..");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }
}
