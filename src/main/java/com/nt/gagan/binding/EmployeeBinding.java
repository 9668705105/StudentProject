package com.nt.gagan.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
public class EmployeeBinding {
	@NotEmpty(message="Please enter username")
	private String uname;
	@NotEmpty(message="Please enter email")
	@Email(message="Please enter a valid email")
	private String email;
	@NotEmpty(message="Please enter pwd")
	private String pwd;
	@NotNull(message="Please enter phno")
	private Long phno;
	
}
