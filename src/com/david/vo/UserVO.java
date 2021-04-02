package com.david.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7410103917464027550L;
	private Integer id;
	private String name;
	private Integer age;
	private String phone;

}
