/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lakshaytalkstocomputer.helloWorld.model;

import java.util.HashSet;
import java.util.Set; 
import javax.persistence.*;

/**
 *
 * @author silverpanda
 */
@Entity
public class Author 
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet();
   
    
    public Author()
    {
        
    }
    
    public Author(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Author(String firstName, String lastName, Set<Book> books)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books; 
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public Set<Book> getBooks()
    {
        return books;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setBooks(Set<Book> books)
    {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    }

