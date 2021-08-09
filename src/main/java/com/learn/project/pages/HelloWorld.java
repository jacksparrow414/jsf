package com.learn.project.pages;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

/**
 * <a href="https://www.tutorialspoint.com/jsf/jsf_quick_guide.htm">教程地址</a>
 * <a href="https://github.com/javaee-samples/javaee7-samples">更多丰富的示例代码</a>
 * <a href="https://docs.oracle.com/javaee/7/index.html">JavaEE7教程</a>
 * <a href="https://www.zhihu.com/question/57400909">关于Tomcat下的静态资源访问</a>
 */
@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld implements Serializable {

    public String getMessage() {
        return "Hello World";
    }
}
