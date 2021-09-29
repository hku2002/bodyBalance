package com.backend.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.menu.domain.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {}
