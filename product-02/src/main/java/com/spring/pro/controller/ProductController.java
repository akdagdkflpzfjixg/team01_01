package com.spring.pro.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.pro.domain.Product;
import com.spring.pro.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	public ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value = {"/productList", "/list"}, method = RequestMethod.GET)
		public String productList(Model model,
			@RequestParam(value = "pageNum", required = false, defaultValue = "1") 
		int pageNum) {
		
		Map<String, Object> modelMap = productService.productList(pageNum);
		model.addAllAttributes(modelMap);

		return "productList";
	}

	@RequestMapping("/productDetail")
	public String productDetail(Model model, int no,
		@RequestParam(value = "pageNum", required = false, defaultValue = "1") 
	int pageNum) {

		Product product = productService.getProduct(no);

		model.addAttribute("product", product);
		model.addAttribute("pageNum", pageNum);

		return "productDetail";
	}

	@RequestMapping(value = "writeProcess", method = RequestMethod.POST)
	public String insertProduct(Product product) {

		productService.insertProduct(product);

		return "redirect:productList";
	}

	@RequestMapping(value="/update")
	public String updateProduct(Model model, HttpServletResponse response,
			PrintWriter out, int no, String pass,
			@RequestParam(value = "pageNum", required = false, defaultValue = "1")
			int pageNum) {

		boolean result = productService.isPassCheck(no, pass);

		if (!result) {
			response.setContentType("text/html; charset=utf-8");
			out.println("<script>");
			out.println("	alert('비밀번호가 맞지 않습니다.');");
			out.println("	history.back();");
			out.println("</script>");

			return null;
		}

		Product product = productService.getProduct(no);

		model.addAttribute("product", product);
		model.addAttribute("pageNum", pageNum);
		return "updateForm";
	}

	@RequestMapping(value = "/update", method=RequestMethod.POST)
	public String updateProduct(Model model, HttpServletResponse response, 
			PrintWriter out, Product product, RedirectAttributes reAttrs,
			@RequestParam(value = "pageNum", required = false, defaultValue = "1") 
			int pageNum) {

		boolean result = productService.isPassCheck(product.getNo(), product.getPass());

		if (!result) {
			response.setContentType("text/html; charset=utf-8");
			out.println("<script>");
			out.println("	alert('비밀번호가 맞지 않습니다.');");
			out.println("	history.back();");
			out.println("</script>");

			return null;
		}

		productService.updateProduct(product);

		reAttrs.addAttribute("pageNum", pageNum);
		return "redirect:productList";
	}

	@RequestMapping({ "/delete", "/deleteProduct" })
	public String deleteProduct(HttpServletResponse response, PrintWriter out, int no, String pass,
			RedirectAttributes reAttrs,
			@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum) {

		boolean result = productService.isPassCheck(no, pass);

		if (!result) {
			response.setContentType("text/html; charset=utf-8");
			out.println("<script>");
			out.println("	alert('비밀번호가 맞지 않습니다.');");
			out.println("	history.back();");
			out.println("</script>");

			return null;
		}

		productService.deleteProduct(no);

		reAttrs.addAttribute("pageNum", pageNum);
		return "redirect:productList";
	}
}
