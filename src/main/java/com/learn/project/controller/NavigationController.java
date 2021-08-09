package com.learn.project.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {

    /**
     * ?faces-redirect=true是重定向，JSF默认转发，页面上的url不会变，加上这个，url会根据直接请求变化
     * <a href="https://www.tutorialspoint.com/jsf/jsf_quick_guide.htm">Forward vs Redirect 部分</a>
     * @return
     */
    public String moveToHome() {
        return "helloWorld?faces-redirect=true";
    }

    public String moveToPage2() {
        return "page2";
    }
}
