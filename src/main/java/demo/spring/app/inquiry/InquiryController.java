package com.example.demo.app.inquiry;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("inquiry")
public class InquiryController {

// 	private final InquiryService inquiryService;

	//Add an annotation here
// 	public InquiryController(InquiryService inquiryService){
// 		this.inquiryService = inquiryService;
// 	}

	@GetMapping
	public String index(Model model) {

		//hands-on

		return "inquiry/index";
	}

	@GetMapping("/form")
	public String form(InquiryForm inquiryForm, Model model,
					   @ModelAttribute("complete")String complete) {
		model.addAttribute("title", "Inquiry Form")
		return "inquiry/form";
	}

	@PostMapping("/form")
	public String formGoBack(InquiryForm inquiryForm, Model model) {
		model.addAttribute("title", "Inquiry Form");
		return "inquiry/form";
	}


	@PostMapping("/confirm")
	public String confirm(@Validated InquiryForm inquiryForm,
						  BindingResult result,
						  Model model) {

		if (result.hasError()) {
			model.addAttribute("title", "Inquiry Form");
			return "inquiry/form";
		}
		model.addAttribute("title", "確認ページ");

		return "inquiry/confirm";
	}

	@PostMapping("/complete")
	public String complete(@Validated InquiryForm inquiryForm,
						   BindingResult result,
						   Model model,
						   RedirectAttribute redirectAttribute) {

		if (result.hasError()) {
			model.addAttribute("title", "Inquiry Form");
			return "inquiry/form";
		}

		redirectAttribute.addFlashAttribute("complete", "Registerd!");
		//redirect

		return "redirect:/inquiry/form";
	}

}
