package org.koenigkatze.freebooters.collection.testdata;

import org.koenigkatze.freebooters.collection.model.card.healthbar.HealthBarBuilder;
import org.koenigkatze.freebooters.collection.model.card.healthbar.IHealthBar;

public final class HealthBarTestDataFactory
{

	public static IHealthBar createUnknownHealthBar()
	{
		return HealthBarBuilder.getInstance().build();
	}

}
