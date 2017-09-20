package com.like.term.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.like.term.domain.model.Term;
import com.like.term.domain.repository.TermRepository;
import com.like.term.domain.repository.dto.TermQueryDTO;

@Service("termService")
@Transactional
public class TermService {
	
    @Resource(name="termJpaRepository")
	private TermRepository termRepository;      
	
	public Term getTerm(Long pkTerm) {
		return termRepository.getTerm(pkTerm);
	}
	
	public Page<Term> getTermList(PageRequest pageRequest) {
		return termRepository.getTermList(pageRequest);
	}
	
	public List<Term> getTermList(TermQueryDTO termQueryDTO) {
		return termRepository.getTermList(termQueryDTO);
	}

	public void saveTerm(Term term) {
		termRepository.saveTerm(term);
	}
	
	public void saveTerm(List<Term> termList) {
		termRepository.saveTerm(termList);		
	}
	
	public void deleteTerm(Long pkTerm) {
		termRepository.deleteTerm(pkTerm);		
	}
	
	public void deleteTerm(List<Term> termList) {
		termRepository.deleteTerm(termList);	
	}
		
}