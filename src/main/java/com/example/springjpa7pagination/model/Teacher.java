package com.example.springjpa7pagination.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * TEACHERテーブルのレコードを表すエンティティです。
 */
@Entity
@Data
public class Teacher {

    /** ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 名前 */
    @NotBlank
    @Size(max = 60)
    private String userName;

    /** E-Mail */
    @NotBlank
    @Email
    @Size(max = 254)
    private String email;

}
