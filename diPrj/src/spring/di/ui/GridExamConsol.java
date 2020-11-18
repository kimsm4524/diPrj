package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsol implements ExamConsole {

	private Exam exam;
	
	public GridExamConsol() {
		// TODO Auto-generated constructor stub
	}

	@Override
		public void setExam(Exam exam) {
			// TODO Auto-generated method stub
			this.exam = exam;
		}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("total is %d, avg is %f\n",exam.total(),exam.avg());

	}

	@Override
	public void setter(Exam exam) {
		// TODO Auto-generated method stub
		
	}

}
