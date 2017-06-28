import jnpy.Npy;

public class NpyTester {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path = "resources/sample.npy";
		
		Npy npy = new Npy(path);

		float[] sampleData = npy.floatElements();
		
		for (float f : sampleData) {
			System.out.println(f);
		}
	}

}
