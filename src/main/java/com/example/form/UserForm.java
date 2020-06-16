package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserForm {
	
	/*　名前　 */
	@NotBlank(message="名前は必須です")
	private String name;
	
	/*　年齢　 */
	@NotNull(message="年齢は必須です")
	private Integer age;
	
	/*　コメント　 */
	@NotBlank(message="コメントは必須です")
	private String comment;

	@Override
	public String toString() {
		return "UserForm [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
