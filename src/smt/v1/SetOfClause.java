package smt.v1;

import java.util.Vector;

public class SetOfClause {

	private Vector<Clause> clauses;
	
	public SetOfClause()
	{
		clauses= new Vector<Clause>();
	}

	public void addClause(Clause c)
	{
		for(int i=0; i<c.relations.size(); i++)
		{
			c.relations.get(i).usedForClause=true;
		}
		clauses.add(c);
		
	}
	
	public void removeClause(Clause c)
	{
		clauses.remove(c);
	}
	
	public void removeClause(int i)
	{
		clauses.remove(i);
	}

	@Override
	public String toString() {
		String res="(";
		for (int i=0; i<clauses.size(); i++)
		{
			res+=clauses.get(i).toString();
			if(i+1<clauses.size())
				res+=") + (";
		}
		res+=")";
		return res;
	}
	
	
	
	
}
