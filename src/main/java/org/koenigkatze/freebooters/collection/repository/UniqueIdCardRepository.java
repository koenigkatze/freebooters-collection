package org.koenigkatze.freebooters.collection.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.koenigkatze.freebooters.collection.model.card.ICard;

public final class UniqueIdCardRepository implements ICardRepository
{
	private final List<ICard> m_repository;
	private int m_cursor;

	public UniqueIdCardRepository()
	{
		super();
		this.m_repository = new ArrayList<>();
		m_cursor = -1;
		Collections.sort(m_repository);
	}
	
	@Override
	public void add(final ICard cardToAdd) {
		for (final ICard cardInRepository : m_repository) {
			if (cardInRepository.equals(cardToAdd)) {
				throw new IllegalArgumentException("A card with the same id is already registered in the repository! Id: "+cardToAdd.getId()); 
			}
		}
		this.m_repository.add(cardToAdd);
	}
	
	@Override
	public Optional<ICard> getById(final long idToFind) {
		for (final ICard cardInRepository : m_repository) {
			if (cardInRepository.getId() == idToFind) {
				return Optional.ofNullable(cardInRepository);
			}
		}
		return Optional.empty();
	}

	@Override
	public int getCursor()
	{
		return m_cursor;
	}

	@Override
	public ICard next()
	{
		final int nextCursorPosition = m_cursor + 1;
		final int repositorySize = m_repository.size();
		if (nextCursorPosition >= repositorySize) {
			throw new IndexOutOfBoundsException("Requested cursor size is bigger than the repository. Requested: "+nextCursorPosition+", repository size: "+repositorySize);
		}
		m_cursor++;
		return m_repository.get(nextCursorPosition);
	}

	@Override
	public ICard previous()
	{
		final int nextCursorPosition = m_cursor - 1;
		if (nextCursorPosition <= 0) {
			throw new IndexOutOfBoundsException("Requested cursor size is negative or equals zero. Requested: "+nextCursorPosition);
		}
		m_cursor--;
		return m_repository.get(nextCursorPosition);
	}

	@Override
	public Iterator<ICard> iterator()
	{
		return m_repository.iterator();
	}
	
	
	
}
