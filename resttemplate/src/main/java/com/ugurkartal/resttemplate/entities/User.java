package com.ugurkartal.resttemplate.entities;

import lombok.Data;

@Data
public class User {
	private long id;
    private String login;
    private String avatar_url;
    private String repos_url;
    private String type;
}