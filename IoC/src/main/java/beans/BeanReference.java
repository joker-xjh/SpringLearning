package beans;

//保存引用，bean的引用

public class BeanReference {
	
	private String name;
	
	private Object bean;
	
	public BeanReference(String name) {
		this.name = name;
	}
	
	public Object getBean() {
		return bean;
	}
	
	public void setBean(Object bean) {
		this.bean = bean;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

}
