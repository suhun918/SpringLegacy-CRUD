package com.cos.test.mapper;

import java.util.List;

import com.cos.test.vo.PostVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface PostMapper {
	public List<PostVO> findAll(PostVO postVO) throws Exception;

	public void save(PostVO postVO) throws Exception;

	public void update(PostVO postVO) throws Exception;

	public PostVO findById(PostVO postVO) throws Exception;

	public void delete(PostVO postVO) throws Exception;
}
