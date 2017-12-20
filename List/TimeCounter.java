package List;

public class TimeCounter {

	  public static long measure() {
	        long st, en;
	        st = System.nanoTime();
	        for (int i = 0; i < 1000000; i++) {
	            ;
	        }
	        en = System.nanoTime();
	        return en - st;
	    }
	    public static void main(String[] args) {
	        System.out.println("cold start time " + String.format("%,12d",measure()) + " ns");
	        System.out.println("warmed JRE time " + String.format("%,12d",measure()) + " ns");
	    }
	
}
