package com.alvina.emsdemo.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="users")
public class login {
@Id
private String username;
private String password_hash;
public login(String username, String password_hash)
{
    this.username=username;
    this.password_hash=password_hash;
}
public String getUsername() {
    return username;
}
public void setUsername(String username) {
    this.username = username;
}
public String getPassword_hash() {
    return password_hash;
}
public void setPassword_hash(String password_hash) {
    this.password_hash = password_hash;
}

}