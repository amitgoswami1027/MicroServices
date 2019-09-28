package com.amitgoswami.microservices;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;

@Component

public class ZuulLoggingFilter extends ZuulFilter
{
    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @Override
    public String filterType()
    {
        return "pre";
    }

    @Override
    public int filterOrder()
    {
        return 1;
    }

    @Override
    public boolean shouldFilter()
    {
        return true;
    }

    @Override
    public Object run() throws ZuulException
    {
        //LOGIC
        HttpServletRequest request =
                RequestContext.getCurrentContext().getRequest();
        logger.info("request -> {} request uri -> {}",
                request, request.getRequestURI());

        return null;
    }
}
