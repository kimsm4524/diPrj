package spring.di;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsol;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		/* 스프링에게 지시하는 방법으로 코드를 변
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsol();

		console.setter(exam);
		*/
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");

		//ExamConsole console= (ExamConsole)context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		//setting.xml 즉 지시서에서의 변경으로 안에 있는 Dependency injection을 시행
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		console.print();
//		List<Exam> exams = new ArrayList<>();
//		exams.add(new NewlecExam(1,1,1,1));
//		for(Exam e: exams)
//			System.out.println(e);
		List<Exam> exams = (List<Exam>)context.getBean("exams");//setting에서 exams를 가져온다.
		for(Exam e: exams)
			System.out.println(e);
		
		
	}
}
