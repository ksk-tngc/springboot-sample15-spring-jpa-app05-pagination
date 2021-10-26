package com.example.springjpa7pagination.config;

import com.example.springjpa7pagination.model.Teacher;
import com.example.springjpa7pagination.repository.TeacherRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

/**
 * Spring Boot起動時にコマンドライン実行されるコンポーネントです。
 * <p>DBの初期データを登録します。
 */
@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final TeacherRepository repository;

    /**
     * Spring Boot起動時にコマンドラインとして実行される処理です。
     * <p>DBの初期データを登録します。
     */
    @Override
    public void run(String... args) throws Exception {
        // teacherテーブルの初期データを登録
        for (int i = 0; i < 13; i++) {
            Teacher teacher = new Teacher();
            teacher.setUserName("Test" + i);
            teacher.setEmail("test" + i + "@example.com");
            repository.save(teacher);
        }
    }
}
