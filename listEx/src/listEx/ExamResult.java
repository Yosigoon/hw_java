package listEx;

public class ExamResult implements Comparable<ExamResult> {

	private String name;
	private int kor;
	private int eng;
	private int mat;

	public ExamResult(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	@Override
	public String toString() {
		return "ExamResult [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}

	@Override
	public int compareTo(ExamResult other) {
		// TODO Auto-generated method stub
		return (other.kor + other.eng + other.mat) - (this.kor + this.eng + this.mat);
	}

}
