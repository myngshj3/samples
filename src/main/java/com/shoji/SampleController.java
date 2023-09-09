package com.shoji;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("sample")
@Controller
public class SampleController {

	@GetMapping(value="test")
	public String test() {
		return "test";
	}
}
