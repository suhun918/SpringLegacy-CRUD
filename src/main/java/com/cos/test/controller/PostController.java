package com.cos.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.test.service.PostService;
import com.cos.test.vo.PostVO;

@Controller
@RequestMapping(value = "/post")
public class PostController {
	private static Logger logger = LoggerFactory.getLogger(PostController.class);

	@Autowired
	private PostService postService;

	@RequestMapping(value = "/list.do")
	public String findAll(@ModelAttribute("postVO") PostVO postVO, Model model) throws Exception {
		model.addAttribute("posts", postService.findAll(postVO));
		return "post/list";
	}

	@RequestMapping(value = "/detail.do")
	public String findById(@ModelAttribute("postVO") PostVO postVO, Model model) throws Exception {

		model.addAttribute("post", postService.findById(postVO));
		return "post/detail";
	}

	@RequestMapping(value = "/delete.do")
	public String delete(@ModelAttribute("postVO") PostVO postVO) throws Exception {
		postService.delete(postVO);
		return "redirect:/post/list.do";
	}

	@RequestMapping(value = "/writeForm.do")
	public String writeForm() throws Exception {
		return "post/writeForm";
	}

	@RequestMapping(value = "/save.do")
	public String save(@ModelAttribute("postVO") PostVO postVO) throws Exception {
		postService.save(postVO);
		return "redirect:/post/list.do";
	}
	
	@RequestMapping(value = "/updateForm.do")
	public String updateForm(@ModelAttribute("postVO") PostVO postVO, Model model) throws Exception{
		postVO=postService.findById(postVO);
		model.addAttribute("post", postVO);
		return "post/updateForm";
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public String update(@ModelAttribute("postVO") PostVO postVO) throws Exception{
//		postVO=postService.findById(postVO);
		postService.update(postVO);
		return "redirect:/post/list.do";
	}

}
