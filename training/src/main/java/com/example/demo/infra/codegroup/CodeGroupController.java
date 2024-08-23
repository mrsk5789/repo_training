package com.example.demo.infra.codegroup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
	public class CodeGroupController {
		
	@RequestMapping(value="/infra/codegroup/codegroupxdmlist")
	public String codegroupxdmlist() {
		return "/infra/codegroup/codegroupxdmlist";
	}
	
	
}
