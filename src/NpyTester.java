import jnpy.Npy;

public class NpyTester {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path = "resources/donald_trump.model.concat.npy";
		
		Npy npy = new Npy(path);

		double[] sampleData = npy.doubleElements();
		
		for (double f : sampleData) {
			System.out.println(f);
		}
	}

}
