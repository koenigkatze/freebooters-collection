package org.koenigkatze.freebooters.collection.repository;

public interface ICardRepositoryFactory
{
	public static ICardRepository createUniqueIdCardRepository()
	{
		return new UniqueIdCardRepository();
	}
}
