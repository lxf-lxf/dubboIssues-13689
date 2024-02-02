package com.test.dubbo;

import com.qiniu.http.Response;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class TestDubboServiceImpl implements TestDubboService{
    @Override
    public Response test() {
        return null;
    }
}
