/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author luizr
 */
public class Project {
    
    private int id;
    private String name;
    private String description;
    private Date createtAt;
    private Date updatedAt;

    public Project(int id, String name, String description, Date createtAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createtAt = createtAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatetAt() {
        return createtAt;
    }

    public void setCreatetAt(Date createtAt) {
        this.createtAt = createtAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", name=" + name + ", description=" + description + ", createtAt=" + createtAt + ", updatedAt=" + updatedAt + '}';
    }
    
    
    
}
