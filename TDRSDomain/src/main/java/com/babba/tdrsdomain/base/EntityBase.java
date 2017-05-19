/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.babba.tdrsdomain.base;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Beko
 */
@MappedSuperclass
public abstract class EntityBase implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID",updatable = false,nullable = false)
    protected Long id;

    public EntityBase()
    {
    }
    

    public void setId(Long id)
    {
        this.id = id;
    }
    
    public Long getId()
    {
        return id;
    }
    
}
