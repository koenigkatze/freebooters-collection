package org.koenigkatze.freebooters.collection.card.attribute;

final class Attribute implements IAttribute 
{
	private final int m_firstValue;
	private final int m_secondValue;

	Attribute(final int m_firstValue, final int m_secondValue)
	{
		super();
		this.m_firstValue = m_firstValue;
		this.m_secondValue = m_secondValue;
	}
	
	@Override
	public int getFirstValue()
	{
		return m_firstValue;
	}

	@Override
	public int getSecondValue()
	{
		return m_secondValue;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + m_firstValue;
		result = prime * result + m_secondValue;
		return result;
	}

	@Override
	public boolean equals(final Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Attribute other = (Attribute) obj;
		if (m_firstValue != other.m_firstValue)
			return false;
		if (m_secondValue != other.m_secondValue)
			return false;
		return true;
	}
	
	
	
}
