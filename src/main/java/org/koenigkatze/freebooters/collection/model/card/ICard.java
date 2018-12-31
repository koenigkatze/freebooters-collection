package org.koenigkatze.freebooters.collection.model.card;

import org.koenigkatze.freebooters.collection.model.card.attribute.IAttributeSet;
import org.koenigkatze.freebooters.collection.model.card.fraction.EFractionType;
import org.koenigkatze.freebooters.collection.model.card.healthbar.IHealthBar;
import org.koenigkatze.freebooters.collection.model.card.remark.IRemark;
import org.koenigkatze.freebooters.collection.model.card.role.ERoleType;

public interface ICard extends Comparable<ICard>
{
	
	long getId();

	String getTitle();

	ERoleType getRole();

	EFractionType getFraction();

	IAttributeSet getAttributeSet();

	IHealthBar getHeathBar();

	IRemark getRemark();

}