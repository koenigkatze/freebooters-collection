package org.koenigkatze.freebooters.collection.model.card.attribute;

import java.util.Objects;

public final class AttributeSetBuilder
{
	private static final int ATTRIBUTE_UNKOWN_VALUE = -1;
	
	private IAttribute m_builderLegs;
	private IAttribute m_builderHead;
	private IAttribute m_builderLowerTorso;
	private IAttribute m_builderArmRight;
	private IAttribute m_builderArmLeft;
	private IAttribute m_builderTorso;

	AttributeSetBuilder()
	{
		m_builderLegs = new Attribute(ATTRIBUTE_UNKOWN_VALUE, ATTRIBUTE_UNKOWN_VALUE);
		m_builderHead = new Attribute(ATTRIBUTE_UNKOWN_VALUE, ATTRIBUTE_UNKOWN_VALUE);
		m_builderLowerTorso = new Attribute(ATTRIBUTE_UNKOWN_VALUE, ATTRIBUTE_UNKOWN_VALUE);
		m_builderArmRight = new Attribute(ATTRIBUTE_UNKOWN_VALUE, ATTRIBUTE_UNKOWN_VALUE);
		m_builderArmLeft = new Attribute(ATTRIBUTE_UNKOWN_VALUE, ATTRIBUTE_UNKOWN_VALUE);
		m_builderTorso = new Attribute(ATTRIBUTE_UNKOWN_VALUE, ATTRIBUTE_UNKOWN_VALUE);
	}
	
	public static AttributeSetBuilder getInstance() {
		return new AttributeSetBuilder();
	}
	
	public AttributeSetBuilder withLegs(final IAttribute legs)
	{
		m_builderLegs = Objects.requireNonNull(legs);
		return this;
	}

	public AttributeSetBuilder withHead(final IAttribute role)
	{
		m_builderHead = Objects.requireNonNull(role);
		return this;
	}

	public AttributeSetBuilder withLowerTorso(final IAttribute lowerTorso)
	{
		m_builderLowerTorso = Objects.requireNonNull(lowerTorso);
		return this;
	}

	public AttributeSetBuilder withArmRight(final IAttribute armRight)
	{
		m_builderArmRight = Objects.requireNonNull(armRight);
		return this;
	}

	public AttributeSetBuilder withArmLeft(final IAttribute armLeft)
	{
		m_builderArmLeft = Objects.requireNonNull(armLeft);
		return this;
	}

	public AttributeSetBuilder withTorse(final IAttribute torso)
	{
		m_builderTorso = Objects.requireNonNull(torso);
		return this;
	}

	public IAttributeSet build()
	{
		return new AttributeSet(
				m_builderLegs, 
				m_builderHead, 
				m_builderLowerTorso, 
				m_builderArmRight, 
				m_builderArmLeft, 
				m_builderTorso);
	}
}
