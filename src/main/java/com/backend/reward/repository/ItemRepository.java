package com.backend.reward.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.reward.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
	@Query("select i from Item i")
	List<Item> findAll();
	@Query("select i from Item i where id=?1")
	Item getItemById(Long id);
	@Query("delete from Item where id=?1")
	void deleteById(Long id);
}