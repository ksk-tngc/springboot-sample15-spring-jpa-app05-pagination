package com.example.springjpa7pagination.controller;

import com.example.springjpa7pagination.model.Teacher;
import com.example.springjpa7pagination.repository.TeacherRepository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

/**
 * メインのコントローラです。
 */
@Controller
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherRepository repository;

    /**
     * トップページ（一覧）を表示します。
     * <p>ページネーション実装のため {@code Pageable} を引数に取ります。
     */
    @GetMapping("/")
    public String showList(Model model, @PageableDefault(size = 5) Pageable pageable) {
        model.addAttribute("page", repository.findAll(pageable));
        return "list";
    }

    /**
     * 新規追加ページを表示します。
     */
    @GetMapping("/add")
    public String showAdd(@ModelAttribute Teacher teacher) {
        return "form";
    }

    /**
     * 保存処理を実行します。
     */
    @PostMapping("/save")
    public String save(@Validated @ModelAttribute Teacher teacher, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        repository.save(teacher);
        return "redirect:/";
    }

    /**
     * 編集ページを表示します。
     */
    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable Long id, Model model) {
        Teacher teacher = repository.findById(id).get();
        model.addAttribute("teacher", teacher);
        return "form";
    }

    /**
     * 削除処理を実行します。
     */
    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/";
    }

}