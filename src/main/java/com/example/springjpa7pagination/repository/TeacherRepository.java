package com.example.springjpa7pagination.repository;

import com.example.springjpa7pagination.model.Teacher;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TEACHERテーブルのリポジトリインターフェースです。
 */
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
