/**
 * 
 */
package com.homework.dao;

import com.homework.entities.User;

import java.util.Set;

import com.homework.entities.Card;
/**
 * @author asd
 *
 */
public interface ClientDAO {
    /**
     * Return set of user cards.
     * @param user of cards
     * @return - set of cards
     */
    Set<Card> getCards(User user);
    
    /**
     * Block bill which connected to this card.
     * @param card which connected to the bill
     */
    void blockCard(Card card);
    
    /**
     * Make payment with bill which connected to the card
     * @param card which connected to the bill
     */
    void makePayment(Card card, double payment);
    
    /**
     * Fill bill which connected to the card
     * @param card which connected to the bill
     */
    void fillCard(Card card, double fill);
}
