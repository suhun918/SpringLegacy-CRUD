package com.cos.test.service;

import java.util.List;

import com.cos.test.vo.PostVO;

public interface PostService {
	public List<PostVO> findAll(PostVO postVO) throws Exception;

	public void save(PostVO postVO) throws Exception;

	public void update(PostVO postVO) throws Exception;

	public PostVO findById(PostVO postVO) throws Exception;

	public void delete(PostVO postVO) throws Exception;
}
