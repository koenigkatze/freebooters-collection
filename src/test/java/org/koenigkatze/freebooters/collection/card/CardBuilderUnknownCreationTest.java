package org.koenigkatze.freebooters.collection.card;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.koenigkatze.freebooters.collection.model.card.CardBuilder;
import org.koenigkatze.freebooters.collection.model.card.CardConst;
import org.koenigkatze.freebooters.collection.model.card.ICard;
import org.koenigkatze.freebooters.collection.model.card.attribute.AttributeSetBuilder;
import org.koenigkatze.freebooters.collection.model.card.attribute.IAttributeSet;
import org.koenigkatze.freebooters.collection.model.card.healthbar.IHealthBar;
import org.koenigkatze.freebooters.collection.model.card.remark.IRemark;
import org.koenigkatze.freebooters.collection.model.card.remark.Remark;
import org.koenigkatze.freebooters.collection.testdata.HealthBarTestDataFactory;

public class CardBuilderUnknownCreationTest
{
	
	private static ICard s_subjectUnderTest;
	
	@Before
	public void executedBeforeEachClass() {
		s_subjectUnderTest = CardBuilder.getInstance().build();
	}

	@Test
	public void testThatNoTitleWillResultInUnknownTitle()
	{
		Assert.assertEquals(s_subjectUnderTest.getTitle(), CardConst.UNKNOWN_TITLE);
	}
	
	@Test
	public void testThatNoRoleWillResultInUnknownRole() {
		Assert.assertEquals(s_subjectUnderTest.getRole(), CardConst.UNKNOWN_ROLE);
	}
	
	@Test
	public void testThatNoFractionWillResultInUnknownFraction() {
		Assert.assertEquals(s_subjectUnderTest.getFraction(), CardConst.UNKNOWN_FRACTION);
	}
	
	@Test
	public void testThatNoAttributesWillResultInUnknownAttributes() {
		final IAttributeSet attributeSet = AttributeSetBuilder.getInstance().build();
		Assert.assertEquals(s_subjectUnderTest.getAttributeSet(), attributeSet);
	}
	
	@Test
	public void testThatNoHealthBarWillResultInUnknownHealthBar() {
		final IHealthBar healthBar = HealthBarTestDataFactory.createUnknownHealthBar();
		Assert.assertEquals(s_subjectUnderTest.getHeathBar(), healthBar);
	}
	
	@Test
	public void testThatNoRemarkWillResultInUnknownRemark() {
		final IRemark remark = Remark.createUnknownRemark();
		Assert.assertEquals(s_subjectUnderTest.getRemark(), remark);
	}
	

}
