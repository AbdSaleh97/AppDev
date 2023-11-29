package practice;
/*
 * @author Abdsaleh
 */
public class Engine
{
	private int size;
	private int bhp;
	private String engineName;
	
	public Engine()
	{
		
	}
	
	public Engine(int size, int bhp, String engineName)
	{
		this.size = size;
		this.bhp = bhp;
		this.engineName = engineName;
	}

	@Override
	public String toString() {
		return "Engine{" + "size=" + size + ", bhp=" + bhp + ", engineName=" + engineName + '}';
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setBhp(int bhp) {
		this.bhp = bhp;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	public int getSize() {
		return size;
	}

	public int getBhp() {
		return bhp;
	}

	public String getEngineName() {
		return engineName;
	}


}

