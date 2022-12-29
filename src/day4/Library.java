package day4;

public class Library {
	public Book option(int a) {
		switch (a) {
			case 1: {
				Book java = new Book("Java", "Aravinth", 500);
	
				return java;
			}
			case 2: {
				Book python = new Book("Python", "Zeeba", 800);
	
				return python;
			}
			case 3: {
				Book html = new Book("HTML", "Nivethitha", 800);
	
				return html;
			}
			case 4: {
				Book sql = new Book("SQL", "Ciril", 900);
	
				return sql;
			}
			default: {
				System.out.println("Invalid Selection");
				break; 
			}
		}
		return null;
		
	}

}

