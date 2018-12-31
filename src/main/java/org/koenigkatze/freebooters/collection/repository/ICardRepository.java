package org.koenigkatze.freebooters.collection.repository;

import java.util.Optional;

import org.koenigkatze.freebooters.collection.model.card.ICard;

public interface ICardRepository extends Iterable<ICard>
{

	void add(ICard card);

	Optional<ICard> getById(long id);

	int getCursor();
	
	ICard next();
	
	ICard previous();
}