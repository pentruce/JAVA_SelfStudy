package WhiteBoard;
//KOPO_15
public class SimpleMultiThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 100; i++) {
			System.out.println(String.format(OUTPUT_TEMPLATE, threadName, i));
		}
	}

	// output template
	private static final String OUTPUT_TEMPLATE = "Printing [%s][%dtimes]";

	// Thread
	public final String threadName;

	public SimpleMultiThread(String threadName) {
		this.threadName = threadName;

	}

	public static void main(String[] args) {
		SimpleMultiThread Runnable1 = new SimpleMultiThread("thread_unu");
		SimpleMultiThread Runnable2 = new SimpleMultiThread("thread_doi");
		SimpleMultiThread Runnable3 = new SimpleMultiThread("thread_trei");
		SimpleMultiThread Runnable4 = new SimpleMultiThread("thread_patru");

		Thread thread_unu = new Thread(Runnable1);
		Thread thread_doi = new Thread(Runnable2);
		Thread thread_trei = new Thread(Runnable3);
		Thread thread_patru = new Thread(Runnable4);

		thread_unu.start();
		thread_doi.start();
		thread_trei.start();
		thread_patru.start();

	}
}
