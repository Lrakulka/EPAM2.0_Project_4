package com.homework.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "card_name")
    private String name;
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "id_bill")
    private Bill bill;
    @ManyToOne
    @JoinColumn(name = "id_actor")
    private Actor actor;
    
    public Card() {}
    
    public Card(String name) {
	this.name = name;
    }
    
    public Bill getBill() {
        return bill;
    }
    public void setBill(Bill bill) {
        this.bill = bill;
    }
    public Actor getUser() {
        return actor;
    }
    public void setUser(Actor user) {
        this.actor = user;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Card other = (Card) obj;
	if (id == null) {
	    if (other.id != null)
		return false;
	} else if (!id.equals(other.id))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	return true;
    }
    @Override
    public String toString() {
	return "Card [id=" + id + ", name=" + name + "]";
    }
}
