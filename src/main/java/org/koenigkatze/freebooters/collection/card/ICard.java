package org.koenigkatze.freebooters.collection.card;

import org.koenigkatze.freebooters.collection.card.attribute.IAttributeSet;
import org.koenigkatze.freebooters.collection.card.fraction.EFractionType;
import org.koenigkatze.freebooters.collection.card.healthbar.IHealthBar;
import org.koenigkatze.freebooters.collection.card.remark.IRemark;
import org.koenigkatze.freebooters.collection.card.role.ERoleType;

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