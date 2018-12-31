package org.koenigkatze.freebooters.collection.testdata;

import org.koenigkatze.freebooters.collection.card.attribute.AttributeSetBuilder;
import org.koenigkatze.freebooters.collection.card.attribute.IAttributeSet;

public final class AttributeSetTestDataFactory
{

	public static IAttributeSet createUnknownAttributeSet()
	{
		return AttributeSetBuilder.getInstance().build();
	}

}
