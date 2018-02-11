package masterSpringMvc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import masterSpringMvc.forms.ProfileForm;

@Controller
@RequestMapping("/")
public class ProfileController {
	@GetMapping("profile")
	public String profileForm(@ModelAttribute("profileForm")ProfileForm profileForm,ModelMap map){
		map.addAttribute("message", "profile");
		return "profile/profilePage";
	}
	@PostMapping("profile")
	public String saveProfile(@Valid @ModelAttribute("profileForm")ProfileForm profileForm,BindingResult bindingResult){
		System.out.println(profileForm);
		return "redirect:/profile";
	}
}
