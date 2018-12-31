package org.koenigkatze.freebooters.collection.testdata;

import org.koenigkatze.freebooters.collection.card.healthbar.HealthBarBuilder;
import org.koenigkatze.freebooters.collection.card.healthbar.IHealthBar;

public final class HealthBarTestDataFactory
{

	public static IHealthBar createUnknownHealthBar()
	{
		return HealthBarBuilder.getInstance().build();
	}

}
