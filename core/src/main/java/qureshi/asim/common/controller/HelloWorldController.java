package qureshi.asim.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

          System.out.println("METHOD:" + request.getMethod());
          System.out.println("hero:" + request.getParameter("hero"));
          System.out.println("spyeye:" + request.getParameter("spyeye"));

          ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "hello world!!");

		return model;
	}

}