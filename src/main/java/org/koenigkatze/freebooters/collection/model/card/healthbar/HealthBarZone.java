package org.koenigkatze.freebooters.collection.model.card.healthbar;

final class HealthBarZone implements IHealthBarZone
{
	private final int m_value;
	private final int m_extend;

	public HealthBarZone(final int m_value, final int m_extend)
	{
		super();
		this.m_value = m_value;
		this.m_extend = m_extend;
	}

	@Override
	public int getValue()
	{
		return m_value;
	}

	@Override
	public int getExtend()
	{
		return m_extend;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + m_extend;
		result = prime * result + m_value;
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
		final HealthBarZone other = (HealthBarZone) obj;
		if (m_extend != other.m_extend)
			return false;
		if (m_value != other.m_value)
			return false;
		return true;
	}

}
