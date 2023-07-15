package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FormEntity;
import com.example.demo.repository.FormRepository;

@Service
public class FormService {
	@Autowired
	private FormRepository repository;
	private FormEntity entity;
	
	/**
	 * ユーザー情報 新規登録
	 * @param user ユーザー情報
	 */
	public List<FormEntity> searchAll() {
		    return repository.findAll();
	}
}
