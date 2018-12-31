package org.koenigkatze.freebooters.collection.card.healthbar;

import java.util.List;

final class HealthBar implements IHealthBar
{

	private final List<IHealthBarZone> m_healthBarZones;

	public HealthBar(final List<IHealthBarZone> m_healthBarZones)
	{
		super();
		this.m_healthBarZones = m_healthBarZones;
	}

	@Override
	public List<IHealthBarZone> getHealthBarZones()
	{
		return m_healthBarZones;
	}

	public static HealthBarBuilder builder()
	{
		return new HealthBarBuilder();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m_healthBarZones == null) ? 0 : m_healthBarZones.hashCode());
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
		final HealthBar other = (HealthBar) obj;
		if (m_healthBarZones == null)
		{
			if (other.m_healthBarZones != null)
				return false;
		} else if (!m_healthBarZones.equals(other.m_healthBarZones))
			return false;
		return true;
	}

}
