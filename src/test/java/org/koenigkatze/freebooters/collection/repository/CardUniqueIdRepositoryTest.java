package org.koenigkatze.freebooters.collection.repository;

import static org.junit.Assert.fail;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.koenigkatze.freebooters.collection.card.ICard;
import org.koenigkatze.freebooters.collection.repository.ICardRepository;
import org.koenigkatze.freebooters.collection.repository.ICardRepositoryFactory;
import org.koenigkatze.freebooters.collection.testdata.CardTestDataFactory;

public class CardUniqueIdRepositoryTest
{

	private static final long UNKNOWN_CARD_1_ID = 1L;
	private static final long UNKNOWN_CARD_2_ID = 2L;
	private static ICardRepository s_subjectUnderTest;
	private static ICard s_unknownCard_1;
	private static ICard s_unknownCard_2;
	private static ICard s_duplicateCardToCard_1;

	@Before
	public void executedBeforeEachClass()
	{
		s_subjectUnderTest = ICardRepositoryFactory.createUniqueIdCardRepository();
		s_unknownCard_1 = CardTestDataFactory.createUnknownCardWithCertainId(UNKNOWN_CARD_1_ID);
		s_unknownCard_2 = CardTestDataFactory.createUnknownCardWithCertainId(UNKNOWN_CARD_2_ID);
		s_duplicateCardToCard_1 = CardTestDataFactory.createUnknownCardWithCertainId(UNKNOWN_CARD_1_ID);
	}

	@Test
	public void testThatAddingWithValidValueWillNotResultInAnException()
	{
		try
		{
			s_subjectUnderTest.add(s_unknownCard_1);
		} catch (final RuntimeException e)
		{
			fail();
		}

	}

	@Test(expected = IllegalArgumentException.class)
	public void testThatAddingDuplicateElementWillResultInIllegalArgumentException()
	{
		s_subjectUnderTest.add(s_unknownCard_1);
		s_subjectUnderTest.add(s_duplicateCardToCard_1);
	}
	
	@Test
	public void testThatAddingAndRetrievingWithSameIdGetsSameCard()
	{
			s_subjectUnderTest.add(s_unknownCard_1);
			s_subjectUnderTest.add(s_unknownCard_2);
			Optional<ICard> receivedCard = s_subjectUnderTest.getById(s_unknownCard_1.getId());
			
			if (receivedCard.isPresent()) {
				Assert.assertEquals(s_unknownCard_1, receivedCard.get());
			} else {
				fail();
			}
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testThatCallingNextWithNoElementsResultsInException()
	{
		s_subjectUnderTest.next();
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testThatCallingNextWithNoElementsLeftResultsInException()
	{
		s_subjectUnderTest.add(s_unknownCard_1);
		s_subjectUnderTest.next();
		s_subjectUnderTest.next();
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testThatCallingPreviousWithNoElementsResultsInException()
	{
		s_subjectUnderTest.previous();
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testThatCallingPreviousWithNoElementsLeftResultsInException()
	{
		s_subjectUnderTest.add(s_unknownCard_1);
		s_subjectUnderTest.next();
		s_subjectUnderTest.previous();
	}
	
	@Test
	public void testThatThatCard1ComesFirstIfAddedFirstly()
	{
		s_subjectUnderTest.add(s_unknownCard_1);
		s_subjectUnderTest.add(s_unknownCard_2);
		
		final ICard hopefullyCard_1 = s_subjectUnderTest.next();
		Assert.assertEquals(s_unknownCard_1, hopefullyCard_1);
		
	}
	
	@Test
	public void testThatThatCard2FollowsAfterCard1IfAddedInThisOrder()
	{
		s_subjectUnderTest.add(s_unknownCard_1);
		s_subjectUnderTest.add(s_unknownCard_2);
		s_subjectUnderTest.next();
		
		final ICard hopefullyCard_2 = s_subjectUnderTest.next();
		Assert.assertEquals(s_unknownCard_2, hopefullyCard_2);
	}

}
