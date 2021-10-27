package PackOCP13GenericsAndCollections.projectSort.InterfaceComparable;

public class Estudante implements Comparable<Estudante>{

    int code;  
    String name;  
    int age;  
    
    Estudante(int code,String name,int age){  
    this.code=code;  
    this.name=name;  
    this.age=age;  
    }  
      
    @Override
	public String toString() {
		return "Estudante [code=" + code + ", name=" + name + ", age=" + age + "]";
	}

	public int compareTo(Estudante st){  
    if(this.age==st.age)  
    return 0;  
    else if(this.age>st.age)  
    return 1;  
    else  
    return -1;  
    }  
    

}
