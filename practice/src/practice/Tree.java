package practice;
/*
 * @author Abdsaleh
 */
public class Tree
{
	private int treeAge;
	private String treeType;
	private String color;
	
	public Tree()
	{
		
	}

	@Override
	public String toString() {
		return "Tree{" + "treeAge=" + treeAge + ", treeType=" + treeType + ", color=" + color + '}';
	}

	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}

	public void setTreeType(String treeType) {
		this.treeType = treeType;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Tree(int treeAge,String treeType,String color)
	{
		this.treeType = treeType;
		this.treeAge = treeAge;
		this.color = color;
	}

	public int getTreeAge() {
		return treeAge;
	}

	public String getTreeType() {
		return treeType;
	}

	public String getColor() {
		return color;
	}
}
