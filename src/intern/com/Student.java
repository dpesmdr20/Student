package intern.com;

public class Student {

	private String name;
	private int id,roll, mathScore, phyScore, bioScore, chemScore, engScore,
			totalMarks;

	public Student(int id,String name,int roll,int math,int phy,int bio,int chem,int eng){
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.mathScore = math;
		this.phyScore = phy;
		this.bioScore = bio;
		this.chemScore = chem;
		this.engScore = eng;
	}
	public String getName() {
		return name;
	}

	
	public int getTotalMarks() {
		totalMarks = getMathScore() + getPhyScore() + getBioScore()
				+ getChemScore() + getEngScore();
		return totalMarks;
	}

	public int getId() {
		return id;
	}

	public int getRoll() {
		return roll;
	}
	public int getMathScore() {
		return mathScore;
	}

	public int getPhyScore() {
		return phyScore;
	}

	public int getBioScore() {
		return bioScore;
	}

	public int getChemScore() {
		return chemScore;
	}

	public int getEngScore() {
		return engScore;
	}
}
