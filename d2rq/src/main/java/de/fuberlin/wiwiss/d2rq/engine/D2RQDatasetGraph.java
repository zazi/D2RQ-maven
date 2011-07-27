package de.fuberlin.wiwiss.d2rq.engine;

import java.util.Iterator;

import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.shared.Lock;
import com.hp.hpl.jena.shared.LockNone;
import com.hp.hpl.jena.sparql.core.DatasetGraph;
import com.hp.hpl.jena.sparql.core.Quad;
import com.hp.hpl.jena.sparql.util.Context;
import com.hp.hpl.jena.util.iterator.NullIterator;

import de.fuberlin.wiwiss.d2rq.GraphD2RQ;

/**
 * A DatasetGraph that has a single GraphD2RQ as its default
 * graph and no named graphs.
 * 
 * TODO: implement method stubs at the bottom of the class
 * 
 * @author Richard Cyganiak (richard@cyganiak.de)
 * @author zazi (http://github.com/zazi)
 */
public class D2RQDatasetGraph implements DatasetGraph {
	private final static Lock LOCK_INSTANCE = new LockNone();
	
	private final GraphD2RQ graph;
	
	public D2RQDatasetGraph(GraphD2RQ graph) {
		this.graph = graph;
	}
	
	public boolean containsGraph(Node graphNode) {
		return false;
	}

	public Graph getDefaultGraph() {
		return graph;
	}

	public Graph getGraph(Node graphNode) {
		return null;
	}

	public Lock getLock() {
		return LOCK_INSTANCE;
	}

	public Iterator listGraphNodes() {
		return NullIterator.instance();
	}

	@Override
	public long size()
	{
		return 0;	// Just default graph
	}

	public void close() {
		graph.close();
	}

	@Override
	public void add(Quad arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGraph(Node arg0, Graph arg1)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Quad arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Node arg0, Node arg1, Node arg2, Node arg3)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(Quad arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAny(Node arg0, Node arg1, Node arg2, Node arg3)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterator<Quad> find()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Quad> find(Quad arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Quad> find(Node arg0, Node arg1, Node arg2, Node arg3)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Quad> findNG(Node arg0, Node arg1, Node arg2, Node arg3)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Context getContext()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeGraph(Node arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDefaultGraph(Graph arg0)
	{
		// TODO Auto-generated method stub
		
	}
}
