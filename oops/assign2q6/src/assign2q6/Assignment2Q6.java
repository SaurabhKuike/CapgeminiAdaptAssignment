package assign2q6;

abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	System.out.println("this is Filepersistance");
		return null;
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	System.out.println("this is DatabasePersistance");
		return null;
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
    	FilePersistence s=new FilePersistence();
    	DatabasePersistence x=new DatabasePersistence();
    	s.persist();
    	x.persist();
    }
}

