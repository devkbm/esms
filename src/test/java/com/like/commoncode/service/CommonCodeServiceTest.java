package com.like.commoncode.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.like.commoncode.domain.model.CodeGroup;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CommonCodeServiceTest {

	@Autowired
	CommonCodeQueryService ccqs;
	
	@Autowired
	CommonCodeCommandService cccs;
	
	@Test
	public void 코드그룹등록() {		
		CodeGroup codeGroup = new CodeGroup("test", "테스트");
		
		cccs.saveCodeGroup(codeGroup);			
		
		assertThat(codeGroup.getCodeGroup(),is("test"));
	}
	
	@Test
	public void 코드그룹중복등록() {		
		CodeGroup codeGroup = new CodeGroup("test", "테스트");
		CodeGroup codeGroup2 = new CodeGroup("test", "테스트2");
		
		cccs.saveCodeGroup(codeGroup);			
		cccs.saveCodeGroup(codeGroup2);
		
		CodeGroup test = ccqs.getCodeGroup("test");	
		
		assertThat(test.getCodeGroupName(),is("테스트"));			
	}
	
	@Test
	public void 코드그룹조회() {
		
		CodeGroup codeGroup = new CodeGroup("test", "테스트");
		
		cccs.saveCodeGroup(codeGroup);
		
		CodeGroup test = ccqs.getCodeGroup("test");	
		
		assertThat(test.getCodeGroup(),is("test"));
	}
	
	

}
