public class singleton {
    
    private static singleton instance;
    private singleton() {}
    synchronized static singleton getSingleInstance() {
        if (instance == null) {
             instance = new singleton();
            }
        return instance;
    }
    
    
    public static void main(String[] args) {
         singleton obj = singleton.getSingleInstance();

    }
}


