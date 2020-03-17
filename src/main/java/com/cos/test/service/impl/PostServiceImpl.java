package com.cos.test.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cos.test.mapper.PostMapper;
import com.cos.test.service.PostService;
import com.cos.test.vo.PostVO;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;

@Service("postService")
public class PostServiceImpl extends EgovAbstractServiceImpl implements PostService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PostServiceImpl.class);

	@Autowired
	private PostMapper postMapper;

	@Autowired
	private EgovIdGnrService egovIdGnrServicep;

	@Override
	public List<PostVO> findAll(PostVO postVO) throws Exception {

		return postMapper.findAll(postVO);
	}

	@Override
	public PostVO findById(PostVO postVO) throws Exception {
		postVO = postMapper.findById(postVO);
		return postVO;
	}

	@Override
	public void save(PostVO postVO) throws Exception {
		postMapper.save(postVO);

	}

	@Override
	public void delete(PostVO postVO) throws Exception {
		postMapper.delete(postVO);
	}

	@Override
	public void update(PostVO postVO) throws Exception {
		postMapper.update(postVO);

	}

}
