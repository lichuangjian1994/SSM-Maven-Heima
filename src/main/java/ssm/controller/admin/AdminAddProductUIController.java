package ssm.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ssm.entity.Category;
import ssm.service.AdminProductService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class AdminAddProductUIController {
    @Autowired
    AdminProductService service;
    
    
    @RequestMapping(value = "/adminAddProductUI", method = RequestMethod.GET)
    public String doGetAddProductUI(HttpServletRequest request, HttpServletResponse response){
        List<Category> categoryList = service.findAllCategory();
        request.setAttribute("categoryList", categoryList);
        return "/admin/product/add";
    }
}
