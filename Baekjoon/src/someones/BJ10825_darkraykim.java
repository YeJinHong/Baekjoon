package someones;

import java.io.*;
import java.util.*;

//comparable을 구현한 사례.
//Comparator-Arrays.sort, Comparable-Collections.sort  
//각 케이스에 대한 compareTo 메소드의 리턴값을 1, -1로 직접 지정함으로 불필요한 계산을 줄이는 효과가 있으나
//코드가 길어지는 단점이 있음.
public class BJ10825_darkraykim {
	public static void main(String[] args) throws Exception, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int StNum = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		List<Student> students = new ArrayList<>();
		
		for(int i=0; i<StNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			students.add(new Student(st.nextToken(), Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
		}
		
		Collections.sort(students);
		
		for(Student std : students) {
			sb.append(std.name).append('\n');
		}
		System.out.println(sb.toString());		
	}
}
class Student implements Comparable<Student>{
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	Student(){}
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	@Override
	public int compareTo(Student me) {
		//음수일 때 순서 바뀐다.
		
		if(me.kor > kor)//내림차순
		{
			return 1;
		}
		else if(me.kor == kor) 
		{
			if(me.eng < eng) //오름차순
			{
				return 1;
			}
			else if(me.eng == eng)
			{
				if(me.math > math)
				{
					return 1;
				}
				else if(me.math == math)
				{
					return name.compareTo(me.name);
				}
				else
				{
					return -1;
				}
			}
			else
			{
				return -1;
			}
		}
		else
		{
			return -1;
		}
	}
}