package PackOCA01JavaBasics.StudyClass65Annotation;

@interface InformacaoAula {

	String autor();
	
	int aulaNumero();
	
	String blog() default "http://google.com";
	
	String site() default "http://google.com";
}
