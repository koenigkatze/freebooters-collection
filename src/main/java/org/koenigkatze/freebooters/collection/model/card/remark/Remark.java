package org.koenigkatze.freebooters.collection.model.card.remark;

import org.koenigkatze.freebooters.collection.model.card.CardConst;

public class Remark implements IRemark
{
	private final String m_remark;

	public Remark(String remark)
	{
		m_remark = remark;
	}

	public static IRemark createUnknownRemark()
	{
		return new Remark(CardConst.UNKNOWN_REMARK);
	}

	public String getM_remark()
	{
		return m_remark;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m_remark == null) ? 0 : m_remark.hashCode());
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
		Remark other = (Remark) obj;
		if (m_remark == null)
		{
			if (other.m_remark != null)
				return false;
		} else if (!m_remark.equals(other.m_remark))
			return false;
		return true;
	}
	
}
