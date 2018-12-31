package org.koenigkatze.freebooters.collection.model.card.healthbar;

import java.util.ArrayList;
import java.util.List;

public final class HealthBarBuilder
{
	private final List<IHealthBarZone> m_builderHealthBarZones;

	HealthBarBuilder()
	{
		super();
		m_builderHealthBarZones = new ArrayList<>();
	}
	
	public static HealthBarBuilder getInstance() {
		return new HealthBarBuilder();
	}
	
	
	public void addHealthBarZone(final int value, final int extend) {
		m_builderHealthBarZones.add(new HealthBarZone(value, extend));
	}
	
	public IHealthBar build() {
		return new HealthBar(m_builderHealthBarZones);
	}
}
