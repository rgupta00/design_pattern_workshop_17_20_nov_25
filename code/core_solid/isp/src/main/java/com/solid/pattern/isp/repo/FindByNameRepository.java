package com.solid.pattern.isp.repo;

import java.util.List;

import com.solid.pattern.isp.entities.Entity;

public interface FindByNameRepository<T extends Entity> {
	public List<T> findByName(String name) ;
}
