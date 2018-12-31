package org.koenigkatze.freebooters.collection.card.attribute;

final class AttributeSet implements IAttributeSet
{
	private final IAttribute m_legs;
	private final IAttribute m_head;
	private final IAttribute m_lowerTorso;
	private final IAttribute m_armRight;
	private final IAttribute m_armLeft;
	private final IAttribute m_torso;

	AttributeSet(
			final IAttribute m_legs, 
			final IAttribute m_head, 
			final IAttribute m_lowerTorso,
			final IAttribute m_armRight, 
			final IAttribute m_armLeft, 
			final IAttribute m_torso)
	{
		super();
		this.m_legs = m_legs;
		this.m_head = m_head;
		this.m_lowerTorso = m_lowerTorso;
		this.m_armRight = m_armRight;
		this.m_armLeft = m_armLeft;
		this.m_torso = m_torso;
	}

	public static AttributeSetBuilder builder()
	{
		return new AttributeSetBuilder();
	}

	@Override
	public IAttribute getLegs()
	{
		return m_legs;
	}

	@Override
	public IAttribute getHead()
	{
		return m_head;
	}

	@Override
	public IAttribute getLowerTorso()
	{
		return m_lowerTorso;
	}

	@Override
	public IAttribute getArmRight()
	{
		return m_armRight;
	}

	@Override
	public IAttribute getArmLeft()
	{
		return m_armLeft;
	}

	@Override
	public IAttribute getTorso()
	{
		return m_torso;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m_armLeft == null) ? 0 : m_armLeft.hashCode());
		result = prime * result + ((m_armRight == null) ? 0 : m_armRight.hashCode());
		result = prime * result + ((m_head == null) ? 0 : m_head.hashCode());
		result = prime * result + ((m_legs == null) ? 0 : m_legs.hashCode());
		result = prime * result + ((m_lowerTorso == null) ? 0 : m_lowerTorso.hashCode());
		result = prime * result + ((m_torso == null) ? 0 : m_torso.hashCode());
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
		final AttributeSet other = (AttributeSet) obj;
		if (m_armLeft == null)
		{
			if (other.m_armLeft != null)
				return false;
		} else if (!m_armLeft.equals(other.m_armLeft))
			return false;
		if (m_armRight == null)
		{
			if (other.m_armRight != null)
				return false;
		} else if (!m_armRight.equals(other.m_armRight))
			return false;
		if (m_head == null)
		{
			if (other.m_head != null)
				return false;
		} else if (!m_head.equals(other.m_head))
			return false;
		if (m_legs == null)
		{
			if (other.m_legs != null)
				return false;
		} else if (!m_legs.equals(other.m_legs))
			return false;
		if (m_lowerTorso == null)
		{
			if (other.m_lowerTorso != null)
				return false;
		} else if (!m_lowerTorso.equals(other.m_lowerTorso))
			return false;
		if (m_torso == null)
		{
			if (other.m_torso != null)
				return false;
		} else if (!m_torso.equals(other.m_torso))
			return false;
		return true;
	}

}
