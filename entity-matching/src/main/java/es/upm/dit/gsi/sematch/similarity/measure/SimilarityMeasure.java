package es.upm.dit.gsi.sematch.similarity.measure;


import es.upm.dit.gsi.sematch.similarity.Similarity;

public abstract class SimilarityMeasure implements Similarity{

	protected double weight;
	protected String label;	

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
