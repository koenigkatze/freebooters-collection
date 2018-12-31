package org.koenigkatze.freebooters.collection.card;

import org.koenigkatze.freebooters.collection.card.attribute.IAttributeSet;
import org.koenigkatze.freebooters.collection.card.fraction.EFractionType;
import org.koenigkatze.freebooters.collection.card.healthbar.IHealthBar;
import org.koenigkatze.freebooters.collection.card.remark.IRemark;
import org.koenigkatze.freebooters.collection.card.role.ERoleType;

final class Card implements ICard
{
	private final long m_Id;
	private final String m_title;
	private final ERoleType m_role;
	private final EFractionType m_fraction;
	private final IAttributeSet m_attributeSet;
	private final IHealthBar m_heathBar;
	private final IRemark m_remark;
	
	Card(
			final long id,
			final String title, 
			final ERoleType role, 
			final EFractionType fraction, 
			final IAttributeSet attributeSet,
			final IHealthBar heathBar, 
			final IRemark remark)
	{
		super();
		this.m_Id = id;
		this.m_title = title;
		this.m_role = role;
		this.m_fraction = fraction;
		this.m_attributeSet = attributeSet;
		this.m_heathBar = heathBar;
		this.m_remark = remark;
	}
	
	static CardBuilder builder() {
		return new CardBuilder();
	}
	
	@Override
	public String getTitle()
	{
		return m_title;
	}

	@Override
	public ERoleType getRole()
	{
		return m_role;
	}

	@Override
	public EFractionType getFraction()
	{
		return m_fraction;
	}
	
	@Override
	public IAttributeSet getAttributeSet() {
		return m_attributeSet;
	}


	@Override
	public IHealthBar getHeathBar()
	{
		return m_heathBar;
	}

	@Override
	public IRemark getRemark()
	{
		return m_remark;
	}

	@Override
	public long getId()
	{
		return m_Id;
	}

	@Override
	public int compareTo(final ICard otherCard)
	{
		return Long.valueOf(m_Id).compareTo(otherCard.getId());
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (m_Id ^ (m_Id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (m_Id != other.m_Id)
			return false;
		return true;
	}

}
