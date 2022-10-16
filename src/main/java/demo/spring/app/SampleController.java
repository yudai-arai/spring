package com.example.demo.app;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * Add annotations here
 */
@Controller
@RequestMapping("/sample")
public class SampleController {
	
 	private final JdbcTemplate jdbcTemplate;

 	//Add an annotation here
	@Autowired
 	public SampleController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
 	}
	
	@GetMapping("/test")
	public String test(Model model) {

		String sql = "SELECT id, name, email"
				+ "FROM inquiry WHERE id = 1";

		Map<String Object> map = jdbcTemplate.queryForMap(sql);

		model.addAttribute("name", map.get("name"));
		model.addAttribute("email", map.get("email"));

		model.addAttribute("title", "Inquiry Form");

		return "test";
	}

}
