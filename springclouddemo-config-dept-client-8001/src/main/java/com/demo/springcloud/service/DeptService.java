package com.demo.springcloud.service;

import java.util.List;

import com.demo.springcloud.entity.Dept;

public interface DeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
