/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.babba.tdrsdomain.entities;

import com.babba.tdrsdomain.base.EntityBase;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Beko
 */
@Entity
@Table(name = "TRAINEE")
public class Trainee extends EntityBase implements Serializable
{

    private static final long serialVersionUID = 1L;

    //This default constructor is a MUST for Hibernate
    public Trainee()
    {
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainee))
        {
            return false;
        }
        Trainee other = (Trainee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.babba.tdrsdomain.entities.Trainee[ id=" + id + " ]";
    }
    
}
