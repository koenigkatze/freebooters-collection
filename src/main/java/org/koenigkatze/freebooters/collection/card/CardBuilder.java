package org.koenigkatze.freebooters.collection.card;

import java.util.Objects;

import org.koenigkatze.freebooters.collection.card.attribute.AttributeSetBuilder;
import org.koenigkatze.freebooters.collection.card.attribute.IAttributeSet;
import org.koenigkatze.freebooters.collection.card.fraction.EFractionType;
import org.koenigkatze.freebooters.collection.card.healthbar.HealthBarBuilder;
import org.koenigkatze.freebooters.collection.card.healthbar.IHealthBar;
import org.koenigkatze.freebooters.collection.card.remark.IRemark;
import org.koenigkatze.freebooters.collection.card.remark.Remark;
import org.koenigkatze.freebooters.collection.card.role.ERoleType;

public class CardBuilder
{
	private long m_builderId;
	private String m_builderTitle;
	private ERoleType m_builderRole;
	private EFractionType m_builderFraction;
	private IAttributeSet m_builderAttributeSet;
	private IHealthBar m_builderHealthBar;
	private IRemark m_builderRemark;

	public CardBuilder()
	{
		m_builderId = -1L;
		m_builderTitle = CardConst.UNKNOWN_TITLE;
		m_builderRole = ERoleType.UNKNOWN_ROLE;
		m_builderFraction = EFractionType.UNKNOWN_FRACTION;
		m_builderAttributeSet = AttributeSetBuilder.getInstance().build();
		m_builderHealthBar = HealthBarBuilder.getInstance().build();
		m_builderRemark = Remark.createUnknownRemark();
	}
	
	public static CardBuilder getInstance() {
		return new CardBuilder();
	}
	
	public CardBuilder withId(final long id) {
		m_builderId = Objects.requireNonNull(id);
		return this;
	}

	public CardBuilder withTitle(final String title)
	{
		m_builderTitle = Objects.requireNonNull(title);
		return this;
	}

	public CardBuilder withRole(final ERoleType role)
	{
		m_builderRole = Objects.requireNonNull(role);
		return this;
	}

	public CardBuilder withFraction(final EFractionType fraction)
	{
		m_builderFraction = Objects.requireNonNull(fraction);
		return this;
	}

	public CardBuilder withAttributes(final IAttributeSet attributeSet)
	{
		m_builderAttributeSet = Objects.requireNonNull(attributeSet);
		return this;
	}

	public CardBuilder withHealthBar(final IHealthBar healthBar)
	{
		m_builderHealthBar = Objects.requireNonNull(healthBar);
		return this;
	}

	public CardBuilder withRemark(final IRemark remark)
	{
		m_builderRemark = Objects.requireNonNull(remark);
		return this;
	}

	public ICard build()
	{
		return new Card(
				m_builderId,
				m_builderTitle, 
				m_builderRole, 
				m_builderFraction, 
				m_builderAttributeSet, 
				m_builderHealthBar,
				m_builderRemark);
	}

}
