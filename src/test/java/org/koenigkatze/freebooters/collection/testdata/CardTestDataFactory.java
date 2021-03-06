package org.koenigkatze.freebooters.collection.testdata;

import org.koenigkatze.freebooters.collection.model.card.CardBuilder;
import org.koenigkatze.freebooters.collection.model.card.CardConst;
import org.koenigkatze.freebooters.collection.model.card.ICard;
import org.koenigkatze.freebooters.collection.model.card.remark.Remark;

public class CardTestDataFactory
{
	

	public static ICard createUnknownCardWithCertainId(final long idToSet)
	{
		return CardBuilder.getInstance()
				.withId(idToSet)
				.withTitle(CardConst.UNKNOWN_TITLE)
				.withFraction(CardConst.UNKNOWN_FRACTION)
				.withRole(CardConst.UNKNOWN_ROLE)
				.withAttributes(AttributeSetTestDataFactory.createUnknownAttributeSet())
				.withHealthBar(HealthBarTestDataFactory.createUnknownHealthBar())
				.withRemark(Remark.createUnknownRemark())
				.build();
	}

}
