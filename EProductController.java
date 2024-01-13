package com.ecommerce.Controller;
@Controller
public class EProductController {
	

	        @Autowired
	            private EProductService eproductService;
	            @RequestMapping(value = "/productList", method = RequestMethod.GET)
	            public String listProducts(ModelMap map)
	            {
	                map.addAttribute("eproduct", new EProductEntity());
	                map.addAttribute("productList", eproductService.getAllProducts());
	                return "productList";
	            }
	}



}
